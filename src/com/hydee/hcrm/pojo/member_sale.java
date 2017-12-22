package com.hydee.hcrm.pojo;
//电话反馈记录
public class member_sale {
	private int COMPID;//企业编号
	private String MEMCARDNO;//会员卡号
	private int BUSNO;//业务机构编码
	private int CALLER;//打电话人员
	private int CALLTIME;//打电话时长
	private String RECOMMENDED_CONTENT;//推荐内容
	private String MEMCARD_REPLY;//会有答复
	private String NOTES;//备注
	private String MEMBER_SALENO;//回访档案编号
	private int CREATEUSER;//创建人
	private String CREATETIME;//创建时间
	private int LASTMODIFY;//最后修改人
	private String LASTTIME;//最后修改时间
	private int STATUS;	//状态
	private int FEEDID;//药店加回访Id
	
	public member_sale() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the mEMCARDNO
	 */
	public String getMEMCARDNO() {
		return MEMCARDNO;
	}
	/**
	 * @param mEMCARDNO the mEMCARDNO to set
	 */
	public void setMEMCARDNO(String mEMCARDNO) {
		MEMCARDNO = mEMCARDNO;
	}
	/**
	 * @return the bUSNO
	 */
	public int getBUSNO() {
		return BUSNO;
	}
	/**
	 * @param bUSNO the bUSNO to set
	 */
	public void setBUSNO(int bUSNO) {
		BUSNO = bUSNO;
	}
	/**
	 * @return the cALLER
	 */
	public int getCALLER() {
		return CALLER;
	}
	/**
	 * @param cALLER the cALLER to set
	 */
	public void setCALLER(int cALLER) {
		CALLER = cALLER;
	}
	/**
	 * @return the cALLTIME
	 */
	public int getCALLTIME() {
		return CALLTIME;
	}
	/**
	 * @param cALLTIME the cALLTIME to set
	 */
	public void setCALLTIME(int cALLTIME) {
		CALLTIME = cALLTIME;
	}
	/**
	 * @return the rECOMMENDED_CONTENT
	 */
	public String getRECOMMENDED_CONTENT() {
		return RECOMMENDED_CONTENT;
	}
	/**
	 * @param rECOMMENDED_CONTENT the rECOMMENDED_CONTENT to set
	 */
	public void setRECOMMENDED_CONTENT(String rECOMMENDED_CONTENT) {
		RECOMMENDED_CONTENT = rECOMMENDED_CONTENT;
	}
	/**
	 * @return the mEMCARD_REPLY
	 */
	public String getMEMCARD_REPLY() {
		return MEMCARD_REPLY;
	}
	/**
	 * @param mEMCARD_REPLY the mEMCARD_REPLY to set
	 */
	public void setMEMCARD_REPLY(String mEMCARD_REPLY) {
		MEMCARD_REPLY = mEMCARD_REPLY;
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
	/**
	 * @return the mEMBER_SALENO
	 */
	public String getMEMBER_SALENO() {
		return MEMBER_SALENO;
	}
	/**
	 * @param mEMBER_SALENO the mEMBER_SALENO to set
	 */
	public void setMEMBER_SALENO(String mEMBER_SALENO) {
		MEMBER_SALENO = mEMBER_SALENO;
	}
	/**
	 * @return the cREATEUSER
	 */
	public int getCREATEUSER() {
		return CREATEUSER;
	}
	/**
	 * @param cREATEUSER the cREATEUSER to set
	 */
	public void setCREATEUSER(int cREATEUSER) {
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
	 * @return the lASTMODIFY
	 */
	public int getLASTMODIFY() {
		return LASTMODIFY;
	}
	/**
	 * @param lASTMODIFY the lASTMODIFY to set
	 */
	public void setLASTMODIFY(int lASTMODIFY) {
		LASTMODIFY = lASTMODIFY;
	}
	/**
	 * @return the lASTTIME
	 */
	public String getLASTTIME() {
		return LASTTIME;
	}
	/**
	 * @param lASTTIME the lASTTIME to set
	 */
	public void setLASTTIME(String lASTTIME) {
		LASTTIME = lASTTIME;
	}
	/**
	 * @return the sTATUS
	 */
	public int getSTATUS() {
		return STATUS;
	}
	/**
	 * @param sTATUS the sTATUS to set
	 */
	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}
	/**
	 * @return the fEEDID
	 */
	public int getFEEDID() {
		return FEEDID;
	}
	/**
	 * @param fEEDID the fEEDID to set
	 */
	public void setFEEDID(int fEEDID) {
		FEEDID = fEEDID;
	}
	
	
}
