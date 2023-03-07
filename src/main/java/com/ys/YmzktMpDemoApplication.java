package com.ys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ys.mapper")
public class YmzktMpDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(YmzktMpDemoApplication.class, args);
    }

}
