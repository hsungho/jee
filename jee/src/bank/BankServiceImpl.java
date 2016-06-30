package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @date   :2016. 6. 27.
 * @author :ckan
 * @file   :BankServiceImpl.java 
 * @story  :
 */
public class BankServiceImpl implements BankService{
	List<AccountBean> list;
	public BankServiceImpl() {
		list = new Vector<AccountBean>();
	}
	public void openAccount(AccountBean account) {
		// 11개설(은행창구개설)
		list.add(account);
	}
	public List<AccountBean> accountList() {
		// return list.toString();
		return list;
	}
	public AccountBean findByAccountNo(String accountNo) {
		AccountBean accout = new AccountBean();
		int i = 0;
		for (; i < list.size(); i++) {
			if (String.valueOf(list.get(i).getAccountNo()).equals(accountNo)) {
				accout = list.get(i);
				break;
			}
		}
		return accout;
	}
	public List<AccountBean> findByName(String name) {
		List<AccountBean> tempList = new ArrayList<AccountBean>();
		int i = 0;
		for (; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				tempList.add(list.get(i));
			}
		}
		return tempList;
	}
	public String count() {
		// 15계좌수
		return "전체통장 갯수 : "+list.size();
		
	}
	public String updateAccount(AccountBean acc) {
		// 16 비번수정
		String result = "";
		AccountBean tempAcc = this.findByAccountNo(String.valueOf(acc.getAccountNo()));
		int i = 0;
		if (tempAcc.getId() == null) {
			result = "계좌번호가 존재하지않습니다.";
		} else {
			tempAcc.setPw(acc.getPw());
			result = "비밀번호 변경되었습니다.";
		}
		return result;
	}
	public String deleteAccount(String accNo) {
		// 17 삭제
		AccountBean tempAcc = this.findByAccountNo(accNo);
		String result = accNo+" 계좌가 없습니다.";
		int i = 0;
		if (!tempAcc.getId().equals("")) {
			list.remove(tempAcc);
		}
		return result;
	}

}
