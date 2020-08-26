package com.example.manager.dao;

import java.util.List;

import com.example.bean.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    Permission selectByPrimaryKey(Integer id);

    List<Permission> queryAllPermission();

    int updateByPrimaryKey(Permission record);

    Permission getRootPermission();

    List<Permission> getChildrenPermissionByPid(Integer id);

    List<Integer> queryPermissionidsByRoleid(Integer roleid);
}