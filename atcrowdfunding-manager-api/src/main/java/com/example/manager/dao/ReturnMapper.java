package com.example.manager.dao;

import java.util.List;

import com.example.bean.Return;

public interface ReturnMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Return record);

    Return selectByPrimaryKey(Integer id);

    List<Return> selectAll();

    int updateByPrimaryKey(Return record);
}