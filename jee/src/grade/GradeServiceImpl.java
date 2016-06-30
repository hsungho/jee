package grade;

public class GradeServiceImpl implements GradeService{
	GradeBean grad = new GradeBean();	
	int total = 0,avg = 0;
	String grade = "",result = "";
	@Override
	public void setAvg(String subject) {
        avg = 0;
        total = 0;
		String open1[] = subject.split(",");
        for (int i = 0; i < open1.length; i++) {
			total += Integer.parseInt(open1[i]);
		}
		avg = total/open1.length;
	}
	@Override
	public String setGrade() {
		switch (avg/10) {
		case 10:case 9:
			grade = "A";
			break;
		case 8:	
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:	
			grade = "D";
			break;
		case 5:	
			grade = "E";
			break;
		case 4: case 3: case 2: case 1:	
			grade = "F";
			break;

		default:
			result = "평균 점수는 0~100 까지 가능 합니다. ";
			break;
		}
		return "[이름= "+ grad.getName() +" 총점= " + total + " 평균= " + avg + " 학점=" + grade + "]";
	}
	@Override
	public void setName(String Name) {
		grad.setName(Name);
	}
}
