package grade;

public class GradeBean {
	private String name,hakjum;
	private int kor,eng,math,seq;
	private static GradeBean instance = new GradeBean();
	private GradeBean() {
	}
	
	public static GradeBean getInstance() {
		return instance;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public String getHakjum() {
		return hakjum;
	}
	public void setHakjum(String hakjum) {
		this.hakjum = hakjum;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
