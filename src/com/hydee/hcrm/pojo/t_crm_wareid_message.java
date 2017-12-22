package com.hydee.hcrm.pojo;
//药品用药信息表
public class t_crm_wareid_message {
	private String WARENAME;//商品名称
	private String WARESPEC;
	private int FACTORYID;
	private String WAREUNIT;
	private String FACTORYNAME;
	private String FILENO;
	private String AREANAME;
	private String WARECODE;
	private String AREACODE;
	private String BARCODE;
	private String USAGE_DOSAGE;
	private int WAREID;//商品编号
	private int COURSE;
	private int WAREUNITDAY;
	private int BEFORMESSAGEDAY;
	private String USAGE;
	private String FREQUENCYUSAGE;
	private int DOSAGE;
	private int USEUNIT;
	private String EXPLAIN;
	private String TREATMENT;
	private String ADVERSEREACTION;
	private String TABOO;
	private int IFWECHAT;
	private String WECHATMESSAGE;
	private int IFMESSAGE;
	private String MESSAGE;
	private int MESSAGELENGTH;
	private int CREATEUSER;
	private String CREATETIME;
	private int COMPID;
	
	public t_crm_wareid_message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public t_crm_wareid_message(String wARENAME, String wARESPEC,
			int fACTORYID, String wAREUNIT, String fACTORYNAME, String fILENO,
			String aREANAME, String wARECODE, String aREACODE, String bARCODE,
			String uSAGE_DOSAGE, int wAREID, int cOURSE, int wAREUNITDAY,
			int bEFORMESSAGEDAY, String uSAGE, String fREQUENCYUSAGE,
			int dOSAGE, int uSEUNIT, String eXPLAIN, String tREATMENT,
			String aDVERSEREACTION, String tABOO, int iFWECHAT,
			String wECHATMESSAGE, int iFMESSAGE, String mESSAGE,
			int mESSAGELENGTH, int cREATEUSER, String cREATETIME, int cOMPID) {
		super();
		WARENAME = wARENAME;
		WARESPEC = wARESPEC;
		FACTORYID = fACTORYID;
		WAREUNIT = wAREUNIT;
		FACTORYNAME = fACTORYNAME;
		FILENO = fILENO;
		AREANAME = aREANAME;
		WARECODE = wARECODE;
		AREACODE = aREACODE;
		BARCODE = bARCODE;
		USAGE_DOSAGE = uSAGE_DOSAGE;
		WAREID = wAREID;
		COURSE = cOURSE;
		WAREUNITDAY = wAREUNITDAY;
		BEFORMESSAGEDAY = bEFORMESSAGEDAY;
		USAGE = uSAGE;
		FREQUENCYUSAGE = fREQUENCYUSAGE;
		DOSAGE = dOSAGE;
		USEUNIT = uSEUNIT;
		EXPLAIN = eXPLAIN;
		TREATMENT = tREATMENT;
		ADVERSEREACTION = aDVERSEREACTION;
		TABOO = tABOO;
		IFWECHAT = iFWECHAT;
		WECHATMESSAGE = wECHATMESSAGE;
		IFMESSAGE = iFMESSAGE;
		MESSAGE = mESSAGE;
		MESSAGELENGTH = mESSAGELENGTH;
		CREATEUSER = cREATEUSER;
		CREATETIME = cREATETIME;
		COMPID = cOMPID;
	}
	/**
	 * @return the wARENAME
	 */
	public String getWARENAME() {
		return WARENAME;
	}
	/**
	 * @param wARENAME the wARENAME to set
	 */
	public void setWARENAME(String wARENAME) {
		WARENAME = wARENAME;
	}
	/**
	 * @return the wARESPEC
	 */
	public String getWARESPEC() {
		return WARESPEC;
	}
	/**
	 * @param wARESPEC the wARESPEC to set
	 */
	public void setWARESPEC(String wARESPEC) {
		WARESPEC = wARESPEC;
	}
	/**
	 * @return the fACTORYID
	 */
	public int getFACTORYID() {
		return FACTORYID;
	}
	/**
	 * @param fACTORYID the fACTORYID to set
	 */
	public void setFACTORYID(int fACTORYID) {
		FACTORYID = fACTORYID;
	}
	/**
	 * @return the wAREUNIT
	 */
	public String getWAREUNIT() {
		return WAREUNIT;
	}
	/**
	 * @param wAREUNIT the wAREUNIT to set
	 */
	public void setWAREUNIT(String wAREUNIT) {
		WAREUNIT = wAREUNIT;
	}
	/**
	 * @return the fACTORYNAME
	 */
	public String getFACTORYNAME() {
		return FACTORYNAME;
	}
	/**
	 * @param fACTORYNAME the fACTORYNAME to set
	 */
	public void setFACTORYNAME(String fACTORYNAME) {
		FACTORYNAME = fACTORYNAME;
	}
	/**
	 * @return the fILENO
	 */
	public String getFILENO() {
		return FILENO;
	}
	/**
	 * @param fILENO the fILENO to set
	 */
	public void setFILENO(String fILENO) {
		FILENO = fILENO;
	}
	/**
	 * @return the aREANAME
	 */
	public String getAREANAME() {
		return AREANAME;
	}
	/**
	 * @param aREANAME the aREANAME to set
	 */
	public void setAREANAME(String aREANAME) {
		AREANAME = aREANAME;
	}
	/**
	 * @return the wARECODE
	 */
	public String getWARECODE() {
		return WARECODE;
	}
	/**
	 * @param wARECODE the wARECODE to set
	 */
	public void setWARECODE(String wARECODE) {
		WARECODE = wARECODE;
	}
	/**
	 * @return the aREACODE
	 */
	public String getAREACODE() {
		return AREACODE;
	}
	/**
	 * @param aREACODE the aREACODE to set
	 */
	public void setAREACODE(String aREACODE) {
		AREACODE = aREACODE;
	}
	/**
	 * @return the bARCODE
	 */
	public String getBARCODE() {
		return BARCODE;
	}
	/**
	 * @param bARCODE the bARCODE to set
	 */
	public void setBARCODE(String bARCODE) {
		BARCODE = bARCODE;
	}
	/**
	 * @return the uSAGE_DOSAGE
	 */
	public String getUSAGE_DOSAGE() {
		return USAGE_DOSAGE;
	}
	/**
	 * @param uSAGE_DOSAGE the uSAGE_DOSAGE to set
	 */
	public void setUSAGE_DOSAGE(String uSAGE_DOSAGE) {
		USAGE_DOSAGE = uSAGE_DOSAGE;
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
	 * @return the cOURSE
	 */
	public int getCOURSE() {
		return COURSE;
	}
	/**
	 * @param cOURSE the cOURSE to set
	 */
	public void setCOURSE(int cOURSE) {
		COURSE = cOURSE;
	}
	/**
	 * @return the wAREUNITDAY
	 */
	public int getWAREUNITDAY() {
		return WAREUNITDAY;
	}
	/**
	 * @param wAREUNITDAY the wAREUNITDAY to set
	 */
	public void setWAREUNITDAY(int wAREUNITDAY) {
		WAREUNITDAY = wAREUNITDAY;
	}
	/**
	 * @return the bEFORMESSAGEDAY
	 */
	public int getBEFORMESSAGEDAY() {
		return BEFORMESSAGEDAY;
	}
	/**
	 * @param bEFORMESSAGEDAY the bEFORMESSAGEDAY to set
	 */
	public void setBEFORMESSAGEDAY(int bEFORMESSAGEDAY) {
		BEFORMESSAGEDAY = bEFORMESSAGEDAY;
	}
	/**
	 * @return the uSAGE
	 */
	public String getUSAGE() {
		return USAGE;
	}
	/**
	 * @param uSAGE the uSAGE to set
	 */
	public void setUSAGE(String uSAGE) {
		USAGE = uSAGE;
	}
	/**
	 * @return the fREQUENCYUSAGE
	 */
	public String getFREQUENCYUSAGE() {
		return FREQUENCYUSAGE;
	}
	/**
	 * @param fREQUENCYUSAGE the fREQUENCYUSAGE to set
	 */
	public void setFREQUENCYUSAGE(String fREQUENCYUSAGE) {
		FREQUENCYUSAGE = fREQUENCYUSAGE;
	}
	/**
	 * @return the dOSAGE
	 */
	public int getDOSAGE() {
		return DOSAGE;
	}
	/**
	 * @param dOSAGE the dOSAGE to set
	 */
	public void setDOSAGE(int dOSAGE) {
		DOSAGE = dOSAGE;
	}
	/**
	 * @return the uSEUNIT
	 */
	public int getUSEUNIT() {
		return USEUNIT;
	}
	/**
	 * @param uSEUNIT the uSEUNIT to set
	 */
	public void setUSEUNIT(int uSEUNIT) {
		USEUNIT = uSEUNIT;
	}
	/**
	 * @return the eXPLAIN
	 */
	public String getEXPLAIN() {
		return EXPLAIN;
	}
	/**
	 * @param eXPLAIN the eXPLAIN to set
	 */
	public void setEXPLAIN(String eXPLAIN) {
		EXPLAIN = eXPLAIN;
	}
	/**
	 * @return the tREATMENT
	 */
	public String getTREATMENT() {
		return TREATMENT;
	}
	/**
	 * @param tREATMENT the tREATMENT to set
	 */
	public void setTREATMENT(String tREATMENT) {
		TREATMENT = tREATMENT;
	}
	/**
	 * @return the aDVERSEREACTION
	 */
	public String getADVERSEREACTION() {
		return ADVERSEREACTION;
	}
	/**
	 * @param aDVERSEREACTION the aDVERSEREACTION to set
	 */
	public void setADVERSEREACTION(String aDVERSEREACTION) {
		ADVERSEREACTION = aDVERSEREACTION;
	}
	/**
	 * @return the tABOO
	 */
	public String getTABOO() {
		return TABOO;
	}
	/**
	 * @param tABOO the tABOO to set
	 */
	public void setTABOO(String tABOO) {
		TABOO = tABOO;
	}
	/**
	 * @return the iFWECHAT
	 */
	public int getIFWECHAT() {
		return IFWECHAT;
	}
	/**
	 * @param iFWECHAT the iFWECHAT to set
	 */
	public void setIFWECHAT(int iFWECHAT) {
		IFWECHAT = iFWECHAT;
	}
	/**
	 * @return the wECHATMESSAGE
	 */
	public String getWECHATMESSAGE() {
		return WECHATMESSAGE;
	}
	/**
	 * @param wECHATMESSAGE the wECHATMESSAGE to set
	 */
	public void setWECHATMESSAGE(String wECHATMESSAGE) {
		WECHATMESSAGE = wECHATMESSAGE;
	}
	/**
	 * @return the iFMESSAGE
	 */
	public int getIFMESSAGE() {
		return IFMESSAGE;
	}
	/**
	 * @param iFMESSAGE the iFMESSAGE to set
	 */
	public void setIFMESSAGE(int iFMESSAGE) {
		IFMESSAGE = iFMESSAGE;
	}
	/**
	 * @return the mESSAGE
	 */
	public String getMESSAGE() {
		return MESSAGE;
	}
	/**
	 * @param mESSAGE the mESSAGE to set
	 */
	public void setMESSAGE(String mESSAGE) {
		MESSAGE = mESSAGE;
	}
	/**
	 * @return the mESSAGELENGTH
	 */
	public int getMESSAGELENGTH() {
		return MESSAGELENGTH;
	}
	/**
	 * @param mESSAGELENGTH the mESSAGELENGTH to set
	 */
	public void setMESSAGELENGTH(int mESSAGELENGTH) {
		MESSAGELENGTH = mESSAGELENGTH;
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
	

}
