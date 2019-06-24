package com.imooc.ad.dao;

import com.imooc.ad.entity.AdPlan;
import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
/**
 * Created by Qinyi.
 */

public interface AdPlanRepository {

    AdPlan findByIdAndUserId(Long id, Long userId);

    List<AdPlan> findAllByIdInAndUserId(List<Long> ids, Long userId);

    AdPlan findByUserIdAndPlanName(Long userId, String planName);

    List<AdPlan> findAllByPlanStatus(Integer status);

	Optional<AdPlan> findById(Long planId);
}
