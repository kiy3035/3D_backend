package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.dto.dtoClass;

@Service
public class threeServiceImpl implements threeService {

    @Override
    public String processData(dtoClass data) {
        // 여기에서 데이터 처리 논리를 구현
        // data 객체를 사용하여 원하는 로직을 수행

        System.out.println(data);

        return "백엔드에서의 데이터!!: " + data.toString();
    }
}
