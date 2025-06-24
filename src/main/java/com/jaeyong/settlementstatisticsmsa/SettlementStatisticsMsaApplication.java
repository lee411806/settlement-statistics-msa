package com.jaeyong.settlementstatisticsmsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SettlementStatisticsMsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SettlementStatisticsMsaApplication.class, args);
    }

}
