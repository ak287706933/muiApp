package com.hydee.hcrm.pojo;

public class t_crm_activity_c {
	private String SALENO;//销售单号
	private int SALEBUSNO;//销售门店
	private String SALEDATE;//销售时间
	private String TASK_RESON;//在别的药店购买的原因
	private String TASK_REMARK;//备注
	private String FOLLOWUPWORK;//后续工作
	private int TASK_STATUS;//任务状态
	private String FEEDBACKTIME;//反馈时间
	private int SALEQTY;//销售数量
	private int REMINDAYS;//多少天后提醒
	private String ACTIVEID;//活動標號
	private int ROWNO;//行數
    private String MEMCARDNO;//会员卡号
    private String MOBILE;//手机号码
    private int BUSNO;//营销门店
    private int HEALTHER;//健康专员
    private int WAREID;//商品编号
    private String MESSAGETEXT;//内容
    private int STATUS;//状态
    private int CREATEUSER;//发送人
    private String CREATETIME;//发送时间
    private String CHECKER1;//联系人
    private String CHECKTIME1;//联系时间
    
	public t_crm_activity_c() {
		super();
		// TODO Auto-generated constructor stub
	}
	public t_crm_activity_c(String sALENO, int sALEBUSNO, String sALEDATE,
			String tASK_RESON, String tASK_REMARK, String fOLLOWUPWORK,
			int tASK_STATUS, String fEEDBACKTIME, int sALEQTY, int rEMINDAYS,
			String aCTIVEID, int rOWNO, String mEMCARDNO, String mOBILE,
			int bUSNO, int hEALTHER, int wAREID, String mESSAGETEXT,
			int sTATUS, int cREATEUSER, String cREATETIME, String cHECKER1,
			String cHECKTIME1) {
		super();
		SALENO = sALENO;
		SALEBUSNO = sALEBUSNO;
		SALEDATE = sALEDATE;
		TASK_RESON = tASK_RESON;
		TASK_REMARK = tASK_REMARK;
		FOLLOWUPWORK = fOLLOWUPWORK;
		TASK_STATUS = tASK_STATUS;
		FEEDBACKTIME = fEEDBACKTIME;
		SALEQTY = sALEQTY;
		REMINDAYS = rEMINDAYS;
		ACTIVEID = aCTIVEID;
		ROWNO = rOWNO;
		MEMCARDNO = mEMCARDNO;
		MOBILE = mOBILE;
		BUSNO = bUSNO;
		HEALTHER = hEALTHER;
		WAREID = wAREID;
		MESSAGETEXT = mESSAGETEXT;
		STATUS = sTATUS;
		CREATEUSER = cREATEUSER;
		CREATETIME = cREATETIME;
		CHECKER1 = cHECKER1;
		CHECKTIME1 = cHECKTIME1;
	}
	/**
	 * @return the sALENO
	 */
	public String getSALENO() {
		return SALENO;
	}
	/**
	 * @param sALENO the sALENO to set
	 */
	public void setSALENO(String sALENO) {
		SALENO = sALENO;
	}
	/**
	 * @return the sALEBUSNO
	 */
	public int getSALEBUSNO() {
		return SALEBUSNO;
	}
	/**
	 * @param sALEBUSNO the sALEBUSNO to set
	 */
	public void setSALEBUSNO(int sALEBUSNO) {
		SALEBUSNO = sALEBUSNO;
	}
	/**
	 * @return the sALEDATE
	 */
	public String getSALEDATE() {
		return SALEDATE;
	}
	/**
	 * @param sALEDATE the sALEDATE to set
	 */
	public void setSALEDATE(String sALEDATE) {
		SALEDATE = sALEDATE;
	}
	/**
	 * @return the tASK_RESON
	 */
	public String getTASK_RESON() {
		return TASK_RESON;
	}
	/**
	 * @param tASK_RESON the tASK_RESON to set
	 */
	public void setTASK_RESON(String tASK_RESON) {
		TASK_RESON = tASK_RESON;
	}
	/**
	 * @return the tASK_REMARK
	 */
	public String getTASK_REMARK() {
		return TASK_REMARK;
	}
	/**
	 * @param tASK_REMARK the tASK_REMARK to set
	 */
	public void setTASK_REMARK(String tASK_REMARK) {
		TASK_REMARK = tASK_REMARK;
	}
	/**
	 * @return the fOLLOWUPWORK
	 */
	public String getFOLLOWUPWORK() {
		return FOLLOWUPWORK;
	}
	/**
	 * @param fOLLOWUPWORK the fOLLOWUPWORK to set
	 */
	public void setFOLLOWUPWORK(String fOLLOWUPWORK) {
		FOLLOWUPWORK = fOLLOWUPWORK;
	}
	/**
	 * @return the tASK_STATUS
	 */
	public int getTASK_STATUS() {
		return TASK_STATUS;
	}
	/**
	 * @param tASK_STATUS the tASK_STATUS to set
	 */
	public void setTASK_STATUS(int tASK_STATUS) {
		TASK_STATUS = tASK_STATUS;
	}
	/**
	 * @return the fEEDBACKTIME
	 */
	public String getFEEDBACKTIME() {
		return FEEDBACKTIME;
	}
	/**
	 * @param fEEDBACKTIME the fEEDBACKTIME to set
	 */
	public void setFEEDBACKTIME(String fEEDBACKTIME) {
		FEEDBACKTIME = fEEDBACKTIME;
	}
	/**
	 * @return the sALEQTY
	 */
	public int getSALEQTY() {
		return SALEQTY;
	}
	/**
	 * @param sALEQTY the sALEQTY to set
	 */
	public void setSALEQTY(int sALEQTY) {
		SALEQTY = sALEQTY;
	}
	/**
	 * @return the rEMINDAYS
	 */
	public int getREMINDAYS() {
		return REMINDAYS;
	}
	/**
	 * @param rEMINDAYS the rEMINDAYS to set
	 */
	public void setREMINDAYS(int rEMINDAYS) {
		REMINDAYS = rEMINDAYS;
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
	 * @return the rOWNO
	 */
	public int getROWNO() {
		return ROWNO;
	}
	/**
	 * @param rOWNO the rOWNO to set
	 */
	public void setROWNO(int rOWNO) {
		ROWNO = rOWNO;
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
	 * @return the mOBILE
	 */
	public String getMOBILE() {
		return MOBILE;
	}
	/**
	 * @param mOBILE the mOBILE to set
	 */
	public void setMOBILE(String mOBILE) {
		MOBILE = mOBILE;
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
	 * @return the hEALTHER
	 */
	public int getHEALTHER() {
		return HEALTHER;
	}
	/**
	 * @param hEALTHER the hEALTHER to set
	 */
	public void setHEALTHER(int hEALTHER) {
		HEALTHER = hEALTHER;
	}
	/**
	 * @return the wAREID
	 */
	public int getWAREID() {
		return WAREID;
	}
	/**
	 * @param wAREID the wAREID to set
	 */
	public void setWAREID(int wAREID) {
		WAREID = wAREID;
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
	 * @return the cHECKER1
	 */
	public String getCHECKER1() {
		return CHECKER1;
	}
	/**
	 * @param cHECKER1 the cHECKER1 to set
	 */
	public void setCHECKER1(String cHECKER1) {
		CHECKER1 = cHECKER1;
	}
	/**
	 * @return the cHECKTIME1
	 */
	public String getCHECKTIME1() {
		return CHECKTIME1;
	}
	/**
	 * @param cHECKTIME1 the cHECKTIME1 to set
	 */
	public void setCHECKTIME1(String cHECKTIME1) {
		CHECKTIME1 = cHECKTIME1;
	}
    

}
