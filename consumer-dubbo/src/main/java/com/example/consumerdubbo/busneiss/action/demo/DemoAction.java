package com.example.consumerdubbo.busneiss.action.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.my.dubboservice.busniess.demo.entity.SysUser;
import com.my.dubboservice.busniess.demo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class DemoAction {
    @Reference(version = "1.0.0", timeout = 300)
    private DemoService demoService;

    @GetMapping("/hello")
    public List<SysUser> hello() {
        return demoService.selectAll();
    }
}
