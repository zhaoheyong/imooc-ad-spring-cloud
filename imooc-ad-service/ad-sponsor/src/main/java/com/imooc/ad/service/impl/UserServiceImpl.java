package com.imooc.ad.service.impl;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.IUserService;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Qinyi.
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {
	
	@Override
	@Transactional
	public CreateUserResponse createUser(CreateUserRequest request) throws AdException {
		// TODO Auto-generated method stub
		if(!request.validate()) {
			throw new AdException("");
		}
		return null;
	}


}
