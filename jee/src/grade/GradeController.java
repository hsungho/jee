/**
 * 
 */
package grade;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 8.
 * @author :ckan
 * @file   :Avg.java
 * @story  :평균값 구하기 예제
 */
public class GradeController {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 국,영,수 세과목점수를 입력받아서
	 * [홍길동 : 총점 ***점, 평균***점,학점 : F
	 * 을 출력하는 프로그램을 만들어 주세요.
	 * 단) 평균은 소수점이하는 절삭합니다.
	 * 평균점수가 90점 이상 A 
	 * 80점 이상이면 B
	 * 70점 이상이면 C
	 * 60점 이상이면 D
	 * 50점 이상이면 E
	 * 40점 이상이면 F 학점입니다라고
	 * 출력되게 해주세요
	 * 단] switch case 문으로 변경
	 */
	public static void main(String[] args) {
		GradeService gsr = new GradeServiceImpl();
		// -------------------- 연산부 (알고리즘)----------------------------------
		while (true) {	
			switch (JOptionPane.showInputDialog("1 계속 0종료")) {
			case "1":
				gsr.setName(JOptionPane.showInputDialog("이름 : "));
				String subavg = JOptionPane.showInputDialog("점수 과목,과목1,과목2,.,.,. : ");
				String open1[] = subavg.split(",");
				for (int i = 0; i < open1.length; i++) {
					if (Integer.parseInt(open1[i]) > 100 || Integer.parseInt(open1[i]) < 0){
						JOptionPane.showMessageDialog(null, "점수는 0~100 까지 가능합니다.");
						continue;
					}
				}
				gsr.setAvg(subavg);
				JOptionPane.showMessageDialog(null, gsr.setGrade());
				break;
			default:
				return;
			}
		}
	}
}
