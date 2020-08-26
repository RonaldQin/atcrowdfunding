package com.example.manager.dao;

import java.util.List;

import com.example.bean.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    Order selectByPrimaryKey(Integer id);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}