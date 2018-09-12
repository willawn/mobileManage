/**   
 * @Title: UserDAOImpl.java
 * @Package com.zushou365.manage.user.dao.impl
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
package com.zushou365.manage.user.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zushou365.manage.comm.dao.impl.BaseDAOImpl;
import com.zushou365.manage.comm.model.PagingBean;
import com.zushou365.manage.user.dao.IUserDAO;
import com.zushou365.manage.user.model.User;

/**
 * @ClassName: UserDAOImpl
 * @Description: UserDAO实现类
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
@Repository("userDAO")
public class UserDAOImpl extends BaseDAOImpl implements IUserDAO {

	/**
	 *根据Id删除操作
	 */
	public int deleteById(Integer id) {
		return super.deleteById("com.zushou365.manage.user.model.User", id);
	}

	/**
	 *分页查询
	 */
	public List<User> findPaging(PagingBean pagingBean) {
		return super.findPaging("com.zushou365.manage.user.model.User", pagingBean);
	}
}
