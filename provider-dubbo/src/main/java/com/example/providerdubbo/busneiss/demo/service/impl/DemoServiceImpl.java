package com.example.providerdubbo.busneiss.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.providerdubbo.busneiss.demo.mapper.DemoMapper;
import com.my.dubboservice.busniess.demo.entity.SysUser;
import com.my.dubboservice.busniess.demo.service.DemoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Service(version = "1.0.0", timeout = 3000)
@Component
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Override
    public List<SysUser> selectAll() {
        return demoMapper.selectAll();
    }
}
