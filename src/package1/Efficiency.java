package package1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Efficiency {
	
	int uID;
	String skillName;
	int percentEfficiency;
	
	ResultSet getEfficiency(int uID){
		try {
			String query = "Select * from Efficiency where uID=" +
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

	ResultSet addEfficiency(int uID, String skillName, int percentEfficiency){
		try {
			String query = "Insert into Efficiency values (" +
						uID +
						",\"" +
						skillName +
						"\"," +
						percentEfficiency +
						");";
						

			connection connect = new connection();
			ResultSet rs = connect.execute(query);

			return null;
		}
		catch(SQLException e){
			return null;
		}
	}
	
}
