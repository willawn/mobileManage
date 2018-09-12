package com.zushou365.manage.comm.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zushou365.manage.comm.model.PagingBean;
import com.zushou365.manage.comm.model.abstraction.QueryResult;

/**
 * @ClassName: HibernateBaseDAO
 * @Description: Hibernate DAO 辅助类
 *               <p>
 * @author willter
 * @date 2012-9-4
 */
public class HibernateBaseDAO extends HibernateDaoSupport {

	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	public void setSessionFactoryOverride(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	/**
	 * 新增
	 * 
	 * @param transientInstance
	 */
	public void save(Object transientInstance) {
		getHibernateTemplate().save(transientInstance);
	}

	/**
	 * 更新
	 * 
	 * @param transientInstance
	 */
	public void update(Object transientInstance) {
		getHibernateTemplate().update(transientInstance);
	}

	/**
	 * 删除
	 * 
	 * @param persistentInstance
	 */
	public void delete(Object persistentInstance) {
		getHibernateTemplate().delete(persistentInstance);
	}

	/**
	 * 创建Criteria
	 * 
	 * @param clz
	 * @return
	 */
	protected Criteria createCriteria(Class clz) {
		return super.getSession().createCriteria(clz);
	}

	/**
	 * 创建Query
	 * 
	 * @param hql
	 * @return
	 */
	protected Query createQuery(String hql) {
		return super.getSession().createQuery(hql);
	}

	/**
	 * 转化动态结果
	 * 
	 * @param c
	 * @return
	 */
	protected QueryResult toQueryResult(final Criteria c) {
		return new QueryResult() {

			public List getList() {
				return c.list();
			}

			public Object getUniqueResult() {
				return c.uniqueResult();
			}
		};
	}

	/**
	 * 转化动态结果
	 * 
	 * @param q
	 * @return
	 */
	protected QueryResult toQueryResult(final Query q) {
		return new QueryResult() {

			public List getList() {
				return q.list();
			}

			public Object getUniqueResult() {
				return q.uniqueResult();
			}
		};
	}

	/**
	 * 更加ID查询
	 * 
	 * @param clz
	 * @param id
	 * @return
	 */
	public Object findById(Class clz, Serializable id) {
		Object instance = getHibernateTemplate().get(clz, id);
		return instance;
	}

	/**
	 * 根据实例查询
	 * 
	 * @param instance
	 * @return
	 */
	public QueryResult findByExample(Object instance) {
		Criteria c = createCriteria(instance.getClass());
		c.add(Example.create(instance));
		return toQueryResult(c);
	}

	/**
	 * 查询所有
	 * 
	 * @param clz
	 * @return
	 */
	public QueryResult find(Class clz) {
		final Criteria c = createCriteria(clz);
		return toQueryResult(c);
	}

	/**
	 * 合并
	 * 
	 * @param detachedInstance
	 * @return
	 */
	public Object merge(Object detachedInstance) {
		Object result = (Object) getHibernateTemplate().merge(detachedInstance);
		return result;

	}

	/**
	 * 保存或更新，会粘上脏数据
	 * 
	 * @param instance
	 */
	public void attachDirty(Object instance) {
		getHibernateTemplate().saveOrUpdate(instance);

	}

	/**
	 * 清除缓存数据
	 * 
	 * @param instance
	 */
	public void attachClean(Object instance) {
		getHibernateTemplate().lock(instance, LockMode.NONE);

	}

	/**
	 * 更加属性查询
	 * 
	 * @param clz
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public QueryResult findByProperty(Class clz, String propertyName, Object value) {
		Criteria c = createCriteria(clz);
		c.add(Restrictions.eq(propertyName, value));
		return toQueryResult(c);
	}

	/**
	 * 查询所有
	 * 
	 * @param clz
	 * @return
	 */
	public List findAll(Class clz) {
		return find(clz).getList();
	}

	/**
	 * 查询后进行分页
	 * 
	 * @param hql
	 * @param pagingBean
	 * @param params
	 * @return
	 */
	public List findPaging(String hql, PagingBean pagingBean, Object... params) {
		final Query q = createQuery(hql);
		for (int i = 0, len = params.length; i < len; i++) {
			q.setParameter(i, params[i]);
		}
		q.setFirstResult(pagingBean.getBeginRow());
		q.setMaxResults(pagingBean.getPageRows());
		
		QueryResult total = findByHQL(hql, params);
		pagingBean.setMaxRows(total.getList().size());

		return q.list();
	}

	/**
	 * 根据HQL语句执行查询，并返回动态结果集
	 * 
	 * @param hql
	 * @return
	 */
	public QueryResult findByHQL(String hql, Object... params) {
		final Query q = createQuery(hql);
		for (int i = 0, len = params.length; i < len; i++) {
			q.setParameter(i, params[i]);
		}
		return new QueryResult() {
			public List getList() {
				return q.list();
			}

			public Object getUniqueResult() {
				return q.uniqueResult();
			}
		};
	}

	/**
	 * 执行更新
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	public int executeUpdate(String hql, Object... params) {
		final Query q = createQuery(hql);
		for (int i = 0, len = params.length; i < len; i++) {
			q.setParameter(i, params[i]);
		}
		return q.executeUpdate();
	}

	/**
	 * 用Hql查询复杂结果化数据并分页
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Object[]> findComplexPaging(String hql, PagingBean pagingBean, Object... params) {
		final Query q = createQuery(hql);
		for (int i = 0, len = params.length; i < len; i++) {
			q.setParameter(i, params[i]);
		}
		q.setFirstResult(pagingBean.getBeginRow());
		q.setMaxResults(pagingBean.getPageRows());
		return q.list();
	}

	/**
	 * 用Hql查询复杂结果化数据
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	public QueryResult<Object[]> findComplexByHQL(String hql, Object... params) {
		final Query q = createQuery(hql);
		for (int i = 0, len = params.length; i < len; i++) {
			q.setParameter(i, params[i]);
		}
		return new QueryResult<Object[]>() {
			@SuppressWarnings("unchecked")
			public List<Object[]> getList() {
				return q.list();
			}

			public Object[] getUniqueResult() {
				return (Object[]) q.uniqueResult();
			}
		};
	}
}
