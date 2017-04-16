package package1;

import java.sql.*;

public class WorkExperience {

	int uID;
	String skillName;
	int noOfYears;
	int noOfProjects;

	ResultSet getWorkEx(int uID){
		try {
			String query = "Select * from WorkExperience where uID=" +
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

	ResultSet addWorkEx(int uID,String skillName, int noOfYears, int noOfProjects){
		try {
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
			ResultSet rs = connect.execute(query);

			return null;
		}
		catch(SQLException e){
			return null;
		}
	}

}
