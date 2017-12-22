package com.hydee.hcrm.pojo;

import java.util.Date;

//病种对应并发症状信息
public class t_crm_entity_syndrome {
	
	private Integer COMPID;//企业编码
	private String ENTITYID;//病种编号
	private String SYNDROME;//并发症状
	private String CODE;//症状编码
	private String NOTES;//备注
	private Integer LASTMODIFY;//最后修改人
	private Date LASTTIME;//最后修改时间
	
	public Integer getCOMPID() {
		return COMPID;
	}
	public void setCOMPID(Integer cOMPID) {
		COMPID = cOMPID;
	}
	public String getENTITYID() {
		return ENTITYID;
	}
	public void setENTITYID(String eNTITYID) {
		ENTITYID = eNTITYID;
	}
	public String getSYNDROME() {
		return SYNDROME;
	}
	public void setSYNDROME(String sYNDROME) {
		SYNDROME = sYNDROME;
	}
	public String getCODE() {
		return CODE;
	}
	public void setCODE(String cODE) {
		CODE = cODE;
	}
	public String getNOTES() {
		return NOTES;
	}
	public void setNOTES(String nOTES) {
		NOTES = nOTES;
	}
	public Integer getLASTMODIFY() {
		return LASTMODIFY;
	}
	public void setLASTMODIFY(Integer lASTMODIFY) {
		LASTMODIFY = lASTMODIFY;
	}
	public Date getLASTTIME() {
		return LASTTIME;
	}
	public void setLASTTIME(Date lASTTIME) {
		LASTTIME = lASTTIME;
	}

	
}
