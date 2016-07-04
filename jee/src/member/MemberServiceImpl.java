package member;

import java.util.List;

public class MemberServiceImpl implements MemberService{
	MemberDAO dao = MemberDAO.getInstance(); // 싱글톤 패턴
	MemberBean s;
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public static MemberServiceImpl getInstance() {
		return instance;
	}
	private MemberServiceImpl() {
	}
	@Override
	public String open(MemberBean stu) {
		return (dao.insert(stu) == 1)?"회원가입 축하합니다.":"회원가입 실패";
	}
	@Override
	public String show() {
		return "";
	}
	@Override
	public String update(MemberBean stu) {
		return (dao.update(stu) == 1)?"PW 변경 되었습니다.":"PW 변경 실패했습니다.";
	}
	@Override
	public String delete(String id) {
		return (dao.delete(id) == 1)?"삭제 성공 입니다.":"삭제 실패입니다.";
	}
	public int count() {
		return dao.count();
	}
	public MemberBean findById(String id) {
		return dao.findById(id);
	}
	public List<MemberBean> list() {
		return dao.list();
	}
	public List<MemberBean> findByName(String name) {
		return dao.findByName(name);
	}
}
