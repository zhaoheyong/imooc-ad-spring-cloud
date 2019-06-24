package com.imooc.ad.dao;

import com.imooc.ad.entity.AdUser;
import java.util.Optional;


/**
 * Created by Qinyi.
 */
public interface AdUserRepository{

    /**
     * <h2>根据用户名查找用户记录</h2>
     * */
    AdUser findByUsername(String username);

	Optional<AdUser> findById(Long userId);
    
}
