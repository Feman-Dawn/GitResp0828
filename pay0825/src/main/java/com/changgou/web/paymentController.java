package com.changgou.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 *
 * @author guoli
 * @data 2021-08-25 20:32
 */
@RestController
@RequestMapping("payMent")
class PaymentController {

    @GetMapping("/getCheckId/{id}")
    public String getCheckId(@PathVariable("id") String id) {
        return "hello check" + id;
    }
}
