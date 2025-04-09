package com.wyj.kingdog.controller;


import com.google.common.collect.Lists;
import com.wyj.kingdog.entity.User;
import com.wyj.kingdog.entity.vo.R;
import com.wyj.kingdog.entity.vo.UserInfoVo;
import com.wyj.kingdog.entity.vo.UserLoginVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "cursor接口", tags = {"2"})
public class CursorApiController {

    @RequestMapping(value = "/auth/test", method = RequestMethod.GET)
    public String test() {
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public R<UserInfoVo> users() {
        List<UserInfoVo> users = Lists.newArrayList();
        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setId(11L).setUserName("wqw")
                .setEmail("212").setCreatedAt(new Date());

        users.add(userInfoVo);
        R r = R.ok().setData(users).setTotal(1111L);
        return r;
    }

    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    public UserLoginVo login(@RequestBody User user) {
        UserLoginVo userLoginVo = new UserLoginVo();
        userLoginVo.setToken("wyj").setMessage("登录成功1");
        return userLoginVo;
    }
}
