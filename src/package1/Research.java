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
		try {
			String query = "Select * from Research where uID=" +
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

	ResultSet addResearch(int rID,String topic, String field, String supervisedBy, String publishedIn, String publishDate){
		try {
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
			ResultSet rs = connect.execute(query);

			return null;
		}
		catch(SQLException e){
			return null;
		}
	}

}
