
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author margaret
 */
public class Bank {
    private int bid;
 private String name;
 private String phone;
 private String WebURL;
 ArrayList<Customer> cusList = new ArrayList<Customer>();
 ArrayList<Employee> empList = new ArrayList<Employee>();

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebURL() {
        return WebURL;
    }

    public void setWebURL(String WebURL) {
        this.WebURL = WebURL;
    }

    public ArrayList<Customer> getCusList() {
        return cusList;
    }

    public void setCusList(ArrayList<Customer> cusList) {
        this.cusList = cusList;
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    public Bank(int bid, String name, String phone, String WebURL) {
        this.bid = bid;
        this.name = name;
        this.phone = phone;
        this.WebURL = WebURL;
    }

    @Override
    public String toString() {
        return "Bank{" + "bid=" + bid + ", name=" + name + ", phone=" + phone + ", WebURL=" + WebURL + ", cusList=" + cusList + ", empList=" + empList + '}';
    }
 
}
