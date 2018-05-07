package com.dianping.pigeon.api.service2.impl;

import com.dianping.pigeon.remoting.common.config.annotation.PigeonConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

@PigeonConfiguration(basePackages = "com.dianping.pigeon.api.service2.impl")
public class ServerBootStrap {

    private static final Logger logger = LoggerFactory.getLogger(ServerBootStrap.class);

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ServerBootStrap.class);
        ctx.refresh();
        logger.info("pigeon-server2 server start");
        System.in.read();
    }
}
