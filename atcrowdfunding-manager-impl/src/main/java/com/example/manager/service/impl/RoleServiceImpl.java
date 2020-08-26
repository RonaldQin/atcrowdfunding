package com.example.manager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.RolePermission;
import com.example.bean.User;
import com.example.manager.dao.RoleMapper;
import com.example.manager.service.RoleService;
import com.example.util.Page;
import com.example.vo.Data;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Page pageQuery(Map paramMap) {
        Page rolePage = new Page((Integer) paramMap.get("pageno"), (Integer) paramMap.get("pagesize"));

        Integer startIndex = rolePage.getStartIndex();
        paramMap.put("startIndex", startIndex);
        List<User> datas = roleMapper.pageQuery(paramMap);
        rolePage.setDatas(datas);

        Integer totalsize = roleMapper.queryCount(paramMap);
        rolePage.setTotalsize(totalsize);

        return rolePage;
    }

    @Override
    public int deleteRole(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int saveRolePermissionRelationship(Integer roleid, Data datas) {
        roleMapper.deleteRolePermissionRelationship(roleid);

        int totalCount = 0;
        List<Integer> ids = datas.getIds();
        for (Integer permissionid : ids) {
            RolePermission rp = new RolePermission();
            rp.setRoleid(roleid);
            rp.setPermissionid(permissionid);
            int count = roleMapper.insertRolePermission(rp);
            totalCount += count;
        }
        return totalCount;
    }
}
