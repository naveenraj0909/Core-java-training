package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCExample5 {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Step 1 : Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step 2 : Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");
		
		//Step 3 : Creating Statement
		String sql = "select * from naveen_employee";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//Step 4 : Executing the Query
		ResultSet rs = ps.executeQuery(); //select
		ResultSetMetaData rsData = rs.getMetaData();
		System.out.println(rsData.getColumnCount());
		for(int i = 1; i<= rsData.getColumnCount(); i++) {
			System.out.println(rsData.getColumnName(i));
		}
		while(rs.next()) {
			System.out.println(rs.getInt("eid") + " " + rs.getString("dname") + " " + rs.getInt("esalary"));
		}
		
		//Step 5 : Closing
		ps.close();
		rs.close();
		con.close();
		
	}
}
