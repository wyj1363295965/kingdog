package com.wyj.kingdog.schedule;

import com.wyj.kingdog.config.tcp.BootNettyServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class MyRunner implements CommandLineRunner {

    @Value("${netty.port}")
    private Integer nettyPort;

    @Override
    public void run(String... args) throws Exception {
        /**
         * 使用异步注解方式启动netty服务端服务
         */
        new BootNettyServer().bind(nettyPort);
    }
}
