package package1;

import java.sql.ResultSet;

public class RecDetails {

	int recID;
	String name;
	String companyName;
	String field;
	String position;
	String location;
	
	ResultSet getRecDetails(int recID){
		//try {
			String query = "Select * from RecDetails where recID=" +
					recID +
					";";

			connection connect = new connection();
			ResultSet rs = connect.query(query);

			return rs;
		//}
		//catch(SQLException e){
		//	return null;
		//}
	}

	int addRecDetails(int recID, String name, String companyName,String field, String position, String location){
		//try {
			String query = "Insert into RecDetails values (" +
						recID +
						",\"" +
						name +
						"\",\"" +
						companyName +
						"\",\"" +
						field +
						"\",\"" +
						position +
						"\",\"" +
						location +
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
