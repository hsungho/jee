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
	private int accountNo,deposit,withdraw,money; // 인스턴스 변수는 초기화를 하지 않는다. private 암호화 되어 있다. 보안
	private String name,id,tellerDate,pw;
	public AccountBean() {
		// default constructor 기본 생성자
		// 생성자 오버로딩 
	}
	public String toString() {// 메소드 오버라이딩
		return global.Constants.BANK_NAME+" [계좌번호= " + accountNo + ", 이름= " + name + 
				  ", 잔액 = " + money + ", 아이디= " + id +", 비번=****"
				+ "]";
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = (int) (Math.random() * 999999)+100000;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTellerDate() {
		return tellerDate;
	}
	public void setTellerDate(String tellerDate) {
		this.tellerDate = tellerDate;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
