/**   
 * @Title: IBaseDAO.java
 * @Package com.zushou365.manage.comm.dao
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
package com.zushou365.manage.comm.dao;

import java.io.Serializable;
import java.util.List;

import com.zushou365.manage.comm.model.BaseEntity;
import com.zushou365.manage.comm.model.PagingBean;
import com.zushou365.manage.comm.model.abstraction.QueryResult;

/**
 * @ClassName: IBaseDAO
 * @Description: 抽象DAO接口
 *               <p>
 * @author willter
 * @date 2012-9-4
 */
public abstract interface IBaseDAO {

	/**
	 *查询所有
	 */
	List findAll();

	/**
	 *根据HQL查询
	 */
	QueryResult findByHQL(String hql);

	/**
	 *根据实例查询
	 */
	QueryResult findByExample(BaseEntity example);

	/**
	 *根据属性名查询
	 */
	QueryResult findByProperty(String propertyName, Object value);

	/**
	 *根据ID查询
	 */
	BaseEntity findById(Serializable id);

	/**
	 *新增操作
	 */
	void add(BaseEntity example);

	/**
	 *更新操作
	 */
	void update(BaseEntity example);

	/**
	 *删除操作
	 */
	void delete(BaseEntity example);

	/**
	 *根据Id删除操作
	 */
	int deleteById(String tableName, Integer id);
	
	/**
	 *分页查询
	 */
	List findPaging(String tableName, PagingBean pagingBean);
}
