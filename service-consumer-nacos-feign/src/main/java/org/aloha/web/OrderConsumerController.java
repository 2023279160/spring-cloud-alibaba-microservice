package org.aloha.web;

import org.aloha.client.FeignOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther lfy
 * @date 17:39
 * @description
 */
@RestController
@RequestMapping("/feign/consumer")
public class OrderConsumerController {

    @Autowired
    private FeignOrderService feignOrderService;

    @GetMapping("/order/{id}")
    public String order(@PathVariable String id) {
        String consumerhandler = "this is feign nacos consumer revoke:" + id;
        return this.feignOrderService.order(consumerhandler);
    }
}
