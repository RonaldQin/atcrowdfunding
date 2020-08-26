package com.example.manager.dao;

import java.util.List;
import java.util.Map;

import com.example.bean.Role;
import com.example.bean.RolePermission;
import com.example.bean.User;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    Role selectByPrimaryKey(Integer id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);

    List<User> pageQuery(Map paramMap);

    Integer queryCount(Map paramMap);

    void deleteRolePermissionRelationship(Integer roleid);

    int insertRolePermission(RolePermission rp);
}