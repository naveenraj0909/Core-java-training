package com.day13;

//Batch processing In Real time

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample7 {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Step 1 : Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step 2 : Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");
		
		//Step 3 : Creating Statement
		String sql = "insert into naveen_employee values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//Step 4 : Executing the Query
		Object employee[][] = new Object[][] {
			{601, "aaa", 2000, 10},
			{602, "bbb", 3000, 10},
			{603, "ccc", 4000, 10},
			{604, "ddd", 5000, 10},
		};
		
		for(int i = 0; i<employee.length; i++) {
			ps.setInt(1, (Integer)employee[i][0]);
			ps.setString(2, (String)employee[i][1]);
			ps.setInt(3, (Integer)employee[i][2]);
			ps.setInt(4, (Integer)employee[i][3]);
			
			ps.addBatch();
		}
		
		ps.executeBatch();
		
		//Step 5 : Closing
		
		ps.close();
		con.close();
		
	}
}
