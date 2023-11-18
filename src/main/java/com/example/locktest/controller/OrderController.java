package com.example.locktest.controller;

import com.example.locktest.service.OrderService;
import com.example.locktest.service.ProductService;
import jakarta.persistence.criteria.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;


    @GetMapping("/")
    @ResponseBody
    public String hi() throws Exception {

//        orderService.decreaseBySynchronized(1L);
        orderService.decreaseByPessimisticLock(1L);
//        orderService.decreaseByOptimisticLock(1L);
//        orderService.decreaseByLettuceLock(1L);
//        orderService.decreaseByRedissonLock(1L);

        return "decrease Product1";
    }
}
