package package1;

import java.sql.*;

public class ResearchID {

	int uID;
	int rID;

	ResultSet getResearchID(int uID){
	//	try {
			String query = "Select * from ResearchID where uID=" +
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

	int addResearchID(int uID,int rID){
	//	try {
			String query = "Insert into ResearchID values (" +
						uID +
						"," +
						rID +
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
