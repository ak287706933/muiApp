package com.hydee.hcrm.pojo;

//病种信息
public class t_crm_entity {
	
	private String ENTITYID;//病种编号
	private String ENTITYNAME;//病种名称
	private String ENTITYDEFINE;//疾病定义
	private String PATHOGENY;//病因
	private String MANIFESTATION;//临床表现
	private String CHECKUP;//检查
	private String DIAGNOSE;//诊断
	private String CURE;//治疗
	private String PREVENT;//预防
	private Integer COMPID;//企业编码
	private String CONCURRENT;//并发症
	public String getENTITYID() {
		return ENTITYID;
	}
	public void setENTITYID(String eNTITYID) {
		ENTITYID = eNTITYID;
	}
	public String getENTITYNAME() {
		return ENTITYNAME;
	}
	public void setENTITYNAME(String eNTITYNAME) {
		ENTITYNAME = eNTITYNAME;
	}
	public String getENTITYDEFINE() {
		return ENTITYDEFINE;
	}
	public void setENTITYDEFINE(String eNTITYDEFINE) {
		ENTITYDEFINE = eNTITYDEFINE;
	}
	public String getPATHOGENY() {
		return PATHOGENY;
	}
	public void setPATHOGENY(String pATHOGENY) {
		PATHOGENY = pATHOGENY;
	}
	public String getMANIFESTATION() {
		return MANIFESTATION;
	}
	public void setMANIFESTATION(String mANIFESTATION) {
		MANIFESTATION = mANIFESTATION;
	}
	public String getCHECKUP() {
		return CHECKUP;
	}
	public void setCHECKUP(String cHECKUP) {
		CHECKUP = cHECKUP;
	}
	public String getDIAGNOSE() {
		return DIAGNOSE;
	}
	public void setDIAGNOSE(String dIAGNOSE) {
		DIAGNOSE = dIAGNOSE;
	}
	public String getCURE() {
		return CURE;
	}
	public void setCURE(String cURE) {
		CURE = cURE;
	}
	public String getPREVENT() {
		return PREVENT;
	}
	public void setPREVENT(String pREVENT) {
		PREVENT = pREVENT;
	}
	public Integer getCOMPID() {
		return COMPID;
	}
	public void setCOMPID(Integer cOMPID) {
		COMPID = cOMPID;
	}
	public String getCONCURRENT() {
		return CONCURRENT;
	}
	public void setCONCURRENT(String cONCURRENT) {
		CONCURRENT = cONCURRENT;
	}
	
	
}
