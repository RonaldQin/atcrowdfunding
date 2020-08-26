package com.example.manager.dao;

import java.util.List;

import com.example.bean.RolePermission;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePermission record);

    RolePermission selectByPrimaryKey(Integer id);

    List<RolePermission> selectAll();

    int updateByPrimaryKey(RolePermission record);
}