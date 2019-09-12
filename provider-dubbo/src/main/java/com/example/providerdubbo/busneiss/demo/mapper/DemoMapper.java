package com.example.providerdubbo.busneiss.demo.mapper;

import com.my.dubboservice.busniess.demo.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {

    List<SysUser> selectAll();
}
