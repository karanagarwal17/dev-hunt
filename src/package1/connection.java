package package1;

import java.sql.*;

class connection {
	
	ResultSet query(String query) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPMS","root","karanagarwal17");
			Statement stmt = con.createStatement();	
			ResultSet rs = stmt.executeQuery(query);
			
			return rs;
		}
		catch(SQLException se){
			se.printStackTrace();
			return null;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	int update(String query) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPMS","root","karanagarwal17");
			Statement stmt = con.createStatement();	
			int status = stmt.executeUpdate(query);
			con.close();
			
			return status;
		}
		catch(SQLException se){
			se.printStackTrace();
			return 0;
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
}
