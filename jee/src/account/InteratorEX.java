package account;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @date   :2016. 7. 8.
 * @author :ckan
 * @file   :InteratorEX.java 
 * @story  :
 */
public class InteratorEX {
	private static int Comparator;

	public static void main(String[] args) {
		Map<?,?> map = new HashMap<String,AccountMemberBean>();
		AccountDAO dao = AccountDAO.getInstance();
		map = dao.selectMap();
		Set<?> keyset = map.keySet();
		Iterator<?> it = keyset.iterator();
		while (it.hasNext()) {
			String key = (String)it.next();
			//System.out.println(map.get(key));
		}
		
		Collection<?> accounts = map.values();
		it = accounts.iterator();
		List<AccountMemberBean> arryList = new ArrayList<AccountMemberBean>();
		while (it.hasNext()) {
			AccountMemberBean amb = (AccountMemberBean) it.next();
			arryList.add(amb);
		}
		Collections.sort(arryList,new NameAscSort());
		for (int i = 0; i < arryList.size(); i++) {
			//System.out.println(arryList.get(i)+"\n");
		}
		Collections.sort(arryList,new AccountNoAscSort());
		for (int i = 0; i < arryList.size(); i++) {
			System.out.println(arryList.get(i));
		}
	}
}
