package com.hydee.hcrm.pojo;
//名店信息
public class s_crm_busi {
	private Integer BUSNO;//业务机构编号
	private String ORGNAME;//业务机构名称
	private String ORGSHORTNAME;//业务机构简称
	private String ORGABC;//业务机构拼音码
	private String ORGTYPE;//业务机构类型
	private Integer SALEGROUPID;//零售价格组
	private Integer EMPLOYEECNT;//业务机构总人数
	private String ADDRESS;//业务机构地址
	private String NOTES;//备注
	private int STAMP;//时间戳
	private int AREA;//业务机构面积
	private int CREDITAMT;//资信金额
	private int CREDITDAY;//资信天数
	private String TEL;//电话
	private String PRINCIPAL;//当事人
	private String IDENTITY_CARD;//身份证
	private String MOBIL;//手机号码
	private String OPENINGDATE;//开业日期
	private String BANK;//银行
	private String BANKNO;//银行账户
	private int MONTHLYRENT;//月租
	private String LANDLORD;//房东
	private String LANDLORDCONTACT;//房东联系人
	private String RENTDUETIME;//租用时间
	private int MINDAY;//最小天数
	private int MAXDAY;//最大天数
	private int SENDINTERVAL;//发货周期
	private String SENDTYPE;//发货方式
	private int COMPID;//企业编号
	private int STATUS;//状态
	private int CUSTNO;//对应客户编码
	private Integer WHLGROUPID;//批发企业
	private String DESCODE_CORPID;//电子监管码机构代码
	private int WHOLESALE_COMPID;//批发总部的企业编码
	private Integer WHOLESALE_BUSNO;//批发总部的业务机构
	private int VENDORNO;//委托配送对应供应商编码
	private String POSNO;//POS机
	private String LEECHDOMLIC;//许可证名称
	private String LEECHDOMLIC_NO;//许可证编号
	private String COMMNAME;//业务机构群
	private String TEMP_INVALIDATE;//临时授权日期
	private int FLAG;//业务机构标识
	private String SERVER_ADDR;//应用服务器地址
	private int ACCOUNTTYPE;//产生往来方式(0.按单品,1.按单据)
	private String SERVER_ADDR_GET;//当前门店应用服务器地址
	private String BUSINESS_LICENSE;//营业执照
	private String WX_LABEL;//		
	private int WX_LATITUDE;//		
	private int WX_LONGITUDE;//			
	private int WX_PRECISION;//				
	private String WX_TICKET;//			
	private String WX_USER;//			
	private String WX_URL;//				
	private String WX_OPENID;//			
	private String WX_QRCODE;//			
	private String ORGLEVEL;//业务机构等级
	private int OFFLIN;//是否允许脱机销售(0.不允许脱机,1.允许脱机)
	private String C_WMS_BUSNO;//WMS仓库编码
	private String C_BUSCODE;//客户化业务机构编号
	private String GROUPNO;//业务机构组
	private String LAUNCH_DATE;//业务机构上线日期
	private int ACCEPTUSER;//默认收货员
	private int TALLYUSER;//默认验收员
	private int CHECKUSER;//默认复核员
	private String SOURCE_SYSCODE;//源系统编码
	private String SOURCE_SYSNAME;//源系统名称
	private int CCOMPID;//客户企业编码
	
	
	public s_crm_busi() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the bUSNO
	 */
	public Integer getBUSNO() {
		return BUSNO;
	}
	/**
	 * @param bUSNO the bUSNO to set
	 */
	public void setBUSNO(Integer bUSNO) {
		BUSNO = bUSNO;
	}
	/**
	 * @return the oRGNAME
	 */
	public String getORGNAME() {
		return ORGNAME;
	}
	/**
	 * @param oRGNAME the oRGNAME to set
	 */
	public void setORGNAME(String oRGNAME) {
		ORGNAME = oRGNAME;
	}
	/**
	 * @return the oRGSHORTNAME
	 */
	public String getORGSHORTNAME() {
		return ORGSHORTNAME;
	}
	/**
	 * @param oRGSHORTNAME the oRGSHORTNAME to set
	 */
	public void setORGSHORTNAME(String oRGSHORTNAME) {
		ORGSHORTNAME = oRGSHORTNAME;
	}
	/**
	 * @return the oRGABC
	 */
	public String getORGABC() {
		return ORGABC;
	}
	/**
	 * @param oRGABC the oRGABC to set
	 */
	public void setORGABC(String oRGABC) {
		ORGABC = oRGABC;
	}
	/**
	 * @return the oRGTYPE
	 */
	public String getORGTYPE() {
		return ORGTYPE;
	}
	/**
	 * @param oRGTYPE the oRGTYPE to set
	 */
	public void setORGTYPE(String oRGTYPE) {
		ORGTYPE = oRGTYPE;
	}
	/**
	 * @return the sALEGROUPID
	 */
	public Integer getSALEGROUPID() {
		return SALEGROUPID;
	}
	/**
	 * @param sALEGROUPID the sALEGROUPID to set
	 */
	public void setSALEGROUPID(Integer sALEGROUPID) {
		SALEGROUPID = sALEGROUPID;
	}
	/**
	 * @return the eMPLOYEECNT
	 */
	public Integer getEMPLOYEECNT() {
		return EMPLOYEECNT;
	}
	/**
	 * @param eMPLOYEECNT the eMPLOYEECNT to set
	 */
	public void setEMPLOYEECNT(Integer eMPLOYEECNT) {
		EMPLOYEECNT = eMPLOYEECNT;
	}
	/**
	 * @return the aDDRESS
	 */
	public String getADDRESS() {
		return ADDRESS;
	}
	/**
	 * @param aDDRESS the aDDRESS to set
	 */
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
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
	 * @return the aREA
	 */
	public int getAREA() {
		return AREA;
	}
	/**
	 * @param aREA the aREA to set
	 */
	public void setAREA(int aREA) {
		AREA = aREA;
	}
	/**
	 * @return the cREDITAMT
	 */
	public int getCREDITAMT() {
		return CREDITAMT;
	}
	/**
	 * @param cREDITAMT the cREDITAMT to set
	 */
	public void setCREDITAMT(int cREDITAMT) {
		CREDITAMT = cREDITAMT;
	}
	/**
	 * @return the cREDITDAY
	 */
	public int getCREDITDAY() {
		return CREDITDAY;
	}
	/**
	 * @param cREDITDAY the cREDITDAY to set
	 */
	public void setCREDITDAY(int cREDITDAY) {
		CREDITDAY = cREDITDAY;
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
	 * @return the pRINCIPAL
	 */
	public String getPRINCIPAL() {
		return PRINCIPAL;
	}
	/**
	 * @param pRINCIPAL the pRINCIPAL to set
	 */
	public void setPRINCIPAL(String pRINCIPAL) {
		PRINCIPAL = pRINCIPAL;
	}
	/**
	 * @return the iDENTITY_CARD
	 */
	public String getIDENTITY_CARD() {
		return IDENTITY_CARD;
	}
	/**
	 * @param iDENTITY_CARD the iDENTITY_CARD to set
	 */
	public void setIDENTITY_CARD(String iDENTITY_CARD) {
		IDENTITY_CARD = iDENTITY_CARD;
	}
	/**
	 * @return the mOBIL
	 */
	public String getMOBIL() {
		return MOBIL;
	}
	/**
	 * @param mOBIL the mOBIL to set
	 */
	public void setMOBIL(String mOBIL) {
		MOBIL = mOBIL;
	}
	/**
	 * @return the oPENINGDATE
	 */
	public String getOPENINGDATE() {
		return OPENINGDATE;
	}
	/**
	 * @param oPENINGDATE the oPENINGDATE to set
	 */
	public void setOPENINGDATE(String oPENINGDATE) {
		OPENINGDATE = oPENINGDATE;
	}
	/**
	 * @return the bANK
	 */
	public String getBANK() {
		return BANK;
	}
	/**
	 * @param bANK the bANK to set
	 */
	public void setBANK(String bANK) {
		BANK = bANK;
	}
	/**
	 * @return the bANKNO
	 */
	public String getBANKNO() {
		return BANKNO;
	}
	/**
	 * @param bANKNO the bANKNO to set
	 */
	public void setBANKNO(String bANKNO) {
		BANKNO = bANKNO;
	}
	/**
	 * @return the mONTHLYRENT
	 */
	public int getMONTHLYRENT() {
		return MONTHLYRENT;
	}
	/**
	 * @param mONTHLYRENT the mONTHLYRENT to set
	 */
	public void setMONTHLYRENT(int mONTHLYRENT) {
		MONTHLYRENT = mONTHLYRENT;
	}
	/**
	 * @return the lANDLORD
	 */
	public String getLANDLORD() {
		return LANDLORD;
	}
	/**
	 * @param lANDLORD the lANDLORD to set
	 */
	public void setLANDLORD(String lANDLORD) {
		LANDLORD = lANDLORD;
	}
	/**
	 * @return the lANDLORDCONTACT
	 */
	public String getLANDLORDCONTACT() {
		return LANDLORDCONTACT;
	}
	/**
	 * @param lANDLORDCONTACT the lANDLORDCONTACT to set
	 */
	public void setLANDLORDCONTACT(String lANDLORDCONTACT) {
		LANDLORDCONTACT = lANDLORDCONTACT;
	}
	/**
	 * @return the rENTDUETIME
	 */
	public String getRENTDUETIME() {
		return RENTDUETIME;
	}
	/**
	 * @param rENTDUETIME the rENTDUETIME to set
	 */
	public void setRENTDUETIME(String rENTDUETIME) {
		RENTDUETIME = rENTDUETIME;
	}
	/**
	 * @return the mINDAY
	 */
	public int getMINDAY() {
		return MINDAY;
	}
	/**
	 * @param mINDAY the mINDAY to set
	 */
	public void setMINDAY(int mINDAY) {
		MINDAY = mINDAY;
	}
	/**
	 * @return the mAXDAY
	 */
	public int getMAXDAY() {
		return MAXDAY;
	}
	/**
	 * @param mAXDAY the mAXDAY to set
	 */
	public void setMAXDAY(int mAXDAY) {
		MAXDAY = mAXDAY;
	}
	/**
	 * @return the sENDINTERVAL
	 */
	public int getSENDINTERVAL() {
		return SENDINTERVAL;
	}
	/**
	 * @param sENDINTERVAL the sENDINTERVAL to set
	 */
	public void setSENDINTERVAL(int sENDINTERVAL) {
		SENDINTERVAL = sENDINTERVAL;
	}
	/**
	 * @return the sENDTYPE
	 */
	public String getSENDTYPE() {
		return SENDTYPE;
	}
	/**
	 * @param sENDTYPE the sENDTYPE to set
	 */
	public void setSENDTYPE(String sENDTYPE) {
		SENDTYPE = sENDTYPE;
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
	 * @return the cUSTNO
	 */
	public int getCUSTNO() {
		return CUSTNO;
	}
	/**
	 * @param cUSTNO the cUSTNO to set
	 */
	public void setCUSTNO(int cUSTNO) {
		CUSTNO = cUSTNO;
	}
	/**
	 * @return the wHLGROUPID
	 */
	public Integer getWHLGROUPID() {
		return WHLGROUPID;
	}
	/**
	 * @param wHLGROUPID the wHLGROUPID to set
	 */
	public void setWHLGROUPID(Integer wHLGROUPID) {
		WHLGROUPID = wHLGROUPID;
	}
	/**
	 * @return the dESCODE_CORPID
	 */
	public String getDESCODE_CORPID() {
		return DESCODE_CORPID;
	}
	/**
	 * @param dESCODE_CORPID the dESCODE_CORPID to set
	 */
	public void setDESCODE_CORPID(String dESCODE_CORPID) {
		DESCODE_CORPID = dESCODE_CORPID;
	}
	/**
	 * @return the wHOLESALE_COMPID
	 */
	public int getWHOLESALE_COMPID() {
		return WHOLESALE_COMPID;
	}
	/**
	 * @param wHOLESALE_COMPID the wHOLESALE_COMPID to set
	 */
	public void setWHOLESALE_COMPID(int wHOLESALE_COMPID) {
		WHOLESALE_COMPID = wHOLESALE_COMPID;
	}
	/**
	 * @return the wHOLESALE_BUSNO
	 */
	public Integer getWHOLESALE_BUSNO() {
		return WHOLESALE_BUSNO;
	}
	/**
	 * @param wHOLESALE_BUSNO the wHOLESALE_BUSNO to set
	 */
	public void setWHOLESALE_BUSNO(Integer wHOLESALE_BUSNO) {
		WHOLESALE_BUSNO = wHOLESALE_BUSNO;
	}
	/**
	 * @return the vENDORNO
	 */
	public int getVENDORNO() {
		return VENDORNO;
	}
	/**
	 * @param vENDORNO the vENDORNO to set
	 */
	public void setVENDORNO(int vENDORNO) {
		VENDORNO = vENDORNO;
	}
	/**
	 * @return the pOSNO
	 */
	public String getPOSNO() {
		return POSNO;
	}
	/**
	 * @param pOSNO the pOSNO to set
	 */
	public void setPOSNO(String pOSNO) {
		POSNO = pOSNO;
	}
	/**
	 * @return the lEECHDOMLIC
	 */
	public String getLEECHDOMLIC() {
		return LEECHDOMLIC;
	}
	/**
	 * @param lEECHDOMLIC the lEECHDOMLIC to set
	 */
	public void setLEECHDOMLIC(String lEECHDOMLIC) {
		LEECHDOMLIC = lEECHDOMLIC;
	}
	/**
	 * @return the lEECHDOMLIC_NO
	 */
	public String getLEECHDOMLIC_NO() {
		return LEECHDOMLIC_NO;
	}
	/**
	 * @param lEECHDOMLIC_NO the lEECHDOMLIC_NO to set
	 */
	public void setLEECHDOMLIC_NO(String lEECHDOMLIC_NO) {
		LEECHDOMLIC_NO = lEECHDOMLIC_NO;
	}
	/**
	 * @return the cOMMNAME
	 */
	public String getCOMMNAME() {
		return COMMNAME;
	}
	/**
	 * @param cOMMNAME the cOMMNAME to set
	 */
	public void setCOMMNAME(String cOMMNAME) {
		COMMNAME = cOMMNAME;
	}
	/**
	 * @return the tEMP_INVALIDATE
	 */
	public String getTEMP_INVALIDATE() {
		return TEMP_INVALIDATE;
	}
	/**
	 * @param tEMP_INVALIDATE the tEMP_INVALIDATE to set
	 */
	public void setTEMP_INVALIDATE(String tEMP_INVALIDATE) {
		TEMP_INVALIDATE = tEMP_INVALIDATE;
	}
	/**
	 * @return the fLAG
	 */
	public int getFLAG() {
		return FLAG;
	}
	/**
	 * @param fLAG the fLAG to set
	 */
	public void setFLAG(int fLAG) {
		FLAG = fLAG;
	}
	/**
	 * @return the sERVER_ADDR
	 */
	public String getSERVER_ADDR() {
		return SERVER_ADDR;
	}
	/**
	 * @param sERVER_ADDR the sERVER_ADDR to set
	 */
	public void setSERVER_ADDR(String sERVER_ADDR) {
		SERVER_ADDR = sERVER_ADDR;
	}
	/**
	 * @return the aCCOUNTTYPE
	 */
	public int getACCOUNTTYPE() {
		return ACCOUNTTYPE;
	}
	/**
	 * @param aCCOUNTTYPE the aCCOUNTTYPE to set
	 */
	public void setACCOUNTTYPE(int aCCOUNTTYPE) {
		ACCOUNTTYPE = aCCOUNTTYPE;
	}
	/**
	 * @return the sERVER_ADDR_GET
	 */
	public String getSERVER_ADDR_GET() {
		return SERVER_ADDR_GET;
	}
	/**
	 * @param sERVER_ADDR_GET the sERVER_ADDR_GET to set
	 */
	public void setSERVER_ADDR_GET(String sERVER_ADDR_GET) {
		SERVER_ADDR_GET = sERVER_ADDR_GET;
	}
	/**
	 * @return the bUSINESS_LICENSE
	 */
	public String getBUSINESS_LICENSE() {
		return BUSINESS_LICENSE;
	}
	/**
	 * @param bUSINESS_LICENSE the bUSINESS_LICENSE to set
	 */
	public void setBUSINESS_LICENSE(String bUSINESS_LICENSE) {
		BUSINESS_LICENSE = bUSINESS_LICENSE;
	}
	/**
	 * @return the wX_LABEL
	 */
	public String getWX_LABEL() {
		return WX_LABEL;
	}
	/**
	 * @param wX_LABEL the wX_LABEL to set
	 */
	public void setWX_LABEL(String wX_LABEL) {
		WX_LABEL = wX_LABEL;
	}
	/**
	 * @return the wX_LATITUDE
	 */
	public int getWX_LATITUDE() {
		return WX_LATITUDE;
	}
	/**
	 * @param wX_LATITUDE the wX_LATITUDE to set
	 */
	public void setWX_LATITUDE(int wX_LATITUDE) {
		WX_LATITUDE = wX_LATITUDE;
	}
	/**
	 * @return the wX_LONGITUDE
	 */
	public int getWX_LONGITUDE() {
		return WX_LONGITUDE;
	}
	/**
	 * @param wX_LONGITUDE the wX_LONGITUDE to set
	 */
	public void setWX_LONGITUDE(int wX_LONGITUDE) {
		WX_LONGITUDE = wX_LONGITUDE;
	}
	/**
	 * @return the wX_PRECISION
	 */
	public int getWX_PRECISION() {
		return WX_PRECISION;
	}
	/**
	 * @param wX_PRECISION the wX_PRECISION to set
	 */
	public void setWX_PRECISION(int wX_PRECISION) {
		WX_PRECISION = wX_PRECISION;
	}
	/**
	 * @return the wX_TICKET
	 */
	public String getWX_TICKET() {
		return WX_TICKET;
	}
	/**
	 * @param wX_TICKET the wX_TICKET to set
	 */
	public void setWX_TICKET(String wX_TICKET) {
		WX_TICKET = wX_TICKET;
	}
	/**
	 * @return the wX_USER
	 */
	public String getWX_USER() {
		return WX_USER;
	}
	/**
	 * @param wX_USER the wX_USER to set
	 */
	public void setWX_USER(String wX_USER) {
		WX_USER = wX_USER;
	}
	/**
	 * @return the wX_URL
	 */
	public String getWX_URL() {
		return WX_URL;
	}
	/**
	 * @param wX_URL the wX_URL to set
	 */
	public void setWX_URL(String wX_URL) {
		WX_URL = wX_URL;
	}
	/**
	 * @return the wX_OPENID
	 */
	public String getWX_OPENID() {
		return WX_OPENID;
	}
	/**
	 * @param wX_OPENID the wX_OPENID to set
	 */
	public void setWX_OPENID(String wX_OPENID) {
		WX_OPENID = wX_OPENID;
	}
	/**
	 * @return the wX_QRCODE
	 */
	public String getWX_QRCODE() {
		return WX_QRCODE;
	}
	/**
	 * @param wX_QRCODE the wX_QRCODE to set
	 */
	public void setWX_QRCODE(String wX_QRCODE) {
		WX_QRCODE = wX_QRCODE;
	}
	/**
	 * @return the oRGLEVEL
	 */
	public String getORGLEVEL() {
		return ORGLEVEL;
	}
	/**
	 * @param oRGLEVEL the oRGLEVEL to set
	 */
	public void setORGLEVEL(String oRGLEVEL) {
		ORGLEVEL = oRGLEVEL;
	}
	/**
	 * @return the oFFLIN
	 */
	public int getOFFLIN() {
		return OFFLIN;
	}
	/**
	 * @param oFFLIN the oFFLIN to set
	 */
	public void setOFFLIN(int oFFLIN) {
		OFFLIN = oFFLIN;
	}
	/**
	 * @return the c_WMS_BUSNO
	 */
	public String getC_WMS_BUSNO() {
		return C_WMS_BUSNO;
	}
	/**
	 * @param c_WMS_BUSNO the c_WMS_BUSNO to set
	 */
	public void setC_WMS_BUSNO(String c_WMS_BUSNO) {
		C_WMS_BUSNO = c_WMS_BUSNO;
	}
	/**
	 * @return the c_BUSCODE
	 */
	public String getC_BUSCODE() {
		return C_BUSCODE;
	}
	/**
	 * @param c_BUSCODE the c_BUSCODE to set
	 */
	public void setC_BUSCODE(String c_BUSCODE) {
		C_BUSCODE = c_BUSCODE;
	}
	/**
	 * @return the gROUPNO
	 */
	public String getGROUPNO() {
		return GROUPNO;
	}
	/**
	 * @param gROUPNO the gROUPNO to set
	 */
	public void setGROUPNO(String gROUPNO) {
		GROUPNO = gROUPNO;
	}
	/**
	 * @return the lAUNCH_DATE
	 */
	public String getLAUNCH_DATE() {
		return LAUNCH_DATE;
	}
	/**
	 * @param lAUNCH_DATE the lAUNCH_DATE to set
	 */
	public void setLAUNCH_DATE(String lAUNCH_DATE) {
		LAUNCH_DATE = lAUNCH_DATE;
	}
	/**
	 * @return the aCCEPTUSER
	 */
	public int getACCEPTUSER() {
		return ACCEPTUSER;
	}
	/**
	 * @param aCCEPTUSER the aCCEPTUSER to set
	 */
	public void setACCEPTUSER(int aCCEPTUSER) {
		ACCEPTUSER = aCCEPTUSER;
	}
	/**
	 * @return the tALLYUSER
	 */
	public int getTALLYUSER() {
		return TALLYUSER;
	}
	/**
	 * @param tALLYUSER the tALLYUSER to set
	 */
	public void setTALLYUSER(int tALLYUSER) {
		TALLYUSER = tALLYUSER;
	}
	/**
	 * @return the cHECKUSER
	 */
	public int getCHECKUSER() {
		return CHECKUSER;
	}
	/**
	 * @param cHECKUSER the cHECKUSER to set
	 */
	public void setCHECKUSER(int cHECKUSER) {
		CHECKUSER = cHECKUSER;
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
	/**
	 * @return the cCOMPID
	 */
	public int getCCOMPID() {
		return CCOMPID;
	}
	/**
	 * @param cCOMPID the cCOMPID to set
	 */
	public void setCCOMPID(int cCOMPID) {
		CCOMPID = cCOMPID;
	}
	
	
}
