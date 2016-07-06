package bank2;

import java.util.List;

/**
 * @date   :2016. 6. 27.
 * @author :ckan
 * @file   :BankService.java 
 * @story  :
 */
public interface BankService {
	// CREATE : 11개설
	public abstract void openAccount(AccountBean account);
	// READ 12조회(전체)
	public List<AccountBean> accountList();
	// READ 13조회(계좌번호)
	public AccountBean findByAccountNo(String accountNo);
	// READ 14조회(이름)
	public List<AccountBean> findByName(String name);
	// READ : 15조회(전체통장수)
	public String count();
	// UPDATE : 16 수정.. 사용자의 요청에 의해 비번만 전환가능
	public String updateAccount(AccountBean acc);// AccountNo,PW
	// DELETE : 17삭제
	public String deleteAccount(String accNo);// AccountNo
}
