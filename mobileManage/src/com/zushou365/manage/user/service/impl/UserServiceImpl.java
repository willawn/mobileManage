/**   
 * @Title: UserServiceImpl.java
 * @Package com.zushou365.manage.user.service.impl
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
package com.zushou365.manage.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zushou365.manage.comm.model.BaseEntity;
import com.zushou365.manage.comm.model.PagingBean;
import com.zushou365.manage.comm.service.impl.BaseServiceImpl;
import com.zushou365.manage.user.dao.IUserDAO;
import com.zushou365.manage.user.model.User;
import com.zushou365.manage.user.service.IUserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: UserService实现类
 *               <p>
 * @author willter
 * @date 2012-9-4
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements IUserService {

	@Autowired
	private IUserDAO userDAO;

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	/**
	 *根据Id删除操作
	 */
	public int deleteById(Integer id) {
		return userDAO.deleteById(id);
	}

	/**
	 *分页查询
	 */
	public List<User> findPaging(PagingBean pagingBean) {
		return (List<User>) userDAO.findPaging(pagingBean);
	}
}
