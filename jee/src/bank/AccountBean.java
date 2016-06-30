/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 16.
 * @author :ckan
 * @file   :Account.java
 * @story  :
 */
public class AccountBean {
	private int accountNo; // 인스턴스 변수는 초기화를 하지 않는다. private 암호화 되어 있다. 보안
	private String name;
	private int money;
	private String pw;
	private String id;
	public AccountBean() {
		// default constructor 기본 생성자
		// 생성자 오버로딩 
	}
	public AccountBean(String name,String id,String pw) {// TODO Auto-generated constructor stub 할일 자동으로 만들었으니 개발자가 채워라
		this.accountNo = (int) (Math.random() * 99999)+100000;
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	public void setMoney(int money){
		this.money = money;
	}
	public void setPw(String pw){
		this.pw = pw;
	}
	public String getName(){
		return this.name;
	}
	public int getAccountNo(){
		return this.accountNo;
	}
	public int getMoney(){
		return this.money;
	}
	public String getPw(){
		return this.pw;
	}
	public String getId(){
		return this.id;
	}
	public String toString() {// 메소드 오버라이딩
		return global.Constants.BANK_NAME+" [계좌번호= " + accountNo + ", 이름= " + name + 
				  ", 잔액 = " + money + ", 아이디= " + id +", 비번=****"
				+ "]";
	}
	public void setAccountNo() {
		this.accountNo = (int) (Math.random() * 999999)+100000;
	}
	public void setAcountNo(int accNo){
		this.accountNo = accNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
