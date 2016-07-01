/**
 * 
 */
package member;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.ir.Optimistic;

/**
 * @date   :2016. 6. 17.
 * @author :ckan
 * @file   :SchoolControll1.java
 * @story  :
 */
public class MemberControll {
	public static void main(String[] args) { // String[] params
		MemberServiceImpl student = MemberServiceImpl.getInstance();
		while (true) {
			switch (JOptionPane.showInputDialog(null, "1 등록 2보기 3수정 4삭제 0종료")) {
			case "1":
				String open = JOptionPane.showInputDialog("이름,ID,PW,주민번호[800101-1]");
				String open1[] = open.split(",");
				student.open(open1[0], open1[1], open1[2], open1[3]);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, student.show());
				break;
			case "3":
				String pw = student.update(JOptionPane.showInputDialog("PW"));
				JOptionPane.showMessageDialog(null, student.update(pw));
				break;
			case "4":
				String op = student.delete();
				JOptionPane.showMessageDialog(null, student.delete());
				break;
			case "0":
				return;
			default:
				break;
			}
		}
	}
}
