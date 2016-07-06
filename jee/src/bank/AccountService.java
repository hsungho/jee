/**
 * 
 */
package bank;

import java.util.List;

/**
 * @date   :2016. 6. 20.
 * @author :ckan
 * @file   :AccountService.java
 * @story  :
 */
public interface AccountService {
	    // 1개설 2입금 3출금 4수정 5해지 6조회(전체) 7조회(계좌번호) 8조회(이름) 9조회(전체통장수)
		// AccountBean account = null; 인터페이스는 iv 를 갔지않는다.
		// 1개설
		public abstract void openAccount(AccountBean account);// abstract 추상 있어도 없어도 됨
		// 2입금
		public String deposit(int inputMoney);
		// 3출금
		public String withdrawal(int output);
		// 4.수정.. 사용자의 요청에 의해 비번만 전환가능
		public String updateAccount(AccountBean acc);// AccountNo,PW
		// 5해지
		public void deleteAccount();
		// 6조회(전체)
		public List<AccountBean> accountList();
		// 7조회(계좌번호)
		public AccountBean findByAccountNo(String accountNo);
		// 8조회(이름)
		public List<AccountBean> findByName(String name);
		// 9조회(전체통장수)
		public String count();
}
