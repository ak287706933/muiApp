package com.hydee.hcrm.vo;

import java.util.List;

import com.hydee.hcrm.pojo.CrmDiseaseNote;
import com.hydee.hcrm.pojo.CrmDrugNote;
import com.hydee.hcrm.pojo.CrmHealthModilis;
import com.hydee.hcrm.pojo.t_crm_memcard_reg;

public class HealthFileAddVO {

	private CrmHealthModilis crmHealthModilis;
	private List<CrmDiseaseNote> crmDiseaseNoteList;
	private CrmDrugNote crmDrugNote;
	private t_crm_memcard_reg reg;
	
	public CrmHealthModilis getCrmHealthModilis() {
		return crmHealthModilis;
	}
	public void setCrmHealthModilis(CrmHealthModilis crmHealthModilis) {
		this.crmHealthModilis = crmHealthModilis;
	}
	
	public List<CrmDiseaseNote> getCrmDiseaseNoteList() {
		return crmDiseaseNoteList;
	}
	public void setCrmDiseaseNoteList(List<CrmDiseaseNote> crmDiseaseNoteList) {
		this.crmDiseaseNoteList = crmDiseaseNoteList;
	}
	public CrmDrugNote getCrmDrugNote() {
		return crmDrugNote;
	}
	public void setCrmDrugNote(CrmDrugNote crmDrugNote) {
		this.crmDrugNote = crmDrugNote;
	}
	public t_crm_memcard_reg getReg() {
		return reg;
	}
	public void setReg(t_crm_memcard_reg reg) {
		this.reg = reg;
	}
	
}
