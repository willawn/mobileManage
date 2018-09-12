/**   
 * @Title: PagingBean.java
 * @Package com.zushou365.utils
 * @Description: TODO(描述文件)
 * 		<p>
 * @author willter
 * @date 2012-9-4
 */
package com.zushou365.manage.comm.model;

/**
 * @ClassName: PagingBean
 * @Description: TODO(分页功能辅助类)
 *               <p>
 * @author willter
 * @date 2012-9-4
 */
public class PagingBean {

	private int maxPages;// 总页数

	private int maxRows;// 总行数

	private int currentPage = 1;// 当前页,默认为起始页为第一页

	private int pageRows = 10;// 每页行数

	private int beginRow = 0;// 起始行索引，默认第一行

	/**
	 * 默认构造方法
	 * 
	 */
	public PagingBean() {

	}

	/**
	 * 默认每页为10行
	 * 
	 * @param maxRows
	 *            总行数
	 */
	public PagingBean(int maxRows) {
		this.maxRows = maxRows;
		maxPageCount();
	}

	/**
	 * 构造方法
	 * 
	 * @param maxRows
	 *            总行数
	 * @param pageRows
	 *            每页行数
	 */
	public PagingBean(int maxRows, int pageRows) {
		this.maxRows = maxRows;
		this.pageRows = pageRows;
		maxPageCount();
	}

	/**
	 * 设置每页多少行
	 * 
	 * @param rows
	 */
	public void setPageRows(int rows) {
		this.pageRows = rows;
		maxPageCount();
	}

	/**
	 * 设置总行数
	 * 
	 * @param maxRows
	 */
	public void setMaxRows(int maxRows) {
		this.maxRows = maxRows;
		maxPageCount();
	}

	//
	// 计算总页数
	//
	private void maxPageCount() {
		maxPages = ((maxRows + pageRows) - 1) / pageRows;
	}

	/**
	 * 获取行的起始位置
	 * 
	 * @return
	 */
	public int getBeginRow() {

		return (currentPage - 1) * pageRows;
	}

	/**
	 * 设置行的起始位置
	 * 
	 */
	public void setBeginRow(int beginRow) {
		this.beginRow = beginRow;
		if (beginRow == 0) {
			currentPage = 1;
		} else {
			int result = beginRow % pageRows;
			if (result == 0) {
				currentPage = beginRow / pageRows;
			} else {
				currentPage = beginRow / pageRows + 1;
			}
		}
	}

	/**
	 * 获取行的结束位置
	 * 
	 * @return
	 */
	public int getEndRow() {
		int end = currentPage * pageRows;
		if (end > maxRows) {
			return maxRows;
		}
		return end;
	}

	/**
	 * 获取当前页
	 * 
	 * @return 当前页
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * 检索是否有上一页
	 * 
	 * @return
	 */
	public boolean hasPrevious() {
		if (currentPage > 1) {
			return true;
		}
		return false;
	}

	/**
	 * 检索是否有下一页
	 * 
	 * @return
	 */
	public boolean hasNext() {
		if (currentPage < maxPages) {
			return true;
		}
		return false;
	}

	/**
	 * 设置当前页数
	 * 
	 * @param pageNumber
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * 获取总页数
	 * 
	 * @return
	 */
	public int getMaxPages() {
		return maxPages;
	}

	/**
	 * 获取总行数
	 * 
	 * @return
	 */
	public int getMaxRows() {
		return maxRows;
	}

	/**
	 * 获取每页的行数
	 * 
	 * @return
	 */
	public int getPageRows() {
		return pageRows;
	}
}
