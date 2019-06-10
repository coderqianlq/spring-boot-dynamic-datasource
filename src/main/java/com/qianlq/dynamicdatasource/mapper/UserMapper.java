package com.qianlq.dynamicdatasource.mapper;

import com.qianlq.dynamicdatasource.model.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author qianliqing
 * @date 2019/6/6 11:21 AM
 * email: qianlq0824@gmail.com
 */

@Mapper
public interface UserMapper {

    /**
     * 根据用户id查询
     *
     * @param id 用户id
     * @return User
     */
    UserEntity findUserById(@Param("id") String id);
}
