package com.imooc.ad.service.impl;

import com.imooc.ad.constant.Constants;
import com.imooc.ad.dao.AdPlanMapper;
import com.imooc.ad.entity.AdPlan;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.IAdPlanService;
import com.imooc.ad.vo.AdPlanGetRequest;
import com.imooc.ad.vo.AdPlanRequest;
import com.imooc.ad.vo.AdPlanResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Qinyi.
 */
@Service
public class AdPlanServiceImpl implements IAdPlanService {
	
	@Autowired
    private  AdPlanMapper planRepository;


	@Override
	public AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException {
        if (!request.validate()) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        return planRepository.findAllByIdInAndUserId(
                request.getIds(), request.getUserId()
        );		
	}

	@Override
	public AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAdPlan(AdPlanRequest request) throws AdException {
		// TODO Auto-generated method stub
		
	}

}
