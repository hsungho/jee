package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;

/**
 * @date :2016. 7. 1.
 * @author :ckan
 * @file :MemberDAO.java
 * @story :
 */
public class MemberDAO {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet set = null;// executeQuery() 에서만 리턴받는 객체
	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	private MemberDAO() {
	}
	public int insert(MemberBean stu){
		String sql = "insert into member(id,pw,name,reg_date,ssn_id)"
				+ "values('"+stu.getId()+"','"+stu.getPw()+"','"+stu.getName()+"','"+stu.getRegDate()+"','"+stu.getSsn()+"')";
		return exeUpdate(sql);
	}
	public int update(MemberBean stu){
		String sql = "update member "
				+ "set pw = '"+stu.getPw()
			    + "' where id = '"+stu.getId()+"'";
		return exeUpdate(sql);
	}
	public int delete(String id){
		String sql = "delete member "
			    + " where id = '"+id+"'";
		return exeUpdate(sql);
	}
	public int exeUpdate(String sql) {

		int result = 0;

		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	// list
	public List<MemberBean> list(){
		String sql = "select * from member";
		List<MemberBean> tempList = new ArrayList<MemberBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			set = stmt.executeQuery(sql);
			while (set.next()) {
				MemberBean mem = new MemberBean(set.getString("NAME"), set.getString("ID"), set.getString("PW"), set.getString("SSN_ID"));
				mem.setRegDate(set.getString("REG_DATE"));
				tempList.add(mem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempList;
	}	
	// findByPK
	public MemberBean findById(String pk) {
		String sql = "select * from member where id = '"+pk+"'";
		MemberBean tempBean = null;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			set = stmt.executeQuery(sql);
			if (set.next()) {
				tempBean = new MemberBean(set.getString("NAME"), set.getString("ID"), set.getString("PW"), set.getString("SSN_ID"));
				tempBean.setRegDate(set.getString("REG_DATE"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tempBean;
	}
	// findByName
	public List<MemberBean> findByName(String name) {
		String sql = "select * from member where name = '"+name+"'";
		List<MemberBean> tempList = new ArrayList<MemberBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			set = stmt.executeQuery(sql);
			while (set.next()) {
				MemberBean mem = new MemberBean(set.getString("NAME"), set.getString("ID"), set.getString("PW"), set.getString("SSN_ID"));
				mem.setRegDate(set.getString("REG_DATE"));
				tempList.add(mem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempList;
	}
	// count
	public int count() {
		int result = 0;
		String sql = "select count(*) count from member ";
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			set = stmt.executeQuery(sql);
			if (set.next()) {
				result = set.getInt("count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
