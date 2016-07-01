package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

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
	ResultSet set = null;
	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	private MemberDAO() {
		// TODO Auto-generated constructor stub
	}

	public int exeUpdate(String sql) {

		int result = 0;

		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PW);
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (result == 0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}

		return result;
	}

	public void exeQuery(String sql){
		try {
				Class.forName(Constants.ORACLE_DRIVER);
				con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PW);
				stmt = con.createStatement();
				Map<String,MemberBean> map = new HashMap<String,MemberBean>();
				String resul = "";
				set = stmt.executeQuery(sql);
				while (set.next()) {
					resul = "name = "+set.getString("NAME")+"ID = "+set.getString("ID")+"PW = "+set.getString("PW")+
							"REG DATE = "+set.getString("REG_DATE")+"SSN ID = "+set.getString("SSN_ID");
					map.get(resul);
				}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
