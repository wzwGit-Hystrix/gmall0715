package com.atguigu.gmall.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall.demo")
public class GmallOrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run (GmallOrderServiceApplication.class,args);
    }
}
