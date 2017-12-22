package com.hydee.hcrm.pojo;

public class t_crm_activity {
	private String ACTIVEID;
	private String ACTIVENAME;
	private String TYPE;
	private String SENDATE;
	private String MESSAGETEXT;
	private String LIST;
	private String CREATEUSER;
	private String CREATETIME;
	private String COMPID;
	
	public t_crm_activity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public t_crm_activity(String aCTIVEID, String aCTIVENAME, String tYPE,
			String sENDATE, String mESSAGETEXT, String lIST, String cREATEUSER,
			String cREATETIME, String cOMPID) {
		super();
		ACTIVEID = aCTIVEID;
		ACTIVENAME = aCTIVENAME;
		TYPE = tYPE;
		SENDATE = sENDATE;
		MESSAGETEXT = mESSAGETEXT;
		LIST = lIST;
		CREATEUSER = cREATEUSER;
		CREATETIME = cREATETIME;
		COMPID = cOMPID;
	}
	/**
	 * @return the aCTIVEID
	 */
	public String getACTIVEID() {
		return ACTIVEID;
	}
	/**
	 * @param aCTIVEID the aCTIVEID to set
	 */
	public void setACTIVEID(String aCTIVEID) {
		ACTIVEID = aCTIVEID;
	}
	/**
	 * @return the aCTIVENAME
	 */
	public String getACTIVENAME() {
		return ACTIVENAME;
	}
	/**
	 * @param aCTIVENAME the aCTIVENAME to set
	 */
	public void setACTIVENAME(String aCTIVENAME) {
		ACTIVENAME = aCTIVENAME;
	}
	/**
	 * @return the tYPE
	 */
	public String getTYPE() {
		return TYPE;
	}
	/**
	 * @param tYPE the tYPE to set
	 */
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	/**
	 * @return the sENDATE
	 */
	public String getSENDATE() {
		return SENDATE;
	}
	/**
	 * @param sENDATE the sENDATE to set
	 */
	public void setSENDATE(String sENDATE) {
		SENDATE = sENDATE;
	}
	/**
	 * @return the mESSAGETEXT
	 */
	public String getMESSAGETEXT() {
		return MESSAGETEXT;
	}
	/**
	 * @param mESSAGETEXT the mESSAGETEXT to set
	 */
	public void setMESSAGETEXT(String mESSAGETEXT) {
		MESSAGETEXT = mESSAGETEXT;
	}
	/**
	 * @return the lIST
	 */
	public String getLIST() {
		return LIST;
	}
	/**
	 * @param lIST the lIST to set
	 */
	public void setLIST(String lIST) {
		LIST = lIST;
	}
	/**
	 * @return the cREATEUSER
	 */
	public String getCREATEUSER() {
		return CREATEUSER;
	}
	/**
	 * @param cREATEUSER the cREATEUSER to set
	 */
	public void setCREATEUSER(String cREATEUSER) {
		CREATEUSER = cREATEUSER;
	}
	/**
	 * @return the cREATETIME
	 */
	public String getCREATETIME() {
		return CREATETIME;
	}
	/**
	 * @param cREATETIME the cREATETIME to set
	 */
	public void setCREATETIME(String cREATETIME) {
		CREATETIME = cREATETIME;
	}
	/**
	 * @return the cOMPID
	 */
	public String getCOMPID() {
		return COMPID;
	}
	/**
	 * @param cOMPID the cOMPID to set
	 */
	public void setCOMPID(String cOMPID) {
		COMPID = cOMPID;
	}
	

}
