package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample2 {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Step 1 : Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step 2 : Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");
		
		//Step 3 : Creating Statement
		String sql = "insert into naveen_employee values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//Step 4 : Executing the Query
		ps.setInt(1, 203);
		ps.setString(2, "Naveen");
		ps.setInt(3, 5000);
		ps.setInt(4, 10);
		
		int n = ps.executeUpdate(); //Insert, Delete, Update
		
		if(n==1) {
			System.out.println("Record Inserted");
		}
		else {
			System.out.println("Record Not Inserted");
		}
		
		//Step 5 : Closing
		ps.close();
		con.close();
	}
}
