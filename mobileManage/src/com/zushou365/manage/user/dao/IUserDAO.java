/**   
 * @Title: IUserDAO.java
 * @Package com.zushou365.manage.user.dao
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
package com.zushou365.manage.user.dao;

import java.util.List;

import com.zushou365.manage.comm.dao.IBaseDAO;
import com.zushou365.manage.comm.model.BaseEntity;
import com.zushou365.manage.comm.model.PagingBean;
import com.zushou365.manage.user.model.User;

/**
 * @ClassName: IUserDAO
 * @Description: UserDAO接口
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
public interface IUserDAO extends IBaseDAO {

	/**
	 *根据Id删除操作
	 */
	int deleteById(Integer id);
	
	/**
	 *分页查询
	 */
	List<User> findPaging(PagingBean pagingBean);
}
