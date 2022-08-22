package org.aloha.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther lfy
 * @date 17:28
 * @description
 */
@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/order/{id}")
    public String order(@PathVariable String id) {
        return "this is nacos order "+port+" :" + id;
    }
}
