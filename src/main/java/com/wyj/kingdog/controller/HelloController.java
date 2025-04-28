package com.wyj.kingdog.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.wyj.kingdog.config.udp.UdpIntegrationClient;
import io.swagger.annotations.Api;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "哈喽接口", tags = {"1"})
public class HelloController {

    @Autowired
    private UdpIntegrationClient udpIntegrationClient;


    @RequestMapping(value = "/returnStr", method = RequestMethod.GET)
    public String returnStr() {

        return "success";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        StpUtil.login("111L");
        return "success";
    }


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello word";
    }

    @RequestMapping(value = "/sendUdp", method = RequestMethod.POST)
    public void sendUdp(@RequestBody String param) {
        if (StringUtils.isBlank(param)) {
            return;
        }
        udpIntegrationClient.sendMessage(param);
    }


}
