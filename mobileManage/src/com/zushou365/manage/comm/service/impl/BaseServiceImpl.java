/**   
 * @Title: BaseServiceImpl.java
 * @Package com.zushou365.manage.comm.service.impl
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
package com.zushou365.manage.comm.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zushou365.manage.comm.dao.IBaseDAO;
import com.zushou365.manage.comm.model.BaseEntity;
import com.zushou365.manage.comm.model.PagingBean;
import com.zushou365.manage.comm.model.abstraction.QueryResult;
import com.zushou365.manage.comm.service.IBaseService;

/**
 * @ClassName: BaseServiceImpl
 * @Description: 抽象Service实现类
 *               <p>
 * @author willter
 * @date 2012-9-4
 */
@Service("baseService")
public abstract class BaseServiceImpl implements IBaseService {

	private IBaseDAO baseDAO;

	public IBaseDAO getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(IBaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}
	
	/**
	 *查询所有
	 */
	public List findAll() {
		return baseDAO.findAll();
	}

	/**
	 *根据HQL查询
	 */
	public QueryResult findByHQL(String hql) {
		return baseDAO.findByHQL(hql);
	}

	/**
	 *根据实例查询
	 */
	public QueryResult findByExample(BaseEntity example) {
		return baseDAO.findByExample(example);
	}

	/**
	 *根据属性名查询
	 */
	public QueryResult findByProperty(String propertyName, Object value) {
		return baseDAO.findByProperty(propertyName, value);
	}

	/**
	 *根据ID查询
	 */
	public BaseEntity findById(Serializable id) {
		return (BaseEntity) baseDAO.findById(id);
	}

	/**
	 *新增操作
	 */
	public void add(BaseEntity example) {
		baseDAO.add(example);
	}

	/**
	 *更新操作
	 */
	public void update(BaseEntity example) {
		baseDAO.update(example);
	}

	/**
	 *删除操作
	 */
	public void delete(BaseEntity example) {
		baseDAO.delete(example);
	}

	/**
	 *根据Id删除操作
	 */
	public int deleteById(String tableName, Integer id) {
		return baseDAO.deleteById(tableName, id);
	}
	
	/**
	 *分页查询
	 */
	public List findPaging(String tableName, PagingBean pagingBean) {
		return baseDAO.findPaging(tableName, pagingBean);
	}
}
