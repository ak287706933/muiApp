package com.hydee.hcrm.pojo;

import java.util.Date;

//患病信息
public class t_crm_disease {
	
	private Integer compid;
	private String billno;
	private String fileno;
	private String memcardno;
	private String entityid;
	private String diseaseid;
	private String diseasetype;
	private String diseasename;
	private String symptoms;
	private Date shootingtime;
	private String treatmentstate;
	private String pathogeny;
	private String concurrent;
	
	public String getBillno() {
		return billno;
	}
	public void setBillno(String billno) {
		this.billno = billno;
	}
	public Integer getCompid() {
		return compid;
	}
	public void setCompid(Integer compid) {
		this.compid = compid;
	}
	public String getFileno() {
		return fileno;
	}
	public void setFileno(String fileno) {
		this.fileno = fileno;
	}
	public String getMemcardno() {
		return memcardno;
	}
	public void setMemcardno(String memcardno) {
		this.memcardno = memcardno;
	}
	public String getEntityid() {
		return entityid;
	}
	public void setEntityid(String entityid) {
		this.entityid = entityid;
	}
	public String getDiseaseid() {
		return diseaseid;
	}
	public void setDiseaseid(String diseaseid) {
		this.diseaseid = diseaseid;
	}
	public String getDiseasetype() {
		return diseasetype;
	}
	public void setDiseasetype(String diseasetype) {
		this.diseasetype = diseasetype;
	}
	public String getDiseasename() {
		return diseasename;
	}
	public void setDiseasename(String diseasename) {
		this.diseasename = diseasename;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public Date getShootingtime() {
		return shootingtime;
	}
	public void setShootingtime(Date shootingtime) {
		this.shootingtime = shootingtime;
	}
	public String getTreatmentstate() {
		return treatmentstate;
	}
	public void setTreatmentstate(String treatmentstate) {
		this.treatmentstate = treatmentstate;
	}
	public String getPathogeny() {
		return pathogeny;
	}
	public void setPathogeny(String pathogeny) {
		this.pathogeny = pathogeny;
	}
	public String getConcurrent() {
		return concurrent;
	}
	public void setConcurrent(String concurrent) {
		this.concurrent = concurrent;
	}
	
	
}
