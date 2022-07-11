package com.chenlf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 
 * @author ChenLF
 * @date 2022/07/11 18:53
 **/

@SpringBootApplication()
@MapperScan("com.chenlf.dao")
public class FakeBilibiliApp {
    public static void main(String[] args) {
        SpringApplication.run(FakeBilibiliApp.class,args);
    }
}
