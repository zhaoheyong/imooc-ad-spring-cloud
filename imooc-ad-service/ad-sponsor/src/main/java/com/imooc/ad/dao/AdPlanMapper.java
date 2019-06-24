package com.imooc.ad.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.imooc.ad.entity.AdPlan;
@Mapper
public interface AdPlanMapper {
	
	AdPlan findByIdAndUserId(Long id, Long userId);
	
    List<AdPlan> findAllByIdInAndUserId(@Param("ids")List<Long> ids,@Param("userId") Long userId);

    AdPlan findByUserIdAndPlanName(Long userId, String planName);

    List<AdPlan> findAllByPlanStatus(Integer status);

	Optional<AdPlan> findById(Long planId);

}