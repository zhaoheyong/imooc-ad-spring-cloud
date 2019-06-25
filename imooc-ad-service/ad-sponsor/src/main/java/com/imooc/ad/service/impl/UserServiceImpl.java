package com.imooc.ad.service.impl;

import com.imooc.ad.constant.Constants;
import com.imooc.ad.dao.AdUserMapper;
import com.imooc.ad.entity.AdUser;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.IUserService;
import com.imooc.ad.utils.CommonUtils;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Qinyi.
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	AdUserMapper aduser;
	
	@Override
	@Transactional
	public CreateUserResponse createUser(CreateUserRequest request) throws AdException {
		if(!request.validate()) {
			throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
		}
		AdUser olduser = aduser.findByUsername(request.getUsername());
		if(null!= olduser){
			throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
		}
		
		AdUser newUser = new AdUser(request.getUsername(),CommonUtils.md5(request.getUsername()));
		
        int count = aduser.save(newUser);
        
        if(count!=1){
        	throw new AdException(Constants.ErrorMsg.INSERT_FAIL_ERROR);
        }
        return new CreateUserResponse(
                newUser.getId(), newUser.getUsername(), newUser.getToken(),
                newUser.getCreateTime(), newUser.getUpdateTime()
        );
		
	}


}
