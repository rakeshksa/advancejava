package com.employeeManagement.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.employeeManagement.entity.Entity;

public class EmpService {
	
	private static Scanner sc=new Scanner(System.in);
	private static String url="jdbc:postgresql://localhost:5432/Jspider";
	private static String user="postgres";
	private static String pswd="123";
	private static Connection con;
	static {
		try {
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection(url, user, pswd);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void save() {
	    System.out.println("Enter how many employees you want to add:");
	    int n = sc.nextInt();

	    String sql = "INSERT INTO employee (id, name, age, sal) VALUES (?, ?, ?, ?)";

	    try {
	        PreparedStatement pstm = con.prepareStatement(sql);

	        for (int k = 0; k < n; k++) {
	            System.out.println("Enter details for Employee " + (k + 1));
	            System.out.print("Enter Employee id: ");
	            int id = sc.nextInt();
	            System.out.print("Enter Employee name: ");
	            String name = sc.next();
	            System.out.print("Enter Employee age: ");
	            int age = sc.nextInt();
	            System.out.print("Enter Employee salary: ");
	            int sal = sc.nextInt();

	            pstm.setInt(1, id);
	            pstm.setString(2, name);
	            pstm.setInt(3, age);
	            pstm.setInt(4, sal);

	            pstm.addBatch(); 
	        }

	        int[] results = pstm.executeBatch(); 

	        for (int res : results) {
	            System.out.println(res + " : Data added");
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	  
    public List<Entity> fetch() {
    	List<Entity> li=new ArrayList<Entity>();
        String sql = "SELECT * FROM employee";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
          while (rs.next()) {
			
        	  li.add(new Entity(rs.getInt(1) , rs.getString(2) , rs.getInt(3),rs.getInt(4)));
			
		}
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li;
    }


    public int update() {
    	int res=0;
    	
        System.out.println("Enter Employee ID to update:");
        int id = sc.nextInt();
        System.out.println("Enter new name:");
        String name = sc.next();
        System.out.println("Enter new age:");
        int age = sc.nextInt();
        System.out.println("Enter new salary:");
        int sal = sc.nextInt();

        String sql = "UPDATE employee SET name = ?, age = ?, sal = ? WHERE id = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, name);
            pstm.setInt(2, age);
            pstm.setInt(3, sal);
            pstm.setInt(4, id);
            res = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

   
    public int delete() {
    	int res=0;
        System.out.println("Enter Employee ID to delete:");
        int id = sc.nextInt();
        String sql = "DELETE FROM employee WHERE id = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
             res = pstm.executeUpdate();
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
	
	
	

}
