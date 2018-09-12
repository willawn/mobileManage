/**   
 * @Title: QueryResult.java
 * @Package com.zushou365.manage.comm.model.abstraction
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
package com.zushou365.manage.comm.model.abstraction;

import java.util.List;

/**
 * @ClassName: QueryResult
 * @Description: 动态结果
 *               <p>
 * @author willter
 * @date 2012-9-4
 * 
 */
public interface QueryResult<T> {

	/**
	 * 以集合形式获取
	 * 
	 * @return
	 */
	public List<T> getList();

	/**
	 * 以单一实例对象形式获取
	 * 
	 * @return
	 */
	public T getUniqueResult();
}
