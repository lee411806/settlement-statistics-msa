package com.jaeyong.settlementstatisticsmsa.controller;

import com.jaeyong.settlementstatisticsmsa.entity.Top5Statistics;
import com.jaeyong.settlementstatisticsmsa.service.SimpleTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class SimpleTestController {

    private final SimpleTestService simpleTestService;

    @GetMapping("/test/simple/{staticType}")
    public ResponseEntity<List<Top5Statistics>> simpleTest(@PathVariable String staticType) {

        List<Top5Statistics> list = simpleTestService.simpleTest(staticType);

        return ResponseEntity.ok(list);

    }
}
