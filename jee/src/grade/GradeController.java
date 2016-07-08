/**
 * 
 */
package grade;

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
		GradeServiceImpl service = GradeServiceImpl.getInstance();
		// -------------------- 연산부 (알고리즘)----------------------------------
		while (true) {	
			switch (JOptionPane.showInputDialog("1추가 2수정 3삭제 4전체조회 5학점을 포함한 시험내역 조회(SEQ)"
					+ "6시퀀스조회(ID) 7응시생수(시험일자별) 0종료")) {
			case "1":
				JOptionPane.showMessageDialog(null, service.score(JOptionPane.showInputDialog("ID,JAVA,SQL,HTML5,JavaScript,시험일자[2016-05] 입력").split(",")));
				break;
			case "2":
				GradeBean grade1 = new GradeBean();
				String mark1 = JOptionPane.showInputDialog("수정 SEQ,과목명,점수 입력");
				String arrayMark1[] = mark1.split(",");
				grade1.setSeq(Integer.parseInt(arrayMark1[0]));
				grade1.setClassName(arrayMark1[1]);
				grade1.setUpdatescore(Integer.parseInt(arrayMark1[2]));
				JOptionPane.showMessageDialog(null, service.update(grade1));
				break;
			case "3":
				GradeBean grade2 = new GradeBean();
				String mark2 = JOptionPane.showInputDialog("삭제 SEQ 입력");
				grade2.setSeq(Integer.parseInt(mark2));
				JOptionPane.showMessageDialog(null, service.delete(grade2));
				break;
			case "4":
				GradeUI ui = new GradeUI();
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.findBySeq(Integer.parseInt(JOptionPane.showInputDialog("조회 SEQ 입력"))));
				break;
			case "6":
				JOptionPane.showMessageDialog(null, service.findBy(JOptionPane.showInputDialog("조회 ID 입력")));
				break;
			case "7":
				JOptionPane.showMessageDialog(null, service.count(JOptionPane.showInputDialog("시험일자[2016-05] 입력"))+" 명");
				break;
			case "0":return;
			default:
				return;
			}
		}
	}
}
