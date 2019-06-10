package com.qianlq.dynamicdatasource.model.vo;

import com.qianlq.dynamicdatasource.model.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qianliqing
 * @date 2019/6/10 7:22 PM
 * email: qianliqing@hyperchain.com
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {

    private String name;

    private String birth;

    public UserVo(UserEntity entity) {
        this.name = entity.getName();
        this.birth = entity.getBirth();
    }
}
