package com.lj.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * @author: cfeng
 * @date: 2020/9/6
 * @description:
 */
@SpringBootApplication
@ImportResource({"classpath:spring-dubbo.xml"})
@MapperScan("mapper")
public class ProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("服务端启动成功！！！");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}