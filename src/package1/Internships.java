package package1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Internships {

	int uID;
	String companyName;
	String startDate;
	String endDate;
	int stipend;
	
	ResultSet getInternships(int uID){
		try {
			String query = "Select * from Internships where uID=" +
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

	ResultSet addInternships(int uID, String companyName, String startDate, String endDate, int stipend){
		try {
			String query = "Insert into Interships values (" +
						uID +
						",\"" +
						companyName +
						"\",\"" +
						startDate +
						"\",\"" +
						endDate +
						"\"," +
						stipend +
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
