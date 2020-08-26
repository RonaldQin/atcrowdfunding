package com.example.manager.dao;

import java.util.List;
import java.util.Map;

import com.example.bean.Advertisement;
import com.example.bean.User;

public interface AdvertisementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Advertisement record);

    Advertisement selectByPrimaryKey(Integer id);

    List<Advertisement> selectAll();

    int updateByPrimaryKey(Advertisement record);

    List<User> pageQuery(Map paramMap);

    Integer queryCount(Map paramMap);
}