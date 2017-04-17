package package1;

import java.sql.*;

public class login {

	int uID;
	String username;
	String password;
	
	int getUser(String username, String password) {
		try {
			String query = "Select * from Login where username=\"" + 
					username + 
					"\" and password=\"" + 
					password + 
					"\"";
			connection connect = new connection();	
			ResultSet rs = connect.query(query);
			
			int i = 0;
			while (rs.next())
				i++;
			rs.first();
			if(i == 1){
				int uID = rs.getInt("uID");
				return uID;
			}
			return 0;
		}
		catch(SQLException e){
			return 0;
		}
	}
	
	int addUser(String username, String password){
		try{
			String query = "Select max(uID) from Login;";
					
			connection connect = new connection();
			ResultSet rs = connect.query(query);
			
			int uID = rs.getInt("uID");
			uID ++;
			
			query = "insert into Login values(" + 
					uID + 
					",\"" +
					username +
					"\",\"" +
					password +
					"\");";
					
			int status = connect.update(query);
			return status;
		}
		catch(SQLException e){
			return 0;
		}
	}
	
}
