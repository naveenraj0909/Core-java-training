package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample8 {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Step 1 : Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step 2 : Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");
		
		//Step 3 : Creating Statement
		String sql = "insert into naveen_employee values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//Step 4 : Executing the Query
		ps.setInt(1, 501);
		ps.setString(2, "Sundar");
		ps.setInt(3, 5000);
		ps.setInt(4, 10);
		ps.addBatch();
		
		ps.setInt(1, 502);
		ps.setString(2, "Gokul");
		ps.setInt(3, 9000);
		ps.setInt(4, 10);
		ps.addBatch();
		
		ps.executeBatch();
		
		//Step 5 : Closing
		ps.close();
		ps.close();
		con.close();
		
	}
}
