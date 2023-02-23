package com.wyj.kingdog.controller;

import com.wyj.kingdog.config.udp.UdpIntegrationClient;
import com.wyj.kingdog.entity.User;
import com.wyj.kingdog.feign.UserFeignClient;
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
    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping(name = "hello", method = RequestMethod.GET)
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

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public User getUser() {

        return userFeignClient.findById(1L);
    }
}
