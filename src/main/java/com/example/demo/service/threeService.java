package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.dto.dtoClass;

public interface threeService {
    String inputData(dtoClass data);
    List<dtoClass> getTitles();
    List<Map<String, Object>> getDatas(String title);
}
