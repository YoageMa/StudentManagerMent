package com.myt.mapper;

import com.myt.pojo.College;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CollegeMapper {
    //获得所有学院信息
    List<College> getAll();

    //通过ID获得学院
    int getIdByDname(@Param("dame") String dname);
}
