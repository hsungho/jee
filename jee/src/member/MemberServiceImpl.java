package member;

public class MemberServiceImpl implements MemberService{
	MemberDAO dao = MemberDAO.getInstance(); // 싱글톤 패턴
	MemberBean s;
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public static MemberServiceImpl getInstance() {
		return instance;
	}
	private MemberServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void open(String name, String id, String pw, String ssn) {
		s = new MemberBean(name, id, pw, ssn);
	}
	@Override
	public String show() {
		dao.exeQuery("select * from member");
		return dao.toString();
	}
	@Override
	public String update(String pw) {
		s.setPw(pw);
		return "PW 변경 되었습니다.";
	}
	@Override
	public String delete() {
		s = null;
		return "삭제 했습니다.";
	}
	/*String sqlCreate = "create table member("
	+ "name varchar2(20),"
	+ "id varchar2(20) primary key,"
	+ "pw varchar2(20),"
	+ "ssn_id varchar2(8),"
	+ "reg_date varchar2(20) "
	+ ")";
String sqlDrop = "drop table member";
String sqlInsert = "insert into member"
	+ "(name,"
	+ "id,"
	+ "pw,"
	+ "ssn_id,"
	+ "reg_date"
	+ ")"
	+ "select '김유신',"
	+ "'kim',"
	+ "'1',"
	+ "'820101-1',"
	+ "'2016-06-30' "
	+ "from dual "
	+ "union all "
	+ "select '김혜수',"
	+ "'haesu',"
	+ "'1',"
	+ "'840101-2',"
	+ "'2014-06-30' "
	+ "from dual";
String sqlUpdate = "update member "
	+ "set pw = '100' "
	+ "where id = 'you'";
String sqlDelete = "delete member "
	+ "where id = 'you'";
String sqlQuery = "select * from member",result = "";
*/
}
