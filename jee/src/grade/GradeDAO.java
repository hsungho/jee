package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;
import member.MemberBean;

/**
 * @date   :2016. 7. 1.
 * @author :ckan
 * @file   :GradeDAO.java 
 * @story  :
 */
public class GradeDAO {
	Connection con;
	Statement stmt;
	ResultSet rs;
	PreparedStatement pstmt;
	private static GradeDAO instance = new GradeDAO();
	private GradeDAO() {
		con = DatabaseFactory.createDatabase(Vendor.ORACLE,Constants.USER_ID,Constants.USER_PW).getConnection();
	}
	public static GradeDAO getInstance() {
		return instance;
	}
	public int insert(GradeBean grade){
		int result = 0;
		String sql = "insert into grade (seq,grade,java,sql,html,javascript,id,exam_date) "
				      + " values(seq.nextval,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, grade.getGrade());
			pstmt.setInt(2, grade.getJava());
			pstmt.setInt(3, grade.getSql());
			pstmt.setInt(4, grade.getHtml());
			pstmt.setInt(5, grade.getJavascript());
			pstmt.setString(6, grade.getId());
			pstmt.setString(7, grade.getExamDate());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int update(GradeBean grade){
		int result = 0;
		String sql = "update grade "
				+ " set grade = ?, "
				+ grade.getClassName()+" = ? "
				+ " where seq = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, grade.getGrade());
			pstmt.setInt(2, grade.getUpdatescore());
			pstmt.setInt(3, grade.getSeq());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int delete(GradeBean grade) {
		int result = 0;
		String sql = "delete grade "
				+ " where seq = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, grade.getSeq());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	// list
	public List<GradeBean> list() {
		String sql = "select * from grade";
		List<GradeBean> tempList = new ArrayList<GradeBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				GradeBean mem = new GradeBean();
				mem.setSeq(rs.getInt("SEQ"));
				mem.setGrade(rs.getString("GRADE"));
				mem.setJava(rs.getInt("JAVA"));
				mem.setSql(rs.getInt("SQL"));
				mem.setHtml(rs.getInt("HTML"));
				mem.setJavascript(rs.getInt("JAVASCRIPT"));
				mem.setId(rs.getString("ID"));
				mem.setExamDate(rs.getString("EXAM_DATE"));
				tempList.add(mem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempList;
	}
	// findByPK
	public GradeBean findBySeq(int seq) {
		String sql = "select * from grade where seq = '" + seq + "'";
		GradeBean tempBean = null;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				tempBean = new GradeBean();
				tempBean.setSeq(rs.getInt("SEQ"));
				tempBean.setGrade(rs.getString("GRADE"));
				tempBean.setJava(rs.getInt("JAVA"));
				tempBean.setSql(rs.getInt("SQL"));
				tempBean.setHtml(rs.getInt("HTML"));
				tempBean.setJavascript(rs.getInt("JAVASCRIPT"));
				tempBean.setId(rs.getString("ID"));
				tempBean.setExamDate(rs.getString("EXAM_DATE"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tempBean;
	}
	// findByName
	public List<GradeBean> findById(String id) {
		String sql = "select * from grade where id = '" + id + "'";
		List<GradeBean> tempList = new ArrayList<GradeBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				GradeBean mem = new GradeBean();
				mem.setSeq(rs.getInt("SEQ"));
				mem.setGrade(rs.getString("GRADE"));
				mem.setJava(rs.getInt("JAVA"));
				mem.setSql(rs.getInt("SQL"));
				mem.setHtml(rs.getInt("HTML"));
				mem.setJavascript(rs.getInt("JAVASCRIPT"));
				mem.setId(rs.getString("ID"));
				mem.setExamDate(rs.getString("EXAM_DATE"));
				tempList.add(mem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempList;
	}
	public int count(String examDate) {
		int result = 0;
		String sql = "select count(*) count from grade where exam_date = '"+examDate+"'";
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				result = rs.getInt("count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
