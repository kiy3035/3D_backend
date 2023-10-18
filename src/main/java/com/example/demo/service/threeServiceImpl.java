package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.dtoClass;
import com.example.demo.mapper.threeMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class threeServiceImpl implements threeService {
    private final threeMapper threeMapper;

    @Autowired
    public threeServiceImpl(threeMapper threeMapper) {
        this.threeMapper = threeMapper;
    }

    public String processData(dtoClass data) {
        try {
            // threeMapper를 사용하여 데이터베이스에서 데이터 조회
            List<dtoClass> results = threeMapper.selectYourEntities();
            
            // ObjectMapper를 사용하여 DTO 객체를 JSON 문자열로 변환
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(results);
            // String json = objectMapper.writeValueAsString(data);

            // JSON 문자열을 반환
            return json;
        } catch (Exception e) {
            e.printStackTrace();
            // 오류 처리
            return "오류 발생";
        }
    }
}
