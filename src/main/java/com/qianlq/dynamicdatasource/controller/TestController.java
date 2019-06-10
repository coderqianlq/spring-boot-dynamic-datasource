package com.qianlq.dynamicdatasource.controller;

import com.qianlq.dynamicdatasource.common.BaseResult;
import com.qianlq.dynamicdatasource.model.vo.UserVo;
import com.qianlq.dynamicdatasource.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianliqing
 * @date 2019-05-19 10:35 AM
 * mail: qianlq0824@gmail.com
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户信息", notes = "查询用户信息")
    @GetMapping(
            value = "/find"
    )
    public BaseResult<UserVo> findUser(@ApiParam(value = "用户id", required = true) @RequestParam(value = "id") String id) {
        return userService.findUser(id);
    }
}
