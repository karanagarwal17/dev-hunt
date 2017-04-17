package package1;

import java.sql.*;

public class WorkExperience {

	int uID;
	String skillName;
	int noOfYears;
	int noOfProjects;

	ResultSet getWorkEx(int uID){
	//	try {
			String query = "Select * from WorkExperience where uID=" +
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

	int addWorkEx(int uID,String skillName, int noOfYears, int noOfProjects){
	//	try {
			String query = "Insert into WorkExperience values (" +
						uID +
						",\"" +
					 	skillName +
						"\"," +
						noOfYears +
						"," +
						noOfProjects +
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
