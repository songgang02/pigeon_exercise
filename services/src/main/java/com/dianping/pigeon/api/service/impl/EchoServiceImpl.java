package com.dianping.pigeon.api.service.impl;

import com.dianping.pigeon.api.service.EchoService;
import com.dianping.pigeon.remoting.provider.config.annotation.Service;

@Service
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String name)
    {
        return "Hello"+name;
    }
}
