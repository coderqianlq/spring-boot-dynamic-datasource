package com.qianlq.dynamicdatasource.service;

import com.qianlq.dynamicdatasource.common.BaseResult;
import com.qianlq.dynamicdatasource.model.vo.UserVo;

/**
 * @author qianliqing
 * @date 2019/6/6 11:35 AM
 * email: qianlq0824@gmail.com
 */

public interface UserService {

    /**
     * 查询用户
     *
     * @param id 用户id
     * @return UserEntity
     */
    BaseResult<UserVo> findUser(String id);
}
