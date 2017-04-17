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
		//try {
			String query = "Select * from Details where uID=" +
					uID +
					";";

			connection connect = new connection();
			ResultSet rs = connect.query(query);

			return rs;
		//}
		//catch(SQLException e){
		//	return null;
		//}
	}

	int addDetails(int uID, String name, String gender, String age, String mailId, String phoneNumber, String nationality, String fieldOfInterest, String internJob){
		//try {
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
			int status = connect.update(query);

			return status;
		//}
		//catch(SQLException e){
		//	return null;
		//}
	}

}
