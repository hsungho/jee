package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.corba.se.impl.orbutil.closure.Constant;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

/**
 * @date   :2016. 7. 1.
 * @author :ckan
 * @file   :BankDAO.java 
 * @story  :
 */
public class AccountDAO {
	Connection con = null;
	PreparedStatement pstmt;
	ResultSet rs = null;
	private AccountDAO() {
		con = DatabaseFactory.createDatabase(Vendor.ORACLE,Constants.USER_ID,Constants.USER_PW).getConnection();
	}
	private static AccountDAO instance = new AccountDAO();
	public static AccountDAO getInstance() {
		return instance;
	}
	public int insert(AccountBean acct) {
		int result = 0;
		String sql = "insert into account(account_no,money,id)"
				+ "values(?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, acct.getAccountNo());
			pstmt.setInt(2, acct.getMoney());
			pstmt.setString(3, acct.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public int findId(String id) {
		int result = 0;
		String sql = "select count(*) count from member where id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt("count");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
