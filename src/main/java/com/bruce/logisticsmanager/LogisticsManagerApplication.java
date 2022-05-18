package com.bruce.logisticsmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bruce.logisticsmanager.module.*.mapper")
public class LogisticsManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisticsManagerApplication.class, args);
    }

}
