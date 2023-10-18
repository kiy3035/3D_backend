package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.dto.dtoClass;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class threeServiceImpl implements threeService {

    public String processData(dtoClass data) {
        try {
            // ObjectMapper를 사용하여 DTO 객체를 JSON 문자열로 변환
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(data);

            // JSON 문자열을 반환
            return json;
        } catch (Exception e) {
            e.printStackTrace();
            // 오류 처리
            return "오류 발생";
        }
    }
}
