package com.example.manager.dao;

import java.util.List;

import com.example.bean.Project;

public interface ProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Project record);

    Project selectByPrimaryKey(Integer id);

    List<Project> selectAll();

    int updateByPrimaryKey(Project record);
}