package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date :2016. 7. 13.
 *@author:황성호
 *@file  :Clock.java
 *@story :
 */
public class Clock {
	public String now(){
	  return new SimpleDateFormat().format(new Date());	
	
	}
}
