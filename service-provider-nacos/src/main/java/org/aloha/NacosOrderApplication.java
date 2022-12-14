package org.aloha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther lfy
 * @date 17:59
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderApplication.class, args);
    }
}
