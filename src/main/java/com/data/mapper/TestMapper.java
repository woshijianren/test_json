package com.data.mapper;

import com.data.entity.ProjectEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {

    @Select("select json_str from json_test limit #{param1}")
    List<String> query(int size);

    @Select("select json_str from json_test limit #{param1}")
    List<ProjectEntity> queryEntityList(int size);
}
