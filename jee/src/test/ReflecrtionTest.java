package test;

import member.MemberBean;

/**
 * @date   :2016. 7. 1.
 * @author :ckan
 * @file   :ReflecrtionTest.java 
 * @story  :
 */
public class ReflecrtionTest {
	public static void main(String[] args) {
		try {
				MemberBean mem = (MemberBean) Class.forName("member.MemberBean").newInstance();
				mem.setId("hong");
				mem.setName("홍길동");
				mem.setPw("1");
				System.out.println(mem.toString());
		}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
