package package1;

import java.sql.*;

public class Projects {

	int pID;
	String topic;
	String field;
	String supervisedBy;
	String startDate;
	String endDate;

	ResultSet getProjects(int uID){
	//	try {
			String query = "Select * from Projects where uID=" +
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

	int addProjects(int uID,String topic, String field, String supervisedBy, String startDate, String endDate){
	//	try {
			String query = "Insert into Projects values (" +
						uID +
						",\"" +
						topic +
						"\",\"" +
						field +
						"\",\"" +
						supervisedBy +
						"\",\"" +
						startDate +
						"\",\"" +
						endDate +
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
