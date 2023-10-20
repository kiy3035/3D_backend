package com.example.demo.service;

import java.util.List;
import java.util.Map;

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

    public String inputData(dtoClass data) {
        
        try {
            System.out.println("1111111111111111");
            threeMapper.insertMst(data);
            threeMapper.insertDtl(data);
            System.out.println("2222222222222222");

            return null;
        } 
        catch (Exception e) {
            e.printStackTrace();
            // 오류 처리
            return "오류 발생";
        }
    }
    

    public List<dtoClass> getTitles() {
        return threeMapper.selectTitles();
    }    

    
    public List<Map<String, Object>> getDatas(String title) {
        return threeMapper.selectDatas(title);
    }    

}
