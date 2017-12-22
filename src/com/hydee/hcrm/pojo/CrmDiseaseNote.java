package com.hydee.hcrm.pojo;

import java.sql.Timestamp;

/**
 * 健康档案新增修改单对应病症pojo
 * @author zengl
 * @date 2017-12-17
 */
public class CrmDiseaseNote {
	private Integer compid; //企业编号
	private String billNo;
	private String memcardNo;
	private String entityId;
	private String diseaseId;
	private String diseaseType;
	private String diseaseName;
	private Timestamp shootingtime;
	private String treatmentState;
	private String pathogeny;
	private String concurrent;
	private Integer lastModify;
	private Timestamp lastTime;
	private String fileNo;
	private String symptoms;
	private Integer addType;//1、线上添加,2.线下添加
	
	public Integer getCompid() {
		return compid;
	}
	public void setCompid(Integer compid) {
		this.compid = compid;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getMemcardNo() {
		return memcardNo;
	}
	public void setMemcardNo(String memcardNo) {
		this.memcardNo = memcardNo;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public String getDiseaseId() {
		return diseaseId;
	}
	public void setDiseaseId(String diseaseId) {
		this.diseaseId = diseaseId;
	}
	public String getDiseaseType() {
		return diseaseType;
	}
	public void setDiseaseType(String diseaseType) {
		this.diseaseType = diseaseType;
	}
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public Timestamp getShootingtime() {
		return shootingtime;
	}
	public void setShootingtime(Timestamp shootingtime) {
		this.shootingtime = shootingtime;
	}
	public String getTreatmentState() {
		return treatmentState;
	}
	public void setTreatmentState(String treatmentState) {
		this.treatmentState = treatmentState;
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
	public Integer getLastModify() {
		return lastModify;
	}
	public void setLastModify(Integer lastModify) {
		this.lastModify = lastModify;
	}
	public Timestamp getLastTime() {
		return lastTime;
	}
	public void setLastTime(Timestamp lastTime) {
		this.lastTime = lastTime;
	}
	public String getFileNo() {
		return fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public Integer getAddType() {
		return addType;
	}
	public void setAddType(Integer addType) {
		this.addType = addType;
	}
}
