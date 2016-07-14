package test;

/**
 * @date :2016. 7. 14.
 *@author:황성호
 *@file  :ForTest.java
 *@story :
 */
public class ForTest {
	public static void main(String[] args) {
		int sum=0, i = 0;
		
		for (; i < 10; i++) {
			sum+=(i+1);
		}
		System.out.println(sum);
	}

}
