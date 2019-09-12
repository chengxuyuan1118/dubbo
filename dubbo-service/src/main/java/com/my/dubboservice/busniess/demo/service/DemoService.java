package com.my.dubboservice.busniess.demo.service;

import com.my.dubboservice.busniess.demo.entity.SysUser;

import java.util.List;

public interface DemoService {

    List<SysUser> selectAll();
}
