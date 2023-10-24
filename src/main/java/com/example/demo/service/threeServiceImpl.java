package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.dtoClass;
import com.example.demo.mapper.threeMapper;

@Service
public class threeServiceImpl implements threeService {
    
    private final threeMapper threeMapper;
    
    @Autowired
    public threeServiceImpl(threeMapper threeMapper) {
        this.threeMapper = threeMapper;
    }

    public String inputData(List<dtoClass> dataList) {
        try {
            System.out.println("1111111111111111");
             // 첫 번째 데이터만을 대상으로 mst 호출
             if (!dataList.isEmpty()) {
                threeMapper.insertMst(dataList.get(0));
                // 모든 데이터에 대해 dtl 호출
                for (dtoClass data : dataList) {
                    // 각 data 객체를 MyBatis 매퍼로 전달
                    threeMapper.insertDtl(data); // 여기서 발생 
                }
            }
            
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
