package package1;

import java.sql.*;

public class Education {

	int uID;
	int tenthpercent;
	int twelfthpercent;
	String board;
	int yearOfPassing;
	String collegeName;
	int currentSem;
	String CGPA;
	
	ResultSet getEducation(int uID){
	//	try {
			String query = "Select * from Education where uID=" +
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

	int addEducation(int uID, int tenthpercent, int twelfthpercent, String board, String mailId, String phoneNumber, String nationality, String fieldOfInterest, String internJob){
	//	try {
			String query = "Insert into Education values (" +
						uID +
						"," +
						tenthpercent +
						"," +
						twelfthpercent +
						",\"" +
						board +
						"\"," +
						yearOfPassing +
						",\"" +
						collegeName +
						"\"," +
						currentSem +
						",\"" +
						CGPA +
						"\");";
						

			connection connect = new connection();
			int status = connect.update(query);

			return status;
	//	}
	//	catch(SQLException e){
	//		return null;
	//	}
	}
}
