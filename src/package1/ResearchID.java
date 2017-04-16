package package1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResearchID {

	int uID;
	int rID;

	ResultSet getResearchID(int uID){
		try {
			String query = "Select * from ResearchID where uID=" +
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

	ResultSet addResearchID(int uID,int rID){
		try {
			String query = "Insert into ResearchID values (" +
						uID +
						"," +
						rID +
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
