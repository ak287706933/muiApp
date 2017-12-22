package com.hydee.hcrm.mapper;

import java.util.List;

import com.hydee.hcrm.pojo.CrmDiseaseNote;
import com.hydee.hcrm.pojo.CrmDrugNote;
import com.hydee.hcrm.pojo.CrmHealthModilis;


public interface HealthFileAddMapper {

	/**
	 * 新增健康档案新增修改单
	 * @param crmHealthModilis
	 */
	public void addCrmHealthModilis(CrmHealthModilis crmHealthModilis);
	
	/**
	 * 新增健康档案新增修改单对应病症
	 * @param crmDiseaseNote
	 */
	public void addCrmDiseaseNoteBatch(List<CrmDiseaseNote> crmDiseaseNoteList);
	
	/**
	 * 新增  健康档案新增修改单对应用药 
	 * @param crmDrugNote
	 */
	public void addCrmDrugNote(CrmDrugNote crmDrugNote);
	
	public String findHealthFileNo();
}
