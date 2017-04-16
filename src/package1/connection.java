package package1;

import java.sql.*;

class connection {
	
	ResultSet execute(String query) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPMS","root","karanagarwal17");
			Statement stmt = con.createStatement();	
			ResultSet rs = stmt.executeQuery(query);
			con.close();
			
			return rs;
		}
		catch(Exception e){
			return null;
		}
	}
}
