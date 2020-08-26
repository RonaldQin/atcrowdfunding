package com.example.manager.dao;

import java.util.List;

import com.example.bean.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Message record);

    Message selectByPrimaryKey(Integer id);

    List<Message> selectAll();

    int updateByPrimaryKey(Message record);
}