package member;

public class StudentServiceImpl implements MemberService{
	MemberBean s;
	@Override
	public void openStudente(String name, String id, String pw, String ssn) {
		s = new MemberBean(name, id, pw, ssn);
		
	}
	@Override
	public String showStudente() {
		return s.toString();		
	}
	@Override
	public String updateStudente(String pw) {
		s.setPw(pw);
		return "PW 변경 되었습니다.";
	}
	@Override
	public String deleteStudente() {
		s = null;
		return "삭제 했습니다.";
	}
	
}
