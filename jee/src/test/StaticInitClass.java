package test;

/**
 * @date   :2016. 7. 1.
 * @author :ckan
 * @file   :StticInitClass.java 
 * @story  :
 */
public class StaticInitClass {
	static{
		System.out.println("스태틱 초기화블록 샐행중...");
	} // 클래스 초기화블록
	{
		System.out.println("인스턴스 초기화블록 샐행중...");
	}// 인스턴스 초기화블록
	public StaticInitClass(){
		System.out.println("생성자 실행중...");
	} // 생성자(초기화)
}
