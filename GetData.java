package com.database1;
import java.sql.*;

public class GetData {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/awsdb", "postgres", "database");

		Statement st = (Statement) con.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");
		while(rs.next())
		// System.out.println(rs);
		System.out.println(rs.getInt("empid") + ", " + rs.getString("empname")+ ", " +rs.getDate("dob")+", "+rs.getInt("deptid")+", "+rs.getFloat("salary"));
		con.close();

	}

}
