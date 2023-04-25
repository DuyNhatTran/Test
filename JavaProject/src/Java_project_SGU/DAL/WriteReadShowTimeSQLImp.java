/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_project_SGU.DAL;

import Java_project_SGU.Exception.InvalidBirthdayException;
import Java_project_SGU.BUS.Customer;
import Java_project_SGU.BUS.Movie;
import Java_project_SGU.BUS.Room;
import Java_project_SGU.BUS.Seat;
import Java_project_SGU.BUS.ShowTime;
import Java_project_SGU.BUS.Staff;
import Java_project_SGU.BUS.TicketClerk;
import Java_project_SGU.BUS.TicketSale;
import Java_project_SGU.BUS.TypeSeat;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class WriteReadShowTimeSQLImp implements WriteReadShowTimeSQLInterface {

    @Override
    public SQLServerDataSource configDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setEncrypt(false); // (1)
        dataSource.setIntegratedSecurity(false); // (2)
        dataSource.setTrustServerCertificate(false);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        dataSource.setDatabaseName(DB_NAME);
        dataSource.setServerName(SERVER);
        dataSource.setPortNumber(PORT);
        return dataSource;
    }

    @Override
    public boolean insertShowTimeToSQL(ShowTime showTime) {
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String insertQuery = "INSERT INTO ShowTime Values(?, ?, ?, ?, ?, ?, ?)";
            var prepareStm = connect.prepareStatement(insertQuery);
            prepareStm.setString(1, showTime.getIdShowTime());
            prepareStm.setString(2, changeDateSQL(showTime.getStartTime()));
            prepareStm.setString(3, showTime.getMovie().getIdMovie());
            prepareStm.setString(4, showTime.getRoom().getIdRoom());
            prepareStm.setString(5, showTime.getMovieFomart());
            prepareStm.setString(6, "0");
            prepareStm.setInt(7, showTime.getTicketPrice());
            return prepareStm.execute();
        } catch (SQLServerException ex) {
            ex.printStackTrace();
            return false;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<ShowTime> readShowTimesFromSQL() {
        ArrayList<ShowTime> listShowTimeSQL = new ArrayList<>();
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String SQLQuery = "SELECT ID_ShowTime, StartTime, MV.ID_Movie,"
                    + " MV.Name, MV.Time, MV.AgeLimit, MV.OpeningDate, MV.Language,"
                    + " MV.country, MV.director, MV.content, MV.typeMovie, MV.producer,"
                    + " MV.isShowing, MV.imageLink, R.ID_Room, R.RowOfChair, "
                    + "R.ColumOfChair, ST.movieFormat, ST.ticketPrice, ST.isChoosen "
                    + "FROM ShowTime ST JOIN Movie MV ON ST.ID_Movie = MV.ID_Movie "
                    + "JOIN Room R ON R.ID_Room = ST.ID_Room WHERE isDeleteST = 0"
                    + " AND MV.isShowing = 1";
            var prepareStm = connect.prepareStatement(SQLQuery);
            var rsSet = prepareStm.executeQuery();
            while (rsSet.next()) {
                String idShowTime = rsSet.getString(1);
                String startDateST = changeDateSTJava(rsSet.getString(2));
                //Movie
                String idMV = rsSet.getString(3);
                String nameMV = rsSet.getString(4);
                int timeMV = Integer.parseInt(rsSet.getString(5));
                int ageLimitMV = Integer.parseInt(rsSet.getString(6));
                String dateMV = changeDateMovie(rsSet.getString(7));
                String languageMV = rsSet.getString(8);
                String countryMV = rsSet.getString(9);
                String directorMV = rsSet.getString(10);
                String contentMV = rsSet.getString(11);
                String typeMV = rsSet.getString(12);
                String producerMV = rsSet.getString(13);
                boolean isShowingMV = rsSet.getBoolean(14);
                String linkImageMV = rsSet.getString(15);
                //Room
                String idRm = rsSet.getString(16);
                int rowChairR = Integer.parseInt(rsSet.getString(17));
                int colChairR = Integer.parseInt(rsSet.getString(18));
                String mVfomart = rsSet.getString(19);
                int ticketPrice = rsSet.getInt(20);
                boolean isChoosen = rsSet.getBoolean(21);
                //init
                Movie movie = new Movie(idMV, nameMV, timeMV,
                        ageLimitMV, dateMV, languageMV,
                        countryMV, producerMV, contentMV, typeMV,
                        directorMV, isShowingMV, linkImageMV);
                Room room = new Room(idRm, rowChairR, colChairR);
                ShowTime showTime = new ShowTime(idShowTime, startDateST, movie,
                        room, mVfomart, ticketPrice, isChoosen);
                listShowTimeSQL.add(showTime);
            }
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (InvalidBirthdayException ex) {
            ex.printStackTrace();
        }
        return listShowTimeSQL;
    }

    @Override
    public ShowTime readBookedShowTimesFromSQL(ShowTime showTime) {
        ShowTime showTimeInit = new ShowTime();
        Room room = new Room();
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String idRoomQuery = showTime.getRoom().getIdRoom();
            String movieFomartQuery = showTime.getMovieFomart();
            String startDateQuery = new SimpleDateFormat("yyyy-MM-dd HH:mm")
                    .format(showTime.getStartTime());
            String getShowTimeQuery = "SELECT ID_ShowTime, ST.StartTime, MV.ID_Movie,"
                    + " MV.Name, MV.Time, MV.AgeLimit, MV.OpeningDate, MV.Language,"
                    + " MV.country, MV.director, MV.content, MV.typeMovie,"
                    + " MV.producer, MV.isShowing, MV.imageLink, R.ID_Room,"
                    + " R.RowOfChair, R.ColumOfChair, R.NumOfVipChair,"
                    + " R.NumOfCoupleChair, ST.movieFormat, ST.ticketPrice, ST.isChoosen FROM "
                    + "ShowTime ST JOIN Movie MV ON ST.ID_Movie = MV.ID_Movie JOIN"
                    + " Room R ON R.ID_Room = ST.ID_Room  WHERE ST.isDeleteST = '0'"
                    + " AND MV.isShowing = '1' AND ST.ID_Room = '" + idRoomQuery + "' AND "
                    + "ST.movieFormat = '" + movieFomartQuery + "' AND ST.StartTime = '"
                    + startDateQuery + "'";
            var prePareStm = connect.prepareStatement(getShowTimeQuery);
            var rsSet = prePareStm.executeQuery();
            while (rsSet.next()) {
                String idShowTime = rsSet.getString(1);
                String startDateST = changeDateSTJava(rsSet.getString(2));
                //Movie
                String idMV = rsSet.getString(3);
                String nameMV = rsSet.getString(4);
                int timeMV = Integer.parseInt(rsSet.getString(5));
                int ageLimitMV = Integer.parseInt(rsSet.getString(6));
                String dateMV = changeDateMovie(rsSet.getString(7));
                String languageMV = rsSet.getString(8);
                String countryMV = rsSet.getString(9);
                String directorMV = rsSet.getString(10);
                String contentMV = rsSet.getString(11);
                String typeMV = rsSet.getString(12);
                String producerMV = rsSet.getString(13);
                boolean isShowingMV = rsSet.getBoolean(14);
                String linkImageMV = rsSet.getString(15);
                //Room
                String idRm = rsSet.getString(16);
                int rowChairR = Integer.parseInt(rsSet.getString(17));
                int colChairR = Integer.parseInt(rsSet.getString(18));
                int numVipChair = Integer.parseInt(rsSet.getString(19));
                int numPairChair = Integer.parseInt(rsSet.getString(20));
                String mVfomart = rsSet.getString(21);
                int ticketPrice = rsSet.getInt(22);
                boolean isChoosen = rsSet.getBoolean(23);

                Movie movie = new Movie(idMV, nameMV, timeMV,
                        ageLimitMV, dateMV, languageMV,
                        countryMV, producerMV, contentMV, typeMV,
                        directorMV, isShowingMV, linkImageMV);

                room = new Room(idRm, rowChairR, colChairR,
                        numPairChair, numVipChair, null);
                room.calcuNormalChair();

                showTimeInit = new ShowTime(idShowTime, startDateST,
                        movie, room, mVfomart, ticketPrice, isChoosen);
            }
            ArrayList<Seat> listSeatST = readSeatCorresSTFromSQL(showTime);

            room.setListSeat(listSeatST);
            showTimeInit.setRoom(room);

            return showTimeInit;
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (InvalidBirthdayException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<Seat> readSeatCorresSTFromSQL(ShowTime showTime) {
        ArrayList<Seat> listSeat = new ArrayList<>();
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String idRoomQuery = showTime.getRoom().getIdRoom();
            String movieFomartQuery = showTime.getMovieFomart();
            String startDateQuery = new SimpleDateFormat("yyyy-MM-dd HH:mm")
                    .format(showTime.getStartTime());
            String getSeatListST = "SELECT t.ID_TypeSeat, t.NameTypeSeat, "
                    + "t.Surcharge, s.ID_Seat, s.Colum, s.Row FROM ShowTime"
                    + " ST JOIN Movie MV ON ST.ID_Movie = MV.ID_Movie JOIN"
                    + " Room R ON R.ID_Room = ST.ID_Room  JOIN Seat s  ON"
                    + " s.ID_Room = R.ID_Room JOIN TypeOfSeat t ON "
                    + "s.ID_TypeSeat = t.ID_TypeSeat WHERE ST.isDeleteST = '0'"
                    + " AND MV.isShowing = '1' AND ST.ID_Room = '" + idRoomQuery + "' AND "
                    + "ST.movieFormat = '" + movieFomartQuery + "' AND ST.StartTime = '"
                    + startDateQuery + "'";
            var prePareStm2 = connect.prepareStatement(getSeatListST);
            var rsSetSeatST = prePareStm2.executeQuery();
            while (rsSetSeatST.next()) {
                //TypeSeat
                String idTypeSeat = rsSetSeatST.getString(1);
                String typeOfSeat = rsSetSeatST.getString(2);
                int surCharge = rsSetSeatST.getInt(3);
                //Seat
                String idSeat = rsSetSeatST.getString(4);
                int colum = rsSetSeatST.getInt(5);
                int row = rsSetSeatST.getInt(6);

                //init TypeSeat
                TypeSeat typeSeat = new TypeSeat(idTypeSeat, typeOfSeat, surCharge);
                //init Seat
                Seat seat = new Seat(idSeat, row, colum, typeSeat, 0);
                listSeat.add(seat);
            }
            return listSeat;
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listSeat;
    }

    private String changeDateSTJava(String dateSQLStr) {
        SimpleDateFormat fomartSQL = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat fomartJava = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        Date dateSQL = new Date();
        try {
            dateSQL = fomartSQL.parse(dateSQLStr);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        String dateJavaStr = fomartJava.format(dateSQL);
        return dateJavaStr;
    }

    private static String changeDateMovie(String date) {
        try {
            SimpleDateFormat fortDateOpingMovie = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat fomartDateSql = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date dateSql = fomartDateSql.parse(date);
            String dateCustomer = fortDateOpingMovie.format(dateSql);
            return dateCustomer;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void setIsDeleteST(String idShowTime) {
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String SQLQuery = "UPDATE ShowTime SET isDeleteST = 1 where ID_ShowTime = ?";
            var prepareStm = connect.prepareStatement(SQLQuery);
            prepareStm.setString(1, idShowTime);
            prepareStm.execute();
        } catch (SQLServerException ex) {
            Logger.getLogger(WriteReadShowTimeSQLImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(WriteReadShowTimeSQLImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateShowTime(ShowTime showTime) {
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String SQLQuery = "UPDATE ShowTime SET StartTime = ?, ID_Movie = ?, ID_Room = ?, movieFormat = ?, ticketPrice = ? where ID_ShowTime = ?";
            var prepareStm = connect.prepareStatement(SQLQuery);
            prepareStm.setString(1, changeDateSQL(showTime.getStartTime()));
            prepareStm.setString(2, showTime.getMovie().getIdMovie());
            prepareStm.setString(3, showTime.getRoom().getIdRoom());
            prepareStm.setString(4, showTime.getMovieFomart());
            prepareStm.setInt(5, showTime.getTicketPrice());
            prepareStm.setString(6, showTime.getIdShowTime());
            prepareStm.executeUpdate();
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private String changeDateSQL(Date date) {
        SimpleDateFormat fomartSQL = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateSQL = fomartSQL.format(date);
        return dateSQL;
    }

    public ArrayList<ShowTime> readListST_CorrespondingWithMovie(String idMovieBooking) {
        ArrayList<ShowTime> listShowTimeSQL = new ArrayList<>();
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String SQLQuery = "SELECT ID_ShowTime, StartTime, MV.ID_Movie,"
                    + " MV.Name, MV.Time, MV.AgeLimit, MV.OpeningDate, MV.Language,"
                    + " MV.country, MV.director, MV.content, MV.typeMovie, MV.producer,"
                    + " MV.isShowing, MV.imageLink, R.ID_Room, R.RowOfChair, "
                    + "R.ColumOfChair, ST.movieFormat, ST.ticketPrice, ST.isChoosen FROM ShowTime ST JOIN"
                    + " Movie MV ON ST.ID_Movie = MV.ID_Movie JOIN Room as "
                    + "R ON R.ID_Room = ST.ID_Room WHERE isDeleteST = 0 AND MV.ID_Movie = ?";
            var prepareStm = connect.prepareStatement(SQLQuery);
            prepareStm.setString(1, idMovieBooking);
            var rsSet = prepareStm.executeQuery();
            while (rsSet.next()) {
                String idShowTime = rsSet.getString(1);
                String startDateST = changeDateSTJava(rsSet.getString(2));
                //Movie
                String idMV = rsSet.getString(3);
                String nameMV = rsSet.getString(4);
                int timeMV = Integer.parseInt(rsSet.getString(5));
                int ageLimitMV = Integer.parseInt(rsSet.getString(6));
                String dateMV = changeDateMovie(rsSet.getString(7));
                String languageMV = rsSet.getString(8);
                String countryMV = rsSet.getString(9);
                String directorMV = rsSet.getString(10);
                String contentMV = rsSet.getString(11);
                String typeMV = rsSet.getString(12);
                String producerMV = rsSet.getString(13);
                boolean isShowingMV = rsSet.getBoolean(14);
                String linkImageMV = rsSet.getString(15);
                //Room
                String idRm = rsSet.getString(16);
                int rowChairR = Integer.parseInt(rsSet.getString(17));
                int colChairR = Integer.parseInt(rsSet.getString(18));
                String mVfomart = rsSet.getString(19);
                int ticketPrice = rsSet.getInt(20);
                boolean isChoosen = rsSet.getBoolean(21);

                //init 
                Movie movie = new Movie(idMV, nameMV, timeMV,
                        ageLimitMV, dateMV, languageMV,
                        countryMV, producerMV, contentMV, typeMV,
                        directorMV, isShowingMV, linkImageMV);
                Room room = new Room(idRm, rowChairR, colChairR);
                ShowTime showTime = new ShowTime(idShowTime, startDateST,
                        movie, room, mVfomart, ticketPrice, isChoosen);
                listShowTimeSQL.add(showTime);
            }
        } catch (SQLServerException ex) {
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (InvalidBirthdayException ex) {
            ex.printStackTrace();
        }
        return listShowTimeSQL;
    }

    public TicketSale getBookingTicketSale(ShowTime showTime, Customer customer) throws ParseException {
        TicketSale ticketSale = new TicketSale();
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            // lấy toàn bộ trường dữ liệu của TicketSale (chỉ lấy 1 dòng)
            String SQLQuery = "SELECT ID_TicketSale, SaleDate, Total, "
                    + "quantityNormal, quantityPair, quantityAllSeat, "
                    + "quantityVip, FROM TicketSale TS JOIN Customer CUS ON "
                    + "TS.ID_Customer = CUS.ID_Customer JOIN Seat S  ON "
                    + "TS.ID_Seat = S.ID_Seat";
            var prepareStm = connect.prepareStatement(SQLQuery);
            prepareStm.setString(1, showTime.getIdShowTime());
            var rsSet = prepareStm.executeQuery();
            String ID_TikcetSale = rsSet.getString(1);
            SimpleDateFormat dateFormat = new SimpleDateFormat();
            String saleDate = changeDateSQL(rsSet.getDate(2));
            Date SaleDate = dateFormat.parse(saleDate);
            int Total = Integer.parseInt(rsSet.getString(3));
            int quantityNormal = Integer.parseInt(rsSet.getString(4));
            int quantityPair = Integer.parseInt(rsSet.getString(5));
            int quantityVIP = Integer.parseInt(rsSet.getString(6));
            int quantityAllSeat = Integer.parseInt(rsSet.getString(7));

            ticketSale.setIdTS(ID_TikcetSale);
            ticketSale.setSaleDate(SaleDate);
            ticketSale.setTotalMoney(Total);
            ticketSale.setShowTime(showTime);
            ticketSale.setCustomer(customer);
            ticketSale.setQuantityNormal(quantityNormal);
            ticketSale.setQuantityPair(quantityPair);
            ticketSale.setQuantityVip(quantityVIP);
            ticketSale.setQuantityAll(quantityAllSeat);
            ticketSale.setListSeat(this.readSeatCorresSTFromSQL(showTime));
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ticketSale;
    }
    
    // lấy id TicketSale co gia tri lon nhat
    public int getMaxIDTicketSale() {
        int max = 0;
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String SQLQuery = "SELECT ID_TicketSale FROM TicketSale";
            var prePareStm = connect.prepareStatement(SQLQuery);
            var rsSet = prePareStm.executeQuery();
            while (rsSet.next()) {
                String ID_TicketSale = rsSet.getString(1);
                int tmp = Integer.parseInt(ID_TicketSale.substring(2));
                if(max < tmp) {
                    max = tmp;
                }
            }
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return max;
    }

    // lấy danh sách những ID_TicketSale với ShowTime tương ứng
    public ArrayList<String> getIDTicketSale(ShowTime showTime) {
        ArrayList<String> listID_TicketSale = new ArrayList<>();
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String SQLQuery = "SELECT ID_TicketSale FROM TicketSale WHERE ID_ShowTime = ?";
            var prePareStm = connect.prepareStatement(SQLQuery);
            prePareStm.setString(1, showTime.getIdShowTime());
            var rsSet = prePareStm.executeQuery();
            while (rsSet.next()) {
                String ID_TicketSale = rsSet.getString(1);
                listID_TicketSale.add(ID_TicketSale);
            }
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listID_TicketSale;
    }

    // lấy danh sách những ghế đã được chọn với ShowTime tương ứng 
    public ArrayList<String> getSeatChoosen(ShowTime showTime) {
        ArrayList<String> listID_TicketSale = getIDTicketSale(showTime);
        ArrayList<String> listSeatChoosen = new ArrayList<>();
        SQLServerDataSource ds = configDataSource();
        for (String x : listID_TicketSale) {
            try (var connect = ds.getConnection()) {
                String SQLQuery = "SELECT ID_Seat FROM DetailTicketSale WHERE ID_TicketSale = ?";
                var prePareStm = connect.prepareStatement(SQLQuery);
                prePareStm.setString(1, x);
                var rsSet = prePareStm.executeQuery();
                while (rsSet.next()) {
                    String ID_Seat = rsSet.getString(1);
                    listSeatChoosen.add(ID_Seat);
                }
            } catch (SQLServerException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listSeatChoosen;
    }

    // lấy giá và loại ghế theo mã ghế 
    public List<String> getInfoOfSeat(String ID_Seat) {
        List<String> InfoSeat = new ArrayList<>();
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            // lấy toàn bộ trường dữ liệu của TicketSale (chỉ lấy 1 dòng)
            String SQLQuery = "SELECT UnitPrice, ID_TypeSeat FROM Seat WHERE ID_Seat = ?";
            var prepareStm = connect.prepareStatement(SQLQuery);
            prepareStm.setString(1, ID_Seat);
            var rsSet = prepareStm.executeQuery();
            while (rsSet.next()) {
                String UnitPrice = rsSet.getString(1);
                String ID_TypeSeat = rsSet.getString(2);
                InfoSeat.add(UnitPrice);
                InfoSeat.add(ID_TypeSeat);
            }
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return InfoSeat;
    }

    // ghi dữ liệu vào bảng TicketSale
    public void writeTicketSale(String ID_TicketSale, Date present, int total, ShowTime showTime, String ID_Staff) {
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String insertQuery = "INSERT INTO TicketSale(ID_TicketSale, SaleDate, Total, ID_ShowTime, ID_Staff, ID_Customer) Values(?, ?, ?, ?, ?, ?)";
            var prepareStm = connect.prepareStatement(insertQuery);
            prepareStm.setString(1, ID_TicketSale);
            prepareStm.setString(2, changeDateSQL(present));
            prepareStm.setString(3, total + "");
            prepareStm.setString(4, showTime.getIdShowTime());
            prepareStm.setString(5, ID_Staff);
            prepareStm.setString(6, "CUS0000");
            prepareStm.execute();
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ghi những ghế được chọn vào bảng detailTicketSale
    public void writeDetailTicketSale(String ID_TicketSale, List<String> listSeatHasJustBeenSelected, ShowTime showTime) {
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            for (String x : listSeatHasJustBeenSelected) {
                String insertQuery = "INSERT INTO DetailTicketSale(ID_TicketSale, ID_Seat) Values(?, ?)";
                var prepareStm = connect.prepareStatement(insertQuery);
                prepareStm.setString(1, ID_TicketSale);
                prepareStm.setString(2, x + showTime.getRoom().getIdRoom());
                prepareStm.execute();
            }
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public TicketSale getBookkingTicketSale(ShowTime showTime, Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
