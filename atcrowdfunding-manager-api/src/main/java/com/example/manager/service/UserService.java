package com.example.manager.service;


import java.util.List;
import java.util.Map;

import com.example.bean.Permission;
import com.example.bean.Role;
import com.example.bean.User;
import com.example.util.Page;
import com.example.vo.Data;

public interface UserService {
    User queryUserlogin(Map<String, Object> paramMap);

    //@Deprecated
    //Page queryPage(Integer pageno, Integer pagesize);

    int saveUser(User user);

    Page queryPage(Map<String, Object> paramMap);

    User getUserById(Integer id);

    int updateUser(User user);

    int deleteUser(Integer id);

    int deleteBatchUser(Integer[] ids);

    int deleteBatchUserByVo(Data data);

    List<Role> queryAllRole();

    List<Integer> queryRoleByUserid(Integer id);

    int saveUserRoleRelationship(Integer userid, Data data);

    int deleteUserRoleRelationship(Integer userid, Data data);

    List<Permission> queryPermissionByUserid(Integer id);
}
