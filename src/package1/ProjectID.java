package package1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectID {

	int uID;
	int pID;
	
	ResultSet getProjectID(int uID){
		try {
			String query = "Select * from ProjectID where uID=" +
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

	ResultSet addProjectID(int uID,int pID){
		try {
			String query = "Insert into ProjectID values (" +
						uID +
						"," +
						pID +
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
