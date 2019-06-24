package com.imooc.ad.dao.unit_condition;

import com.imooc.ad.entity.unit_condition.CreativeUnit;

import java.util.Collection;
import java.util.List;


/**
 * Created by Qinyi.
 */
public interface CreativeUnitRepository{

	Collection<Long> saveAll(List<CreativeUnit> creativeUnits);
}
