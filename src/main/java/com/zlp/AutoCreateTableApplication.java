package com.zlp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AutoCreateTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoCreateTableApplication.class, args);
    }

}
