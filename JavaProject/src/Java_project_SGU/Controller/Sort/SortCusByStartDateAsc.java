/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_project_SGU.Controller.Sort;

import Java_project_SGU.BUS.Customer;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */

public class SortCusByStartDateAsc implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o2.getStartDate().compareTo(o1.getStartDate());
    }
}
