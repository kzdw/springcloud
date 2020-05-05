package com.zhousheng.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("serverprovider")//直接指定那个服务提供
public interface IService {

    @RequestMapping("/findStudent")
    String findStudent();

}
