/**
 * 
 */
package bank2;

/**
 * @date   :2016. 6. 20.
 * @author :ckan
 * @file   :AccountServiceImpl.java
 * @story  :계좌 인터페이스
 */
public class AccountServiceImpl implements AccountService {
	// 1개설 2입금 3조회 4출금 5통장내역 6해지
	AccountBean account; // 
	// 1개설
	@Override
	public void openAccount(String name, String id, String pw) {
		account = new AccountBean(name,id,pw);
		
	}
	// 2입금
	@Override
	public String deposit(int inputMoney) {
		String result="";
		int money = account.getMoney();
		money+=inputMoney;
		account.setMoney(money);
		return "입금 : "+String.valueOf(account.getMoney());
	}
	// 3조회
	@Override
	public void findAccount() {
		// TODO Auto-generated method stub
		
	}
	// 4출금
	@Override
	public String withdrawal(int output) {
		String result = "잔액부족";
		int money = account.getMoney();
		if (output <= money) {
			money -= output;
			account.setMoney(money);
			result = "잔액 : "+String.valueOf(account.getMoney());
		}
		return result;
	}
	// 5통장내역
	@Override
	public String showAccount() {
		return account.toString();
	}
	// 6해지
	@Override
	public void deleteAccount() {
		account = null;
	}
	public static AccountService getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void map() {
		// TODO Auto-generated method stub
		
	}

}
