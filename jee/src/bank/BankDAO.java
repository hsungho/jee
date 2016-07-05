package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sun.corba.se.impl.orbutil.closure.Constant;

import global.Constants;

/**
 * @date   :2016. 7. 1.
 * @author :ckan
 * @file   :BankDAO.java 
 * @story  :
 */
public class BankDAO {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet set = null;
		int updateResult = 0;
		String executeResult = "";
		String sqlCreate = "create table account(account_no number primary key,"
				+ "name varchar2(20),"
				+ "id varchar2(20),"
				+ "pw varchar2(20),"
				+ "money number)";
		String sqlDrop = "drop table account";
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			updateResult = stmt.executeUpdate(sqlDrop);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("DB 다녀온 결과 : "+updateResult);
	}
}
