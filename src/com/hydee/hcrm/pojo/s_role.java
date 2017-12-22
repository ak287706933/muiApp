package com.hydee.hcrm.pojo;
//用户组
public class s_role {
	private Integer ROLEID;//用户组编号
	private String ROLENAME;//用户组名称
	private Integer ROLESTATUS;//用户组启用状态
	private int STAMP;//时间戳
	private int COMPID;//企业编号
	private String NOTES;//备注
	
	
	public s_role() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the rOLEID
	 */
	public Integer getROLEID() {
		return ROLEID;
	}
	/**
	 * @param rOLEID the rOLEID to set
	 */
	public void setROLEID(Integer rOLEID) {
		ROLEID = rOLEID;
	}
	/**
	 * @return the rOLENAME
	 */
	public String getROLENAME() {
		return ROLENAME;
	}
	/**
	 * @param rOLENAME the rOLENAME to set
	 */
	public void setROLENAME(String rOLENAME) {
		ROLENAME = rOLENAME;
	}
	/**
	 * @return the rOLESTATUS
	 */
	public Integer getROLESTATUS() {
		return ROLESTATUS;
	}
	/**
	 * @param rOLESTATUS the rOLESTATUS to set
	 */
	public void setROLESTATUS(Integer rOLESTATUS) {
		ROLESTATUS = rOLESTATUS;
	}
	/**
	 * @return the sTAMP
	 */
	public int getSTAMP() {
		return STAMP;
	}
	/**
	 * @param sTAMP the sTAMP to set
	 */
	public void setSTAMP(int sTAMP) {
		STAMP = sTAMP;
	}
	/**
	 * @return the cOMPID
	 */
	public int getCOMPID() {
		return COMPID;
	}
	/**
	 * @param cOMPID the cOMPID to set
	 */
	public void setCOMPID(int cOMPID) {
		COMPID = cOMPID;
	}
	/**
	 * @return the nOTES
	 */
	public String getNOTES() {
		return NOTES;
	}
	/**
	 * @param nOTES the nOTES to set
	 */
	public void setNOTES(String nOTES) {
		NOTES = nOTES;
	}
	
	
}
