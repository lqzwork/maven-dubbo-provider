package com.liqz.modules.dubbo.service;

import com.liqz.modules.dubbo.api.MyService;

public class MyServiceImp implements MyService {
    public String getName() {
        return "success";
    }
}
