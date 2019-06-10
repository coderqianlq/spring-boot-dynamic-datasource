package com.qianlq.dynamicdatasource.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qianliqing
 * @date 2019/6/6 11:01 AM
 * email: qianlq0824@gmail.com
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends BaseEntity {

    private String id;

    private String name;

    private String birth;
}
