/**   
 * @Title: BaseDAOImpl.java
 * @Package com.zushou365.manage.comm.dao.impl
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
package com.zushou365.manage.comm.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zushou365.manage.comm.dao.HibernateBaseDAO;
import com.zushou365.manage.comm.dao.IBaseDAO;
import com.zushou365.manage.comm.model.BaseEntity;
import com.zushou365.manage.comm.model.PagingBean;
import com.zushou365.manage.comm.model.abstraction.QueryResult;

/**
 * @ClassName: BaseDAOImpl
 * @Description: 抽象DAO实现类
 *               <p>
 * @author willter
 * @date 2012-9-4
 */
@Repository("baseDAO")
public abstract class BaseDAOImpl extends HibernateBaseDAO implements IBaseDAO {

	/**
	 *查询所有
	 */
	public List findAll() {
		return super.findAll(BaseEntity.class);
	}

	/**
	 *根据HQL查询
	 */
	public QueryResult findByHQL(String hql) {
		return super.findByHQL(hql);
	}

	/**
	 *根据实例查询
	 */
	public QueryResult findByExample(BaseEntity example) {
		return super.findByExample(example);
	}

	/**
	 *根据属性名查询
	 */
	public QueryResult findByProperty(String propertyName, Object value) {
		return super.findByProperty(BaseEntity.class, propertyName, value);
	}

	/**
	 *根据ID查询
	 */
	public BaseEntity findById(Serializable id) {
		return (BaseEntity) super.findById(BaseEntity.class, id);
	}

	/**
	 *新增操作
	 */
	public void add(BaseEntity example) {
		super.save(example);
	}

	/**
	 *更新操作
	 */
	public void update(BaseEntity example) {
		super.update(example);
	}

	/**
	 *删除操作
	 */
	public void delete(BaseEntity example) {
		super.delete(example);
	}

	/**
	 *根据Id删除操作
	 */
	public int deleteById(String tableName, Integer id) {
		return super.executeUpdate("delete from " + tableName + " o where o.id = ?", id);
	}

	/**
	 *分页查询
	 */
	public List findPaging(String tableName, PagingBean pagingBean) {
		return super.findPaging("select o from " + tableName + " o", pagingBean);
	}
}
