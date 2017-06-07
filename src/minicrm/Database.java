package minicrm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import minicrm.entity.Customer;
import minicrm.entity.Interaction;
import minicrm.entity.Representative;

class SQLExceptionResultEmpty extends SQLException {
}

public class Database {
    
    private Connection conn;
    
    public Database() throws SQLException {
        conn = DriverManager.getConnection("jdbc:sqlite:minicrm.db");
    }
    
    public ArrayList<Representative> getAllReps() throws SQLException {
        final String SELECT_ALL_REPS = "SELECT * FROM representative";
        ArrayList<Representative> result = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(SELECT_ALL_REPS);
            while (rs.next()) {
                int id = rs.getInt("representativeID");
                String nameFirst = rs.getString("nameFirst");
                String nameLast = rs.getString("nameLast");
                Representative r = new Representative(id, nameFirst, nameLast);
                result.add(r);
            }
        }
        return result;
    }
    
    //getAllCusts
    public ArrayList<Customer> getAllCustomers() throws SQLException {
        final String SELECT_ALL_REPS = "SELECT * FROM customer";
        ArrayList<Customer> result = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(SELECT_ALL_REPS);
            while (rs.next()) {
                int id = rs.getInt("CustomerID");
                String nameFirst = rs.getString("nameFirst");
                String nameLast = rs.getString("nameLast");
                String address = rs.getString("address");
                String postalCode = rs.getString("postalCode");
                String phoneNumber = rs.getString("phoneNumber");
                String SIN = rs.getString("SIN");
                Customer c = new Customer(id, nameFirst, nameLast,address,postalCode,phoneNumber ,SIN);
                result.add(c);
            }
        }
        return result;
    }
    
    public void addRep(Representative rep) throws SQLException {
        String query = "INSERT INTO representative VALUES (NULL, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, rep.nameFirst);
        ps.setString(2, rep.nameLast);
        ps.execute();
    }
    
  
    
    public void addCus(Customer cust) throws SQLException {
        String query = "INSERT INTO customer VALUES (NULL, ?,?, ?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, cust.nameFirst);
        ps.setString(2, cust.nameLast);
        ps.setString(3, cust.address);
        ps.setString(4, cust.postalCode);
        ps.setString(5, cust.phoneNumber);
        ps.setString(6, cust.SIN);
        ps.execute();
    }
    
    //interactionID, customerID,repID,date,notes
    
    public ArrayList<Interaction> getInteractionByRepID(int id) throws SQLException {
        String SELECT_INT = "SELECT * FROM Interaction WHERE repID="+id;
        //System.out.println("Database.java-89:SELECT_INT is "+SELECT_INT);
        ArrayList<Interaction> result = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(SELECT_INT);
            while (rs.next()) {
                int interactionID = rs.getInt("interactionID");
                int customerID = rs.getInt("customerID");
                int repID = rs.getInt("repID");
                String date = rs.getString("date");
                String notes = rs.getString("notes");
                Interaction i = new Interaction(interactionID,customerID,repID, date, notes);
                result.add(i);
            }
        }
        return result;
    }
    
    public String getRepFullNameByRepID(int id) throws SQLException {
        String query = "SELECT nameFirst , nameLast  FROM representative WHERE representativeID="+id;
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            String str_re = rs.getString(1)+" "+rs.getString(2);
            return str_re;
        }
    }
    
     public void updateInteractionNotes(Interaction i) throws SQLException {
        String query = "UPDATE Interaction SET notes=? WHERE repid=? and customerID=? and interactionID=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, i.notes);
        ps.setInt(2, i.repID);
        ps.setInt(3, i.customerID);
        ps.setInt(4, i.interactionID);
        ps.execute();
    }
     
    
} //close
