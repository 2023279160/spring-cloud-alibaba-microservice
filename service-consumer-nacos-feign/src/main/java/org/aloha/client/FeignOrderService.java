package org.aloha.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther lfy
 * @date 21:53
 * @description
 */
@FeignClient("nacos-service-order")
public interface FeignOrderService {
    @GetMapping("/order/{id}")
    String order(@PathVariable("id") String id);
}
