package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	Connection con = null;
	Statement stmt = null;
	ResultSet set = null;
	PreparedStatement pstmt = null;
	private static GradeDAO instance = new GradeDAO();
	private GradeDAO() {
	}
	public static GradeDAO getInstance() {
		return instance;
	}
	public int insert(GradeBean grade){
		String sql = "insert into grade (name,kor,eng,math,hakjum) "
				+ " values('"+grade.getName()+"','"+grade.getKor()+"','"+grade.getEng()+"','"
						+grade.getMath()+"','"+grade.getHakjum()+"') ";
		return executeUpdate(sql);
	}
	public int update(GradeBean grade){
		String sql = "insert into grade (name,kor,eng,math,hakjum) "
				+ " values('"+grade.getName()+"','"+grade.getKor()+"','"+grade.getEng()+"','"
						+grade.getMath()+"','"+grade.getHakjum()+"') ";
		return executeUpdate(sql);
	}
	public int executeUpdate(String sql) {
		int result = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL,Constants.ORACLE_ID,Constants.ORACLE_PW);
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
