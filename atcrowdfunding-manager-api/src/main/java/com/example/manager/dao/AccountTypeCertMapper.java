package com.example.manager.dao;


import java.util.List;
import java.util.Map;

import com.example.bean.AccountTypeCert;

public interface AccountTypeCertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountTypeCert record);

    AccountTypeCert selectByPrimaryKey(Integer id);

    List<AccountTypeCert> selectAll();

    int updateByPrimaryKey(AccountTypeCert record);

    List<Map<String, Object>> queryCertAccttype();

    int insertAcctTypeCert(Map<String, Object> paramMap);

    int deleteAcctTypeCert(Map<String, Object> paramMap);
}