package com.example.manager.dao;

import java.util.List;

import com.example.bean.Tag;

public interface TagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tag record);

    Tag selectByPrimaryKey(Integer id);

    List<Tag> selectAll();

    int updateByPrimaryKey(Tag record);
}