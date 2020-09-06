package com.lj.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author: cfeng
 * @date: 2020/9/6
 * @description:
 */
@SpringBootApplication
@ImportResource({"classpath:spring-dubbo.xml"})
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
        System.out.println("消费端启动成功！！！");
    }
}
