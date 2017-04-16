package package1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RecDetails {

	int recID;
	String Username;
	String Password;
	String name;
	String companyName;
	String field;
	String position;
	String location;
	
	int getRecruiterID(String Username, String Password) {
		try {
			String query = "Select * from RecDetails where username=\"" +
					Username + 
					"\" and password=\"" + 
					Password +
					"\"";
			
			connection connect = new connection();
			ResultSet rs = connect.execute(query);
			
			int i = 0;
			while (rs.next())
				i++;
			
			rs.first();
			
			if(i == 1){
				int recID = rs.getInt("recID");
				return recID;
			}
			
			return 0;
		}
		catch(SQLException e){
			return 0;
		}
	}

	void createRecruiter(String Username, String Password){
		try{
			String query = "Select max(recID) from RecDetails;";
					
			connection connect = new connection();
			ResultSet rs = connect.execute(query);
			
			int recID = rs.getInt("recID");
			recID ++;
			
			query = "insert into RecDetails values(" + 
					recID + 
					",\"" +
					Username +
					"\",\"" +
					Password +
					"\");";
					
			connect.execute(query);
			
		}
		catch(SQLException e){
			
		}
	}
	
}
