package package1;

import java.sql.*;

public class Queries {
	
	ResultSet merge(ResultSet rs1, ResultSet rs2){
		try{
		ResultSet merged = null;
		
		rs1.first();
		rs2.first();
		
		while(true){
			if(rs1.getInt(1) == rs2.getInt(1)){
				merged = rs1;
				if(rs1.next() == false){
					break;
				}
				if(rs2.next() == false){
					break;
				}
			}
			else if(rs1.getInt(1) < rs2.getInt(1)){
				if(rs1.next() == false){
					break;
				}
			}
			else{
				if(rs2.next() == false){
					break;
				}
			}
		}
		
		return merged;
		}
		catch(SQLException se){
			se.printStackTrace();
			return null;
		}
	}

	ResultSet runQuery(int uID, String certificate, int intern, int project, int research, String skill){
		
		ResultSet main = null;
		connection connect = new connection();
		
		
		if(certificate != null){
			String query = "Select distinct uID from Certification where skillName=\"" +
							certificate +
							"\" order by uID;";
			ResultSet rs = connect.query(query);
			
			if(rs == null){
				return null;
			}
			
			if(main == null){
				main = rs;
			}
		}
		
		if(intern != 0){
			String query = "Select distinct uID from Internships order by uID;";
			ResultSet rs = connect.query(query);
			if(rs == null){
				return null;
			}
			if(main == null){
				main = rs;
			}
			else{
				main = merge(main,rs);
			}
		}
		
		if(project != 0){
			String query = "Select distinct uID from ProjectID order by uID;";
			ResultSet rs = connect.query(query);
			if(rs == null){
				return null;
			}
			if(main == null){
				main = rs;
			}
			else{
				main = merge(main,rs);
			}
		}
		
		if(research != 0){
			String query = "Select distinct uID from ResearchID order by uID;";
			ResultSet rs = connect.query(query);
			if(rs == null){
				return null;
			}
			if(main == null){
				main = rs;
			}
			else{
				main = merge(main,rs);
			}
		}
		
		if(skill != null){
			String query = "Select distinct uID from SkillSet where skillName=\"" +
							skill +
							"\" order by uID;";
			ResultSet rs = connect.query(query);
			if(rs == null){
				return null;
			}
			if(main == null){
				main = rs;
			}
			else{
				main = merge(main,rs);
			}
		}
		
		return main;
	}
	
}
