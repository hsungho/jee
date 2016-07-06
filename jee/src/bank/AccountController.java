/**
 * 
 */
package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import global.Constants;

/**
 * @date   :2016. 6. 15.
 * @author :ckan
 * @file   :BankController.java
 * @story  :
 */
public class AccountController {
	AccountService service = AccountServiceImpl.getInstance();
	public static void main(String[] args) {
		// 1개설 2입금 3출금 4수정 5해지 6조회(전체) 7조회(계좌번호) 8조회(이름) 9조회(전체통장수)
		while (true) {
			switch (JOptionPane.showInputDialog("1개설 2입금 3출금 4수정 5해지 "
					+ "6조회(전체) 7조회(계좌번호) 8조회(이름) 9조회(전체통장수) 0종료")) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				break;
			case "7":
				break;
			case "8":
				break;
			case "9":
				break;
			case "0":
				return;
			default:
				return;
			}
		}
	}

}
