package com.qianlq.dynamicdatasource.service.impl;

import com.qianlq.dynamicdatasource.common.BaseResult;
import com.qianlq.dynamicdatasource.common.constant.Code;
import com.qianlq.dynamicdatasource.mapper.UserMapper;
import com.qianlq.dynamicdatasource.model.entity.UserEntity;
import com.qianlq.dynamicdatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qianliqing
 * @date 2019/6/6 11:36 AM
 * email: qianlq0824@gmail.com
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseResult<UserEntity> findUser(String id) {
        UserEntity user = userMapper.findUserById(id);
        BaseResult<UserEntity> result = new BaseResult<>(Code.SUCCESS, user);
        return result;
    }
}
