package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import global.Constants;

/**
 * @date   :2016. 7. 1.
 * @author :ckan
 * @file   :GradeDAO.java 
 * @story  :
 */
public class GradeDAO {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet set = null;
		String sqlCreate ="create table grade ("
				+ "name varchar2(20),"
				+ "kor number,"
				+ "eng number,"
				+ "math number"
				+ ")";
		String sqlDrop = "drop table grade";
		int updateResult = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL,Constants.ORACLE_ID,Constants.ORACLE_PW);
			stmt = con.createStatement();
			updateResult = stmt.executeUpdate(sqlCreate);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("DB 다녀온 : "+updateResult);
	}
	
}
