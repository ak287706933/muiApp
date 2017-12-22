package com.hydee.hcrm.pojo;

public class s_user_base {
	private Integer USERID;
	private String USERNAME;
	private String USERABC;
	private String USERPASS;
	private String LASTCHGPASSDATE;
	private Integer LASTMODIFY;
	private String LASTTIME;
	private String NOTES;
	private String STAMP;
	private String PERSONALWSLOGID;
	private String GREGRBIRTH;
	private String LUNARBIRTH;
	private String IDCARD;
	private String GENDER;
	private String WORKSIGN;
	private String TEL;
	private String BASE_DEPTID;
	private String STATION;
	private String CHK_FLAG;
	private String MAIL;
	private String BEGDATE;
	private String ENDDATE;
	private String BEGTIME;
	private String ENDTIME;
	private String NEWRATE;
	private String OLDRATE;
	private String BEGFLAG;
	private String ENDFLAG;
	private String NOTES1;
	private String BUSNO;
	private String BPUSERNAME;
	private String BPUSERPASS;
	private String EMAIL;
	private String USEREXT;
	private String EXTNO;
	private int BUYER_FLAG;
	private int SALER_FLAG;
	private String RECKONERID;
	private Integer THRESHOLD;
	private String LOGINDATE;
	private String INITPASS;
	private Integer IFREPEATLOGIN;
	private int ISSENDTEL;
	private String BPUSERIDO;
	private int PHY_FLAG;
	private String BAK_VARCHAR1;
	private String BAK_VARCHAR2;
    private int DOCTOR_FLAG;
    private String DEPARTMENT;
    private String REGISTER_TYPE;
    private int REGAMT_RATE;
    private int LIMIT_DAY;
    private int USER_RATE;
    private int WAITER_FLAG;
    private int COMPID;
    private String SOURCE_SYSCODE;
    private String SOURCE_SYSNAME;
    
