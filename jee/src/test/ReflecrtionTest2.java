package test;

import account.AccountBean;

/**
 * @date   :2016. 7. 1.
 * @author :ckan
 * @file   :ReflecrtionTest.java 
 * @story  :
 */
public class ReflecrtionTest2 {
	public static void main(String[] args) {
		try {
				AccountBean acct = (AccountBean) Class.forName("bank.AccountBean").newInstance();
				acct.setAccountNo();
				acct.setName("홍길동");
				acct.setId("hong");
				acct.setMoney(100);
				acct.setPw("1111");
				System.out.println(acct.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
