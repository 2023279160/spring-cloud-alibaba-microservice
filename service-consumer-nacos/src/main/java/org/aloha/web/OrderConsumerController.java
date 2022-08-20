package org.aloha.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auther lfy
 * @date 17:39
 * @description
 */
@RestController
@RequestMapping("/consumer")
public class OrderConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/{id}")
    public String order(@PathVariable String id) {
        String consumerhandler = "this is nacos consumer revoke:" + id;
        return this.restTemplate.getForObject("http://nacos-service-order/order/" + consumerhandler, String.class);
    }
}
