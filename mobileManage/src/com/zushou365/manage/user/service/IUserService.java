/**   
 * @Title: IUserService.java
 * @Package com.zushou365.manage.user.service
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
package com.zushou365.manage.user.service;

import java.util.List;

import com.zushou365.manage.comm.model.PagingBean;
import com.zushou365.manage.comm.service.IBaseService;
import com.zushou365.manage.user.model.User;

/**
 * @ClassName: IUserService
 * @Description: UserService接口
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
public interface IUserService extends IBaseService {
	
	/**
	 *根据Id删除操作
	 */
	int deleteById(Integer id);
	
	/**
	 *分页查询
	 */
	List<User> findPaging(PagingBean pagingBean);
}
