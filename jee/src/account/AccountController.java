/**
 * 
 */
package account;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import global.Constants;
import grade.GradeUI;

/**
 * @date   :2016. 6. 15.
 * @author :ckan
 * @file   :BankController.java
 * @story  :
 */
public class AccountController {
	
	public static void main(String[] args) {
		AccountService service = AccountServiceImpl.getInstance();
		// 1개설 2입금 3출금 4수정 5해지 6조회(전체) 7조회(계좌번호) 8조회(이름) 9조회(전체통장수)
		while (true) {
			switch (JOptionPane.showInputDialog("1개설 2입금 3출금 4수정 5해지 "
					+ "6조회(전체) 7조회(계좌번호) 8조회(이름) 9조회(전체통장수) 0종료")) {
			case "1":
				String spec = JOptionPane.showInputDialog("이름,ID,PW 입력");
				JOptionPane.showMessageDialog(null, service.openAccount(spec));
				break;
			case "2":
				String spec1 = JOptionPane.showInputDialog("계좌번호,입금액 입력");
				String specArry1[] = spec1.split(",");
				JOptionPane.showMessageDialog(null, service.deposit(Integer.parseInt(specArry1[0]), Integer.parseInt(specArry1[1])));
				JOptionPane.showMessageDialog(null, service.findByAccountNo(Integer.parseInt(specArry1[0])));
				break;
			case "3":
				AccountBean account2 = new AccountBean();
				String spec2 = JOptionPane.showInputDialog("계좌번호,비밀번호,출금액 입력");
				String specArry2[] = spec2.split(",");
				account2.setAccountNo(Integer.parseInt(specArry2[0]));
				account2.setPw(specArry2[1]);
				account2.setMoney(Integer.parseInt(specArry2[2]));
				JOptionPane.showMessageDialog(null, service.withdrawal(account2));
				JOptionPane.showMessageDialog(null, service.findByAccountNo(Integer.parseInt(specArry2[0])));
				break;
			case "4":
				AccountBean account3 = new AccountBean();
				String spec3 = JOptionPane.showInputDialog("계좌번호,비밀번호,변경비밀번호 입력");
				String specArry3[] = spec3.split(",");
				account3.setAccountNo(Integer.parseInt(specArry3[0]));
				account3.setPw(specArry3[1]);
				account3.setChagePw(specArry3[2]);
				JOptionPane.showMessageDialog(null, service.updateAccount(account3));
				break;
			case "5":
				String spec4 = JOptionPane.showInputDialog("해지 계좌번호 입력");
				JOptionPane.showMessageDialog(null, service.deleteAccount(Integer.parseInt(spec4)));
				break;
			case "6":
				//JOptionPane.showMessageDialog(null, service.accountList());
				AccountUI ui2 = new AccountUI();
				break;
			case "7":
				String spec5 = JOptionPane.showInputDialog("조회 계좌번호 입력");
				JOptionPane.showMessageDialog(null, service.findByAccountNo(Integer.parseInt(spec5)));
				break;
			case "8":
				String spec6 = JOptionPane.showInputDialog("조회 성명 입력");
				JOptionPane.showMessageDialog(null, service.findByName(spec6));
				break;
			case "9":
				JOptionPane.showMessageDialog(null, service.count()+" 건 조회");
				break;
			case "0":
				return;
			default:
				return;
			}
		}
	}
}
