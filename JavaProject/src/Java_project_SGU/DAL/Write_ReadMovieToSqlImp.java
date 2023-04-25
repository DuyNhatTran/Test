/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_project_SGU.DAL;

import Java_project_SGU.Exception.InvalidBirthdayException;
import Java_project_SGU.BUS.Movie;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Write_ReadMovieToSqlImp implements Write_ReadMovieToSqlInterface {

    @Override
    public SQLServerDataSource configDataSource() {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setEncrypt(false);
        ds.setIntegratedSecurity(false);
        ds.setTrustServerCertificate(false);
        
        ds.setUser(USER);
        ds.setPassword(PASSWORD);
        ds.setServerName(SERVER);
        ds.setPortNumber(PORT);
        ds.setDatabaseName(DB_NAME);
        return ds;
    }

    @Override
    public List<Movie> readMovieFromDS() {
        List <Movie> listMovie = new ArrayList<>();
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String sqlReadMovieQuery = "SELECT * FROM Movie WHERE isShowing = 1";
            var prepareStm = connect.prepareStatement(sqlReadMovieQuery);
            var rs = prepareStm.executeQuery();
            while(rs.next()) {
                String idMovie = rs.getString(1);
                String name = rs.getString(2);
                int time = rs.getInt(3);
                int ageLimit = rs.getInt(4);
                String dateOpening = changeDate(rs.getString(5));
                String language = rs.getString(6);
                String country = rs.getString(7);
                String director = rs.getString(8);
                String content = rs.getString(9);
                String typeMovie = rs.getString(10);
                String producer = rs.getString(11);
                boolean isShowing = false;
                if (rs.getString(12) == "1") {
                    isShowing = true;
                }
                String imageLink = rs.getString(13);
                Movie movie = new Movie(idMovie, name, time, ageLimit, 
                        dateOpening, language, country, producer, content,
                        typeMovie, director, isShowing, imageLink);
                listMovie.add(movie);
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
        return listMovie;
    }

    @Override
    public int insertMovieDataToSql(Movie movie) {
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String inSertMoviesqlQuery = "INSERT INTO dbo.Movie(ID_Movie, Name,"
                    + " Time, AgeLimit, OpeningDate, Language, country, director,"
                    + " content, typeMovie, producer, isShowing,imageLink)\n" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            var prepareStm = connect.prepareStatement(inSertMoviesqlQuery);
            prepareStm.setString(1, movie.getIdMovie());
            prepareStm.setString(2, movie.getNameMovie());
            prepareStm.setInt(3, movie.getTime());
            prepareStm.setInt(4, movie.getAgeLimit());
            prepareStm.setString(5, new SimpleDateFormat("yyyy-MM-dd").
                    format(movie.getOpeningDate()));
            prepareStm.setString(6, movie.getLaguage());
            prepareStm.setString(7, movie.getCountry());
            prepareStm.setString(8, movie.getDirector());
            prepareStm.setString(9, movie.getContent());
            prepareStm.setString(10, movie.getTypeMovie());
            prepareStm.setString(11, movie.getProducer());
            if (movie.isIsShowing()) {
                prepareStm.setString(12,"True");
            } else {
                prepareStm.setString(12, "False");
            }
            prepareStm.setString(13,movie.getLinkImage());
            return prepareStm.executeUpdate();
        } catch (SQLServerException ex) {
            ex.printStackTrace();
            return -1;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return -1;
        }
    }
    
    private static String changeDate (String date) throws ParseException {
        SimpleDateFormat fortDateOpingMovie = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fomartDateSql = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dateSql = fomartDateSql.parse(date);
        String dateCustomer = fortDateOpingMovie.format(dateSql);
        return dateCustomer;
    }

    public int deleteMovie(Movie movie) {
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String deleteMovieQuery = "UPDATE dbo.Movie SET isShowing = 0 WHERE ID_Movie = ?";
            var prepareStm = connect.prepareStatement(deleteMovieQuery);
            prepareStm.setString(1, movie.getIdMovie());
            return prepareStm.executeUpdate();
        } catch (SQLServerException ex) {
            ex.printStackTrace();
            return -1;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public void updateMovie(Movie movieUpdate) {
        SQLServerDataSource ds = configDataSource();
        try (var connect = ds.getConnection()) {
            String updateMovieQuery = "UPDATE Movie SET Name = ?, Time = ?,"
                    + " AgeLimit = ?, OpeningDate = ?, Language = ?, country = ?,"
                    + " director = ?, content = ?, typeMovie = ?, producer = ?,"
                    + " isShowing = ?, imageLink = ? WHERE ID_Movie = ?;";
            var prepareStm = connect.prepareStatement(updateMovieQuery);
             prepareStm.setString(1, movieUpdate.getNameMovie());
            prepareStm.setInt(2, movieUpdate.getTime());
            prepareStm.setInt(3, movieUpdate.getAgeLimit());
            prepareStm.setString(4, new SimpleDateFormat("yyyy-MM-dd").
                    format(movieUpdate.getOpeningDate()));
            prepareStm.setString(5, movieUpdate.getLaguage());
            prepareStm.setString(6, movieUpdate.getCountry());
            prepareStm.setString(7, movieUpdate.getDirector());
            prepareStm.setString(8, movieUpdate.getContent());
            prepareStm.setString(9, movieUpdate.getTypeMovie());
            prepareStm.setString(10, movieUpdate.getProducer());
            if (movieUpdate.isIsShowing()) {
                prepareStm.setString(11,"1");
            } else {
                prepareStm.setString(11, "0");
            }
            prepareStm.setString(12,movieUpdate.getLinkImage());
            prepareStm.setString(13,movieUpdate.getIdMovie());
            prepareStm.executeUpdate();
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
}
