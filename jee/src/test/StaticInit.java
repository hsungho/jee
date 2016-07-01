package test;

import global.Constants;

/**
 * @date   :2016. 7. 1.
 * @author :ckan
 * @file   :StaticInit.java 
 * @story  : 스태틱 초기화 블록
 */
public class StaticInit {
	public static void main(String[] args) {
		StaticInitClass a1 = new StaticInitClass();
		System.out.println("-------------------");
		StaticInitClass a2 = new StaticInitClass();
		System.out.println("-------------------");
		StaticInitClass a3 = new StaticInitClass();
		System.out.println("-------------------");
	}
}
