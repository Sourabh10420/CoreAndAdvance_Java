package in.co.rays.Statament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsertData {
	
	public static void main(String[] args) throws Exception {
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh","root","root");
		
		Statement st=conn.createStatement();
		
		
		int i =st.executeUpdate("update marksheet set Subject = 'Bio'where id = 10");
		
		System.out.println("insert value done"+"="+ i);
	}

}