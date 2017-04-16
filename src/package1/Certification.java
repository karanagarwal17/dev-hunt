package package1;

import java.sql.*;

public class Certification {
	
	int uID;
	String skillName;
	String issueDate;
	String organisation;
	String courseName;
	
	ResultSet getCertificate(int uID){
		try {
			String query = "Select * from Certification where uID=" + 
					uID +
					";";
			connection connect = new connection();	
			ResultSet rs = connect.execute(query);
			
			return rs;
		}
		catch(SQLException e){
			return null;
		}
	}
	
	ResultSet addCertificate(int uID, String skillName, String issueDate, String organisation, String courseName){
		try {
			String query = "Insert into Certification values (" +
						uID + 
						",\"" +
						skillName +
						"\",\"" + 
						issueDate + 
						"\",\"" +
						organisation + 
						"\",\"" + 
						courseName +
						"\");";
					
			
			connection connect = new connection();	
			ResultSet rs = connect.execute(query);
			
			return rs;
		}
		catch(SQLException e){
			return null;
		}
	}
}
