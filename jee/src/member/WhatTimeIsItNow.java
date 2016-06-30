/**
 * 
 */
package member;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date   :2016. 6. 17.
 * @author :ckan
 * @file   :WhatTimeIsItNow.java
 * @story  :
 */
public class WhatTimeIsItNow {
	public static void main(String[] args) {
		/*long time = System.currentTimeMillis();
		System.out.println(time);
		Date date = new Date(time);
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));*/
		String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		System.out.println(now);
		String[] arr = now.split("-");
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
