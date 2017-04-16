package package1;

import java.sql.*;

public class Details {

	int uID;
	String name;
	String gender;
	int age;
	String mailId;
	String phoneNumber;
	String nationality;
	String fieldOfInterest;
	String internJob;

	ResultSet getDetails(int uID){
		try {
			String query = "Select * from Details where uID=" +
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

	ResultSet addDetails(int uID, String name, String gender, String age, String mailId, String phoneNumber, String nationality, String fieldOfInterest, String internJob){
		try {
			String query = "Insert into Details values (" +
						uID +
						",\"" +
						name +
						"\",\"" +
						gender +
						"\"," +
						age +
						",\"" +
						mailId +
						"\",\"" +
						phoneNumber +
						"\",\"" +
						nationality +
						"\",\"" +
						fieldOfInterest +
						"\",\"" +
						internJob +
						"\");";
						

			connection connect = new connection();
			ResultSet rs = connect.execute(query);

			return null;
		}
		catch(SQLException e){
			return null;
		}
	}

}
