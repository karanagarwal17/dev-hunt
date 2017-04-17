package package1;

import java.sql.*;

public class Efficiency {
	
	int uID;
	String skillName;
	int percentEfficiency;
	
	ResultSet getEfficiency(int uID){
	//	try {
			String query = "Select * from Efficiency where uID=" +
					uID +
					";";

			connection connect = new connection();
			ResultSet rs = connect.query(query);

			return rs;
	//	}
	//	catch(SQLException e){
	//		return null;
	//	}
	}

	int addEfficiency(int uID, String skillName, int percentEfficiency){
	//	try {
			String query = "Insert into Efficiency values (" +
						uID +
						",\"" +
						skillName +
						"\"," +
						percentEfficiency +
						");";
						

			connection connect = new connection();
			int status = connect.update(query);

			return status;
	//	}
	//	catch(SQLException e){
	//		return null;
	//	}
	}
	
}
