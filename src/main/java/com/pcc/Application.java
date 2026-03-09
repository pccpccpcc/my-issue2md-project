package com.pcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 应用启动类
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 配置网络参数
        System.setProperty("java.net.preferIPv4Stack", "true");
        System.setProperty("java.net.preferIPv6Addresses", "false");
        System.setProperty("sun.net.inetaddr.ttl", "0");
        System.setProperty("networkaddress.cache.ttl", "0");
        System.setProperty("sun.net.client.defaultConnectTimeout", "15000");
        System.setProperty("sun.net.client.defaultReadTimeout", "45000");

        SpringApplication app = new SpringApplication(Application.class);
        app.setWebApplicationType(org.springframework.boot.WebApplicationType.NONE);
        app.run(args);
    }
}