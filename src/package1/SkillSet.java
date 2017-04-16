package package1;

import java.sql.*;

public class SkillSet {

	int uId;
	String skillName;

	ResultSet getSkillSet(int uID){
		try {
			String query = "Select * from SkillSet where uID=" +
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

	ResultSet addSkillSet(int uID,String skillName){
		try {
			String query = "Insert into SkillSet values (" +
						uID +
						",\"" +
						skillName +
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
