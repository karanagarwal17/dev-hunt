package package1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Projects {

	int pID;
	String topic;
	String field;
	String supervisedBy;
	String startDate;
	String endDate;

	ResultSet getProjects(int uID){
		try {
			String query = "Select * from Projects where uID=" +
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

	ResultSet addProjects(int uID,String topic, String field, String supervisedBy, String startDate, String endDate){
		try {
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
			ResultSet rs = connect.execute(query);

			return null;
		}
		catch(SQLException e){
			return null;
		}
	}

}
