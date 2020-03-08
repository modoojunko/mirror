package com.ittools.mirror;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.ittools.mirror.mapper")
public class MirrorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MirrorApplication.class, args);
    }

}
