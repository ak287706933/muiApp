package com.hydee.hcrm.pojo;

import java.sql.Timestamp;

/**
 * 健康档案新增修改单对应用药
 * @author zengl
 * @date 2017-12-17
 */
public class CrmDrugNote {
	private Integer compid;
	private String billNo;
	private String fileNo;
	private String memcardNo;
	private Timestamp startTime;
	private Timestamp endTime;
	private Long availableDays;
	private String notes;
	private Integer stillUse;
	private Long wareid;
	private Integer lastModify;
	private Timestamp lastTime;
	private Integer addType;//1、线上添加,2.线下添加
	private String usage;
	
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
	public String getFileNo() {
		return fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}
	public String getMemcardNo() {
		return memcardNo;
	}
	public void setMemcardNo(String memcardNo) {
		this.memcardNo = memcardNo;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	public Long getAvailableDays() {
		return availableDays;
	}
	public void setAvailableDays(Long availableDays) {
		this.availableDays = availableDays;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Integer getStillUse() {
		return stillUse;
	}
	public void setStillUse(Integer stillUse) {
		this.stillUse = stillUse;
	}
	public Long getWareid() {
		return wareid;
	}
	public void setWareid(Long wareid) {
		this.wareid = wareid;
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
	public Integer getAddType() {
		return addType;
	}
	public void setAddType(Integer addType) {
		this.addType = addType;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	
}
