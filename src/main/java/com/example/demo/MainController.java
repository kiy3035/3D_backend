package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.dtoClass;
import com.example.demo.service.threeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@CrossOrigin(origins = "http://localhost:9000") // 프론트엔드 포트
public class MainController {

    // @GetMapping("/api/data")
    // public String getData() {
    //     return "백엔드에서의 데이터";
    // }

    @Autowired
    private threeService threeService;

    @PostMapping("/api/data")
    public String receiveData(@RequestBody dtoClass data) { // RequestBody : HTTP 요청의 본문(body) 데이터를 Java 객체로 변환하는 데 사용
        System.out.println("데이타:" + data);
        String result = threeService.processData(data);
        return result;
        
    }
    
}
