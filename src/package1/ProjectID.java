package package1;

import java.sql.*;

public class ProjectID {

	int uID;
	int pID;
	
	ResultSet getProjectID(int uID){
	//	try {
			String query = "Select * from ProjectID where uID=" +
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

	int addProjectID(int uID,int pID){
	//	try {
			String query = "Insert into ProjectID values (" +
						uID +
						"," +
						pID +
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
