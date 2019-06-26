package com.imooc.ad.dao;


import org.apache.ibatis.annotations.Mapper;

import com.imooc.ad.entity.AdUser;

@Mapper
public interface AdUserMapper {
	
    /**
     * <h2>根据用户名查找用户记录</h2>
     * */
    AdUser findByUsername(String username);

    AdUser findById(Long userId);
	
	int save(AdUser adUser);
	
	//
	
	
    int deleteByPrimaryKey(Long id);

    int insert(AdUser record);

    int insertSelective(AdUser record);


    int updateByPrimaryKeySelective(AdUser record);

    int updateByPrimaryKey(AdUser record);

}