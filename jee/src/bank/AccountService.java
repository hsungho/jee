/**
 * 
 */
package bank;

/**
 * @date   :2016. 6. 20.
 * @author :ckan
 * @file   :AccountService.java
 * @story  :
 */
public interface AccountService {
	// 1개설 2입금 3조회 4출금 5통장내역 6해지
	// AccountBean account = null; 인터페이스는 iv 를 갔지않는다.
	// 1개설
	public abstract void openAccount(String name,String id,String pw);// abstract 추상 있어도 없어도 됨
	// 2입금
	public String deposit(int inputMoney);
	// 3조회
	public void findAccount();
	// 4출금
	public String withdrawal(int output);
	// 5통장내역
	public String showAccount();
	// 6해지
	public void deleteAccount();
}
