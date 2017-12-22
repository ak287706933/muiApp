package com.hydee.hcrm.pojo;

public class Page {
	private int PageSize;//总记录数
	private int showSize;//显示记录
	private int index;//当前记录
	private int CurrentPageID;//当前页数
	private int munPages;//总页数
	private int maxPage;//最大页
	private int minPage;//最小页
	//当前登录用户的userid,方便不同用户登入显示的结果不相同
	private int userid;
	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return PageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}
	/**
	 * @return the showSize
	 */
	public int getShowSize() {
		return showSize;
	}
	/**
	 * @param showSize the showSize to set
	 */
	public void setShowSize(int showSize) {
		this.showSize = showSize;
	}
	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	/**
	 * @return the currentPageID
	 */
	public int getCurrentPageID() {
		return CurrentPageID;
	}
	/**
	 * @param currentPageID the currentPageID to set
	 */
	public void setCurrentPageID(int currentPageID) {
		CurrentPageID = currentPageID;
	}
	/**
	 * @return the munPages
	 */
	public int getMunPages() {
		return munPages;
	}
	/**
	 * @param munPages the munPages to set
	 */
	public void setMunPages(int munPages) {
		this.munPages = munPages;
	}
	/**
	 * @return the maxPage
	 */
	public int getMaxPage() {
		return maxPage;
	}
	/**
	 * @param maxPage the maxPage to set
	 */
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	/**
	 * @return the minPage
	 */
	public int getMinPage() {
		return minPage;
	}
	/**
	 * @param minPage the minPage to set
	 */
	public void setMinPage(int minPage) {
		this.minPage = minPage;
	}
	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}
	

}