	public s_user_base() {
		super();
		// TODO Auto-generated constructor stub
	}
	public s_user_base(Integer uSERID, String uSERNAME, String uSERABC,
			String uSERPASS, String lASTCHGPASSDATE, Integer lASTMODIFY,
			String lASTTIME, String nOTES, String sTAMP,
			String pERSONALWSLOGID, String gREGRBIRTH, String lUNARBIRTH,
			String iDCARD, String gENDER, String wORKSIGN, String tEL,
			String bASE_DEPTID, String sTATION, String cHK_FLAG, String mAIL,
			String bEGDATE, String eNDDATE, String bEGTIME, String eNDTIME,
			String nEWRATE, String oLDRATE, String bEGFLAG, String eNDFLAG,
			String nOTES1, String bUSNO, String bPUSERNAME, String bPUSERPASS,
			String eMAIL, String uSEREXT, String eXTNO, int bUYER_FLAG,
			int sALER_FLAG, String rECKONERID, Integer tHRESHOLD,
			String lOGINDATE, String iNITPASS, Integer iFREPEATLOGIN,
			int iSSENDTEL, String bPUSERIDO, int pHY_FLAG, String bAK_VARCHAR1,
			String bAK_VARCHAR2, int dOCTOR_FLAG, String dEPARTMENT,
			String rEGISTER_TYPE, int rEGAMT_RATE, int lIMIT_DAY,
			int uSER_RATE, int wAITER_FLAG, int cOMPID, String sOURCE_SYSCODE,
			String sOURCE_SYSNAME) {
		super();
		USERID = uSERID;
		USERNAME = uSERNAME;
		USERABC = uSERABC;
		USERPASS = uSERPASS;
		LASTCHGPASSDATE = lASTCHGPASSDATE;
		LASTMODIFY = lASTMODIFY;
		LASTTIME = lASTTIME;
		NOTES = nOTES;
		STAMP = sTAMP;
		PERSONALWSLOGID = pERSONALWSLOGID;
		GREGRBIRTH = gREGRBIRTH;
		LUNARBIRTH = lUNARBIRTH;
		IDCARD = iDCARD;
		GENDER = gENDER;
		WORKSIGN = wORKSIGN;
		TEL = tEL;
		BASE_DEPTID = bASE_DEPTID;
		STATION = sTATION;
		CHK_FLAG = cHK_FLAG;
		MAIL = mAIL;
		BEGDATE = bEGDATE;
		ENDDATE = eNDDATE;
		BEGTIME = bEGTIME;
		ENDTIME = eNDTIME;
		NEWRATE = nEWRATE;
		OLDRATE = oLDRATE;
		BEGFLAG = bEGFLAG;
		ENDFLAG = eNDFLAG;
		NOTES1 = nOTES1;
		BUSNO = bUSNO;
		BPUSERNAME = bPUSERNAME;
		BPUSERPASS = bPUSERPASS;
		EMAIL = eMAIL;
		USEREXT = uSEREXT;
		EXTNO = eXTNO;
		BUYER_FLAG = bUYER_FLAG;
		SALER_FLAG = sALER_FLAG;
		RECKONERID = rECKONERID;
		THRESHOLD = tHRESHOLD;
		LOGINDATE = lOGINDATE;
		INITPASS = iNITPASS;
		IFREPEATLOGIN = iFREPEATLOGIN;
		ISSENDTEL = iSSENDTEL;
		BPUSERIDO = bPUSERIDO;
		PHY_FLAG = pHY_FLAG;
		BAK_VARCHAR1 = bAK_VARCHAR1;
		BAK_VARCHAR2 = bAK_VARCHAR2;
		DOCTOR_FLAG = dOCTOR_FLAG;
		DEPARTMENT = dEPARTMENT;
		REGISTER_TYPE = rEGISTER_TYPE;
		REGAMT_RATE = rEGAMT_RATE;
		LIMIT_DAY = lIMIT_DAY;
		USER_RATE = uSER_RATE;
		WAITER_FLAG = wAITER_FLAG;
		COMPID = cOMPID;
		SOURCE_SYSCODE = sOURCE_SYSCODE;
		SOURCE_SYSNAME = sOURCE_SYSNAME;
	}
	/**
	 * @return the uSERID
	 */
	public Integer getUSERID() {
		return USERID;
	}
	/**
	 * @param uSERID the uSERID to set
	 */
	public void setUSERID(Integer uSERID) {
		USERID = uSERID;
	}
	/**
	 * @return the uSERNAME
	 */
	public String getUSERNAME() {
		return USERNAME;
	}
	/**
	 * @param uSERNAME the uSERNAME to set
	 */
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	/**
	 * @return the uSERABC
	 */
	public String getUSERABC() {
		return USERABC;
	}
	/**
	 * @param uSERABC the uSERABC to set
	 */
	public void setUSERABC(String uSERABC) {
		USERABC = uSERABC;
	}
	/**
	 * @return the uSERPASS
	 */
	public String getUSERPASS() {
		return USERPASS;
	}
	/**
	 * @param uSERPASS the uSERPASS to set
	 */
	public void setUSERPASS(String uSERPASS) {
		USERPASS = uSERPASS;
	}
	/**
	 * @return the lASTCHGPASSDATE
	 */
	public String getLASTCHGPASSDATE() {
		return LASTCHGPASSDATE;
	}
	/**
	 * @param lASTCHGPASSDATE the lASTCHGPASSDATE to set
	 */
	public void setLASTCHGPASSDATE(String lASTCHGPASSDATE) {
		LASTCHGPASSDATE = lASTCHGPASSDATE;
	}
	/**
	 * @return the lASTMODIFY
	 */
	public Integer getLASTMODIFY() {
		return LASTMODIFY;
	}
	/**
	 * @param lASTMODIFY the lASTMODIFY to set
	 */
	public void setLASTMODIFY(Integer lASTMODIFY) {
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
	 * @return the sTAMP
	 */
	public String getSTAMP() {
		return STAMP;
	}
	/**
	 * @param sTAMP the sTAMP to set
	 */
	public void setSTAMP(String sTAMP) {
		STAMP = sTAMP;
	}
	/**
	 * @return the pERSONALWSLOGID
	 */
	public String getPERSONALWSLOGID() {
		return PERSONALWSLOGID;
	}
	/**
	 * @param pERSONALWSLOGID the pERSONALWSLOGID to set
	 */
	public void setPERSONALWSLOGID(String pERSONALWSLOGID) {
		PERSONALWSLOGID = pERSONALWSLOGID;
	}
	/**
	 * @return the gREGRBIRTH
	 */
	public String getGREGRBIRTH() {
		return GREGRBIRTH;
	}
	/**
	 * @param gREGRBIRTH the gREGRBIRTH to set
	 */
	public void setGREGRBIRTH(String gREGRBIRTH) {
		GREGRBIRTH = gREGRBIRTH;
	}
	/**
	 * @return the lUNARBIRTH
	 */
	public String getLUNARBIRTH() {
		return LUNARBIRTH;
	}
	/**
	 * @param lUNARBIRTH the lUNARBIRTH to set
	 */
	public void setLUNARBIRTH(String lUNARBIRTH) {
		LUNARBIRTH = lUNARBIRTH;
	}
	/**
	 * @return the iDCARD
	 */
	public String getIDCARD() {
		return IDCARD;
	}
	/**
	 * @param iDCARD the iDCARD to set
	 */
	public void setIDCARD(String iDCARD) {
		IDCARD = iDCARD;
	}
	/**
	 * @return the gENDER
	 */
	public String getGENDER() {
		return GENDER;
	}
	/**
	 * @param gENDER the gENDER to set
	 */
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	/**
	 * @return the wORKSIGN
	 */
	public String getWORKSIGN() {
		return WORKSIGN;
	}
	/**
	 * @param wORKSIGN the wORKSIGN to set
	 */
	public void setWORKSIGN(String wORKSIGN) {
		WORKSIGN = wORKSIGN;
	}
	/**
	 * @return the tEL
	 */
	public String getTEL() {
		return TEL;
	}
	/**
	 * @param tEL the tEL to set
	 */
	public void setTEL(String tEL) {
		TEL = tEL;
	}
	/**
	 * @return the bASE_DEPTID
	 */
	public String getBASE_DEPTID() {
		return BASE_DEPTID;
	}
	/**
	 * @param bASE_DEPTID the bASE_DEPTID to set
	 */
	public void setBASE_DEPTID(String bASE_DEPTID) {
		BASE_DEPTID = bASE_DEPTID;
	}
	/**
	 * @return the sTATION
	 */
	public String getSTATION() {
		return STATION;
	}
	/**
	 * @param sTATION the sTATION to set
	 */
	public void setSTATION(String sTATION) {
		STATION = sTATION;
	}
	/**
	 * @return the cHK_FLAG
	 */
	public String getCHK_FLAG() {
		return CHK_FLAG;
	}
	/**
	 * @param cHK_FLAG the cHK_FLAG to set
	 */
	public void setCHK_FLAG(String cHK_FLAG) {
		CHK_FLAG = cHK_FLAG;
	}
	/**
	 * @return the mAIL
	 */
	public String getMAIL() {
		return MAIL;
	}
	/**
	 * @param mAIL the mAIL to set
	 */
	public void setMAIL(String mAIL) {
		MAIL = mAIL;
	}
	/**
	 * @return the bEGDATE
	 */
	public String getBEGDATE() {
		return BEGDATE;
	}
	/**
	 * @param bEGDATE the bEGDATE to set
	 */
	public void setBEGDATE(String bEGDATE) {
		BEGDATE = bEGDATE;
	}
	/**
	 * @return the eNDDATE
	 */
	public String getENDDATE() {
		return ENDDATE;
	}
	/**
	 * @param eNDDATE the eNDDATE to set
	 */
	public void setENDDATE(String eNDDATE) {
		ENDDATE = eNDDATE;
	}
	/**
	 * @return the bEGTIME
	 */
	public String getBEGTIME() {
		return BEGTIME;
	}
	/**
	 * @param bEGTIME the bEGTIME to set
	 */
	public void setBEGTIME(String bEGTIME) {
		BEGTIME = bEGTIME;
	}
	/**
	 * @return the eNDTIME
	 */
	public String getENDTIME() {
		return ENDTIME;
	}
	/**
	 * @param eNDTIME the eNDTIME to set
	 */
	public void setENDTIME(String eNDTIME) {
		ENDTIME = eNDTIME;
	}
	/**
	 * @return the nEWRATE
	 */
	public String getNEWRATE() {
		return NEWRATE;
	}
	/**
	 * @param nEWRATE the nEWRATE to set
	 */
	public void setNEWRATE(String nEWRATE) {
		NEWRATE = nEWRATE;
	}
	/**
	 * @return the oLDRATE
	 */
	public String getOLDRATE() {
		return OLDRATE;
	}
	/**
	 * @param oLDRATE the oLDRATE to set
	 */
	public void setOLDRATE(String oLDRATE) {
		OLDRATE = oLDRATE;
	}
	/**
	 * @return the bEGFLAG
	 */
	public String getBEGFLAG() {
		return BEGFLAG;
	}
	/**
	 * @param bEGFLAG the bEGFLAG to set
	 */
	public void setBEGFLAG(String bEGFLAG) {
		BEGFLAG = bEGFLAG;
	}
	/**
	 * @return the eNDFLAG
	 */
	public String getENDFLAG() {
		return ENDFLAG;
	}
	/**
	 * @param eNDFLAG the eNDFLAG to set
	 */
	public void setENDFLAG(String eNDFLAG) {
		ENDFLAG = eNDFLAG;
	}
	/**
	 * @return the nOTES1
	 */
	public String getNOTES1() {
		return NOTES1;
	}
	/**
	 * @param nOTES1 the nOTES1 to set
	 */
	public void setNOTES1(String nOTES1) {
		NOTES1 = nOTES1;
	}
	/**
	 * @return the bUSNO
	 */
	public String getBUSNO() {
		return BUSNO;
	}
	/**
	 * @param bUSNO the bUSNO to set
	 */
	public void setBUSNO(String bUSNO) {
		BUSNO = bUSNO;
	}
	/**
	 * @return the bPUSERNAME
	 */
	public String getBPUSERNAME() {
		return BPUSERNAME;
	}
	/**
	 * @param bPUSERNAME the bPUSERNAME to set
	 */
	public void setBPUSERNAME(String bPUSERNAME) {
		BPUSERNAME = bPUSERNAME;
	}
	/**
	 * @return the bPUSERPASS
	 */
	public String getBPUSERPASS() {
		return BPUSERPASS;
	}
	/**
	 * @param bPUSERPASS the bPUSERPASS to set
	 */
	public void setBPUSERPASS(String bPUSERPASS) {
		BPUSERPASS = bPUSERPASS;
	}
	/**
	 * @return the eMAIL
	 */
	public String getEMAIL() {
		return EMAIL;
	}
	/**
	 * @param eMAIL the eMAIL to set
	 */
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	/**
	 * @return the uSEREXT
	 */
	public String getUSEREXT() {
		return USEREXT;
	}
	/**
	 * @param uSEREXT the uSEREXT to set
	 */
	public void setUSEREXT(String uSEREXT) {
		USEREXT = uSEREXT;
	}
	/**
	 * @return the eXTNO
	 */
	public String getEXTNO() {
		return EXTNO;
	}
	/**
	 * @param eXTNO the eXTNO to set
	 */
	public void setEXTNO(String eXTNO) {
		EXTNO = eXTNO;
	}
	/**
	 * @return the bUYER_FLAG
	 */
	public int getBUYER_FLAG() {
		return BUYER_FLAG;
	}
	/**
	 * @param bUYER_FLAG the bUYER_FLAG to set
	 */
	public void setBUYER_FLAG(int bUYER_FLAG) {
		BUYER_FLAG = bUYER_FLAG;
	}
	/**
	 * @return the sALER_FLAG
	 */
	public int getSALER_FLAG() {
		return SALER_FLAG;
	}
	/**
	 * @param sALER_FLAG the sALER_FLAG to set
	 */
	public void setSALER_FLAG(int sALER_FLAG) {
		SALER_FLAG = sALER_FLAG;
	}
	/**
	 * @return the rECKONERID
	 */
	public String getRECKONERID() {
		return RECKONERID;
	}
	/**
	 * @param rECKONERID the rECKONERID to set
	 */
	public void setRECKONERID(String rECKONERID) {
		RECKONERID = rECKONERID;
	}
	/**
	 * @return the tHRESHOLD
	 */
	public Integer getTHRESHOLD() {
		return THRESHOLD;
	}
	/**
	 * @param tHRESHOLD the tHRESHOLD to set
	 */
	public void setTHRESHOLD(Integer tHRESHOLD) {
		THRESHOLD = tHRESHOLD;
	}
	/**
	 * @return the lOGINDATE
	 */
	public String getLOGINDATE() {
		return LOGINDATE;
	}
	/**
	 * @param lOGINDATE the lOGINDATE to set
	 */
	public void setLOGINDATE(String lOGINDATE) {
		LOGINDATE = lOGINDATE;
	}
	/**
	 * @return the iNITPASS
	 */
	public String getINITPASS() {
		return INITPASS;
	}
	/**
	 * @param iNITPASS the iNITPASS to set
	 */
	public void setINITPASS(String iNITPASS) {
		INITPASS = iNITPASS;
	}
	/**
	 * @return the iFREPEATLOGIN
	 */
	public Integer getIFREPEATLOGIN() {
		return IFREPEATLOGIN;
	}
	/**
	 * @param iFREPEATLOGIN the iFREPEATLOGIN to set
	 */
	public void setIFREPEATLOGIN(Integer iFREPEATLOGIN) {
		IFREPEATLOGIN = iFREPEATLOGIN;
	}
	/**
	 * @return the iSSENDTEL
	 */
	public int getISSENDTEL() {
		return ISSENDTEL;
	}
	/**
	 * @param iSSENDTEL the iSSENDTEL to set
	 */
	public void setISSENDTEL(int iSSENDTEL) {
		ISSENDTEL = iSSENDTEL;
	}
	/**
	 * @return the bPUSERIDO
	 */
	public String getBPUSERIDO() {
		return BPUSERIDO;
	}
	/**
	 * @param bPUSERIDO the bPUSERIDO to set
	 */
	public void setBPUSERIDO(String bPUSERIDO) {
		BPUSERIDO = bPUSERIDO;
	}
	/**
	 * @return the pHY_FLAG
	 */
	public int getPHY_FLAG() {
		return PHY_FLAG;
	}
	/**
	 * @param pHY_FLAG the pHY_FLAG to set
	 */
	public void setPHY_FLAG(int pHY_FLAG) {
		PHY_FLAG = pHY_FLAG;
	}
	/**
	 * @return the bAK_VARCHAR1
	 */
	public String getBAK_VARCHAR1() {
		return BAK_VARCHAR1;
	}
	/**
	 * @param bAK_VARCHAR1 the bAK_VARCHAR1 to set
	 */
	public void setBAK_VARCHAR1(String bAK_VARCHAR1) {
		BAK_VARCHAR1 = bAK_VARCHAR1;
	}
	/**
	 * @return the bAK_VARCHAR2
	 */
	public String getBAK_VARCHAR2() {
		return BAK_VARCHAR2;
	}
	/**
	 * @param bAK_VARCHAR2 the bAK_VARCHAR2 to set
	 */
	public void setBAK_VARCHAR2(String bAK_VARCHAR2) {
		BAK_VARCHAR2 = bAK_VARCHAR2;
	}
	/**
	 * @return the dOCTOR_FLAG
	 */
	public int getDOCTOR_FLAG() {
		return DOCTOR_FLAG;
	}
	/**
	 * @param dOCTOR_FLAG the dOCTOR_FLAG to set
	 */
	public void setDOCTOR_FLAG(int dOCTOR_FLAG) {
		DOCTOR_FLAG = dOCTOR_FLAG;
	}
	/**
	 * @return the dEPARTMENT
	 */
	public String getDEPARTMENT() {
		return DEPARTMENT;
	}
	/**
	 * @param dEPARTMENT the dEPARTMENT to set
	 */
	public void setDEPARTMENT(String dEPARTMENT) {
		DEPARTMENT = dEPARTMENT;
	}
	/**
	 * @return the rEGISTER_TYPE
	 */
	public String getREGISTER_TYPE() {
		return REGISTER_TYPE;
	}
	/**
	 * @param rEGISTER_TYPE the rEGISTER_TYPE to set
	 */
	public void setREGISTER_TYPE(String rEGISTER_TYPE) {
		REGISTER_TYPE = rEGISTER_TYPE;
	}
	/**
	 * @return the rEGAMT_RATE
	 */
	public int getREGAMT_RATE() {
		return REGAMT_RATE;
	}
	/**
	 * @param rEGAMT_RATE the rEGAMT_RATE to set
	 */
	public void setREGAMT_RATE(int rEGAMT_RATE) {
		REGAMT_RATE = rEGAMT_RATE;
	}
	/**
	 * @return the lIMIT_DAY
	 */
	public int getLIMIT_DAY() {
		return LIMIT_DAY;
	}
	/**
	 * @param lIMIT_DAY the lIMIT_DAY to set
	 */
	public void setLIMIT_DAY(int lIMIT_DAY) {
		LIMIT_DAY = lIMIT_DAY;
	}
	/**
	 * @return the uSER_RATE
	 */
	public int getUSER_RATE() {
		return USER_RATE;
	}
	/**
	 * @param uSER_RATE the uSER_RATE to set
	 */
	public void setUSER_RATE(int uSER_RATE) {
		USER_RATE = uSER_RATE;
	}
	/**
	 * @return the wAITER_FLAG
	 */
	public int getWAITER_FLAG() {
		return WAITER_FLAG;
	}
	/**
	 * @param wAITER_FLAG the wAITER_FLAG to set
	 */
	public void setWAITER_FLAG(int wAITER_FLAG) {
		WAITER_FLAG = wAITER_FLAG;
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
	 * @return the sOURCE_SYSCODE
	 */
	public String getSOURCE_SYSCODE() {
		return SOURCE_SYSCODE;
	}
	/**
	 * @param sOURCE_SYSCODE the sOURCE_SYSCODE to set
	 */
	public void setSOURCE_SYSCODE(String sOURCE_SYSCODE) {
		SOURCE_SYSCODE = sOURCE_SYSCODE;
	}
	/**
	 * @return the sOURCE_SYSNAME
	 */
	public String getSOURCE_SYSNAME() {
		return SOURCE_SYSNAME;
	}
	/**
	 * @param sOURCE_SYSNAME the sOURCE_SYSNAME to set
	 */
	public void setSOURCE_SYSNAME(String sOURCE_SYSNAME) {
		SOURCE_SYSNAME = sOURCE_SYSNAME;
	}
    

}
