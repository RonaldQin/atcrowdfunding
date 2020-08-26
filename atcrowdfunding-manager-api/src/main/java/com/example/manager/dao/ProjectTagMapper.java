package com.example.manager.dao;

import java.util.List;

import com.example.bean.ProjectTag;

public interface ProjectTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectTag record);

    ProjectTag selectByPrimaryKey(Integer id);

    List<ProjectTag> selectAll();

    int updateByPrimaryKey(ProjectTag record);
}