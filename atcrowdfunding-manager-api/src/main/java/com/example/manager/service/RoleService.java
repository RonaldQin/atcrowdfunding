package com.example.manager.service;


import java.util.Map;

import com.example.util.Page;
import com.example.vo.Data;

public interface RoleService {
    Page pageQuery(Map paramMap);

    int deleteRole(Integer id);

    int saveRolePermissionRelationship(Integer roleid, Data datas);
}
