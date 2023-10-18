package com.example.demo.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.dtoClass;

@Mapper
public interface threeMapper {
    List<dtoClass> selectYourEntities(); // 예제 메서드
}