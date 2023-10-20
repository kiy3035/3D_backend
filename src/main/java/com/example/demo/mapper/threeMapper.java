package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.dtoClass;

@Mapper
public interface threeMapper {
    void insertDtl(dtoClass data);
    void insertMst(dtoClass data);
    List<dtoClass> selectTitles();
    List<Map<String, Object>> selectDatas(String title);

}