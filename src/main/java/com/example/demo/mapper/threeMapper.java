package com.example.demo.mapper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.dtoClass;

@Mapper
public interface threeMapper {
    List<dtoClass> selectYourEntities(); // 예제 메서드

    // LinkedHashMap<String, Object> selectTest();


}