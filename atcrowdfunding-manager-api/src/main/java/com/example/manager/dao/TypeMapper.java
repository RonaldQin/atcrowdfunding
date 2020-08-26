package com.example.manager.dao;

import java.util.List;

import com.example.bean.Type;

public interface TypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Type record);

    Type selectByPrimaryKey(Integer id);

    List<Type> selectAll();

    int updateByPrimaryKey(Type record);
}