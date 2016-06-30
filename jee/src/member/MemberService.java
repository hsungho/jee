/**
 * 
 */
package member;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date   :2016. 6. 17.
 * @author :ckan
 * @file   :StudentService.java
 * @story  :
 */
public interface MemberService {
	public void openStudente(String name,String id,String pw,String ssn);
	public String showStudente();
	public String updateStudente(String pw);
	public String deleteStudente();
}
