package com.hydee.hcrm.service.i;

import com.hydee.hcrm.vo.HealthFileAddVO;

public interface IHealthFileAddService {
	
	/**
	 * 新增健康档案
	 * @param 
	 */
	public void addCrmHealthFile(HealthFileAddVO vo);
	
	public String findHealthFileNo();
	
}
