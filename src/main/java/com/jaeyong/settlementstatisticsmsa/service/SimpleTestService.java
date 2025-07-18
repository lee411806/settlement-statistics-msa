package com.jaeyong.settlementstatisticsmsa.service;


import com.jaeyong.settlementstatisticsmsa.entity.Top5Statistics;
import com.jaeyong.settlementstatisticsmsa.repo.Top5StatisticsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SimpleTestService {

    private final Top5StatisticsRepository top5StatisticsRepository;

    public List<Top5Statistics> simpleTest(String staticType) {
        return top5StatisticsRepository.findByStaticType(staticType);
    }
}
