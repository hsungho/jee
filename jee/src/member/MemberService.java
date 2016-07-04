/**
 * 
 */
package member;

import java.util.List;

/**
 * @date   :2016. 6. 17.
 * @author :ckan
 * @file   :StudentService.java
 * @story  :
 */
public interface MemberService {
	public String open(MemberBean stu);
	public String show();
	public String update(MemberBean stu);
	public String delete(String id);
	public int count();
	public List<MemberBean> list();
	public List<MemberBean> findByName(String name);
	public MemberBean findById(String id);
}
