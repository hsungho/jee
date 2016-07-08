package account;

import java.util.Comparator;

/**
 * @date   :2016. 7. 8.
 * @author :ckan
 * @file   :NameAscSort.java 
 * @story  :
 */
public class AccountNoAscSort implements Comparator<AccountMemberBean>{
	public int compare(AccountMemberBean first,AccountMemberBean second){
		int a = 0;
		if (first.getAccountNo()>second.getAccountNo()) {
			a = 1;
		} else {
			if (first.getAccountNo()<second.getAccountNo()) {
				a = -1;
			} else {
				a = 0;
			}

		}
		return a;
	}
}
