package grade;

import java.util.List;

public class GradeServiceImpl implements GradeService{
	GradeDAO dao = GradeDAO.getInstance();
	private static GradeServiceImpl instance = new GradeServiceImpl();
	
	public static GradeServiceImpl getInstance() {
		return instance;
	}
	private GradeServiceImpl() {
	}
	GradeBean grad = GradeBean.getInstance();	
	int total = 0,avg = 0;
	String grade = "",result = "";
	public int insert(GradeBean grade) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(GradeBean grade) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(GradeBean grade) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<GradeBean> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<GradeBean> findByHakjum() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public GradeBean findBySeq() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
}
