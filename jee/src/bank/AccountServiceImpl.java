/**
 * 
 */
package bank;

import java.util.List;

/**
 * @date   :2016. 6. 20.
 * @author :ckan
 * @file   :AccountServiceImpl.java
 * @story  :계좌 인터페이스
 */
public class AccountServiceImpl implements AccountService {
	AccountDAO dao = null;
	private AccountServiceImpl() {
		dao = AccountDAO.getInstance();
	}
	private static AccountServiceImpl instance = new AccountServiceImpl();
	public static AccountServiceImpl getInstance() {
		return instance;
	}
	public String openAccount(AccountBean account) {
		String msg = "";
		if (dao.findId(account.getId()) == 0) {
			msg = "존재하지 않는 ID 입니다.";
			return msg;
		}
		if (dao.insert(account) == 0){
			msg = "계좌개설 성공 했습니다.";
		} else{
			msg = "계좌개설을 실패 했습니다.";
		}
		return msg;
	}
	public String deposit(int inputMoney) {
		return null;
	}
	public String withdrawal(int output) {
		return null;
	}
	public String updateAccount(AccountBean acc) {
		return null;
	}
	public String deleteAccount() {
		return null;
	}
	public List<AccountBean> accountList() {
		return null;
	}
	public AccountBean findByAccountNo(String accountNo) {
		return null;
	}
	public List<AccountBean> findByName(String name) {
		return null;
	}
	public String count() {
		return null;
	}
	public int findId(String id) {
		return dao.findId(id);
	}

	
}
