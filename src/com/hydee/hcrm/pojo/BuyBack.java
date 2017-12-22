package com.hydee.hcrm.pojo;
//回购记录
public class BuyBack {
	private String warename;//药品名称
	private int wareid;//商品编码
	private String warespec;//商品规格
	private String factoryname;//生产企业
	private String lasttime;//上次购买时间
	private String usedtime;//预计用完时间
	private String remind;
	/**
	 * @return the warename
	 */
	public String getWarename() {
		return warename;
	}
	/**
	 * @param warename the warename to set
	 */
	public void setWarename(String warename) {
		this.warename = warename;
	}
	/**
	 * @return the wareid
	 */
	public int getWareid() {
		return wareid;
	}
	/**
	 * @param wareid the wareid to set
	 */
	public void setWareid(int wareid) {
		this.wareid = wareid;
	}
	/**
	 * @return the warespec
	 */
	public String getWarespec() {
		return warespec;
	}
	/**
	 * @param warespec the warespec to set
	 */
	public void setWarespec(String warespec) {
		this.warespec = warespec;
	}
	/**
	 * @return the factoryname
	 */
	public String getFactoryname() {
		return factoryname;
	}
	/**
	 * @param factoryname the factoryname to set
	 */
	public void setFactoryname(String factoryname) {
		this.factoryname = factoryname;
	}
	/**
	 * @return the lasttime
	 */
	public String getLasttime() {
		return lasttime;
	}
	/**
	 * @param lasttime the lasttime to set
	 */
	public void setLasttime(String lasttime) {
		this.lasttime = lasttime;
	}
	/**
	 * @return the usedtime
	 */
	public String getUsedtime() {
		return usedtime;
	}
	/**
	 * @param usedtime the usedtime to set
	 */
	public void setUsedtime(String usedtime) {
		this.usedtime = usedtime;
	}
	/**
	 * @return the remind
	 */
	public String getRemind() {
		return remind;
	}
	/**
	 * @param remind the remind to set
	 */
	public void setRemind(String remind) {
		this.remind = remind;
	}
	

}
