package com.dianping.pigeon.api.service2.impl;


import com.dianping.pigeon.api.service.EchoService;
import com.dianping.pigeon.remoting.provider.config.annotation.Service;

@Service
public class EchoServiceImpl2 implements EchoService {

    public String echo(String name) {
        return "Hello"+ name;
    }
}
