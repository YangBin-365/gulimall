package edu.xau.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 远程调用的步骤
 * 1. 引入openfeign
 * 2. 编写接口，告诉SpringCloud这个接口需要远程调用
 * 3. 开启远程调用功能
 *    @EnableFeignClients
 */
@EnableFeignClients(basePackages = "edu.xau.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }

}
