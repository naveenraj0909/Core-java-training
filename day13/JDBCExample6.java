package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample6 {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Step 1 : Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step 2 : Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");
		
		//Step 3 : Creating Statement
		String sql = "select * from naveen_employee";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//Step 4 : Executing the Query
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("eid") + " " + rs.getString("dname") + " " + rs.getInt("esalary"));
		}
		
		//Step 5 : Closing
		ps.close();
		ps.close();
		con.close();
		
	}
}
