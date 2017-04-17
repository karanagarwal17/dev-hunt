package package1;

import java.sql.*;

public class start {

public static void main(String[] args) {

	connection connect = new connection();

	try{
		
		String sql0 = "CREATE TABLE Education " +
		              "(uID INTEGER not NULL, " +
		              " tenthPercent float, " +
		              " twelfthPercent float, " +
		              " board char(4), " +
		              " yearOfPassing int, " +
		              "collegeName varchar(50), "+
		              "currentSem int, " +
		              "CGPA int, "+
		              " PRIMARY KEY ( uID))";
		connect.update(sql0);

		String sql1 = "CREATE TABLE Details " +
		              "(uID integer not null, " +
		              " name varchar(50), " +
		              " gender char(1), " +
		              " age int, " +
		              " mailId varchar(25), " +
		              " phoneNumber int, " +
		              " nationality varchar(20), "+
		              " fieldOfInterest varchar(50), " +
		              " internJob  varchar(15), "+
		              " PRIMARY KEY ( uID))";
		connect.update(sql1);

		String sql2 = "CREATE TABLE SkillSet " +
		              "(uID integer not null, " +
		              " skillName varchar(50), " +
		              " PRIMARY KEY (uID))";
		connect.update(sql2);

		String sql3 = "CREATE TABLE Certifications " +
		              "(uID integer not null, " +
		              " skillName varchar(50), " +
		              " issueDate varchar(20), " +
		              " organisation varchar(50)," +
		              " courseName varchar(50)," +
		              " PRIMARY KEY ( uID))";
		connect.update(sql3);

		String sql4 = "CREATE TABLE WorkExperience " +
		              "(uID integer not null, " +
		              " skillName varchar(50), " +
		              " noOfYears int, " +
		              " noOfProjects int," +
		              " PRIMARY KEY ( uID ))";
		connect.update(sql4);

		String sql5 = "CREATE TABLE Efficiency " +
		              "(uID integer not null, " +
		              " skillName varchar(50), " +
		              " percentEfficiency int, " +
		              " PRIMARY KEY ( uID))";
		connect.update(sql5);

		String sql6 = "CREATE TABLE Internships " +
		              "(uID integer not null, " +
		              " companyName varchar(50), " +
		              " startDate varchar(25), " +
		              " enddate varchar(25), " +
		              " stipend int, " +
		              " PRIMARY KEY ( uID ))";
		connect.update(sql6);

		String sql7 = "CREATE TABLE Projects " +
		              "(pID integer, "+
		              " topic varchar(50), " +
		              " field varchar(25), " +
		              " supervisedBy varchar(50)," +
		              " startDate varchar(25), " +
		              " endDate varchar(25), " +
		              " PRIMARY KEY ( pID ))";
		connect.update(sql7);

		String sql8 = "CREATE TABLE Research " +
		              "(rID integer, " +
		              " topic varchar(50), " +
		              " field varchar(25), " +
		              " supervisedBy varchar(50)," +
		              " publishedIn varchar(25), " +
		              " publishDate varchar(25), " +
		              " PRIMARY KEY ( rID ))";
		connect.update(sql8);

		String sql9 = "CREATE TABLE ProjectId " +
		              "(pID integer, " +
		              " uID integer )";
		connect.update(sql9);

		String sql10 = "CREATE TABLE ResearchId " +
		               "(rID integer, " +
		               " uID integer)";
		connect.update(sql10);

		String sql11 = "CREATE TABLE Login " +
		               "(username varchar(50), " +
		               " password varchar(10), " +
		               " uID int)";
		connect.update(sql11);

		String sql12 = "CREATE TABLE RecDetails " +
		               "(recID integer not null, " +
		               " name varchar(25), "+
		               " companyName varchar(50), " +
		               " field varchar(25), " +
		               " position varchar(50)," +
		               " location varchar(25), " +
		               " PRIMARY KEY ( recID ))";
		
		connect.update(sql12);
		
		SkillSet s = new SkillSet();
		int status = s.addSkillSet(2,"CSS");
		System.out.println(status);
		ResultSet rs = s.getSkillSet(1);
		
		rs.first();
		
		System.out.println(rs.getInt(1) + rs.getString(2));
		
		
	}
	catch(SQLException se) {
		se.printStackTrace();
	}
}
}
