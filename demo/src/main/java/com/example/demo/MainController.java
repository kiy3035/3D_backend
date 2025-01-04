package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.dtoClass;

import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@CrossOrigin(origins = "http://localhost:9000") // 프론트엔드 포트
public class MainController {

    // @GetMapping("/api/data")
    // public String getData() {
    //     return "백엔드에서의 데이터";
    // }

    @PostMapping("/api/data")
    public String receiveData(@RequestBody dtoClass data) {
        // data 객체를 사용하여 데이터 처리
        System.out.println(data);
        return "백엔드에서의 데이터: " + data.toString();
    }
    
}
