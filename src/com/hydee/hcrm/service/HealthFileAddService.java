package com.hydee.hcrm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hydee.hcrm.mapper.HealthFileAddMapper;
import com.hydee.hcrm.service.i.IHealthFileAddService;
import com.hydee.hcrm.vo.HealthFileAddVO;

@Service("healthFileAddService")
public class HealthFileAddService implements IHealthFileAddService{

	@Resource  
	private HealthFileAddMapper healthFileAddMapper;

	@Transactional
	@Override
	public void addCrmHealthFile(HealthFileAddVO vo) {
		healthFileAddMapper.addCrmHealthModilis(vo.getCrmHealthModilis());
		healthFileAddMapper.addCrmDiseaseNoteBatch(vo.getCrmDiseaseNoteList());
		healthFileAddMapper.addCrmDrugNote(vo.getCrmDrugNote());
	}

	@Override
	public String findHealthFileNo() {
		return healthFileAddMapper.findHealthFileNo();
	}
	
	
}
