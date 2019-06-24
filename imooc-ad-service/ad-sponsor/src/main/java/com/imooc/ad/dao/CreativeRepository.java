package com.imooc.ad.dao;


import java.util.List;


/**
 * Created by Qinyi.
 */
public interface CreativeRepository {

	List<Long> findAllById(List<Long> creativeIds);
}
