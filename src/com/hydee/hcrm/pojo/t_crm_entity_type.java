package com.hydee.hcrm.pojo;

import java.util.Date;

//病种对应类型信息
public class t_crm_entity_type {
	
	private Integer COMPID;//企业编码
	private String ENTITYID;//病种编号
	private String TYPENAME;//并发症状
	private String TYPECODE;//症状编码
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
	public String getTYPENAME() {
		return TYPENAME;
	}
	public void setTYPENAME(String tYPENAME) {
		TYPENAME = tYPENAME;
	}
	public String getTYPECODE() {
		return TYPECODE;
	}
	public void setTYPECODE(String tYPECODE) {
		TYPECODE = tYPECODE;
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
