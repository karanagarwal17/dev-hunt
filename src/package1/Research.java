package package1;

import java.sql.*;

public class Research {

	int rID;
	String topic;
	String field;
	String supervisedBy;
	String publishedIn;
	String publishDate;

	ResultSet getResearch(int uID){
	//	try {
			String query = "Select * from Research where uID=" +
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

	int addResearch(int rID,String topic, String field, String supervisedBy, String publishedIn, String publishDate){
	//	try {
			String query = "Insert into Research values (" +
						rID +
						",\"" +
						topic +
						"\",\"" +
						field +
						"\",\"" +
						supervisedBy +
						"\",\"" +
						publishedIn +
						"\",\"" +
						publishDate +
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
