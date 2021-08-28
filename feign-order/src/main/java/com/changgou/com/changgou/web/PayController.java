package com.changgou.com.changgou.web;

import com.changgou.com.changgou.web.com.changgou.service.PayService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @author guoli
 * @data 2021-08-25 20:24
 */
@RestController
@RequestMapping("hello")
public class PayController {
    @Resource
    PayService payService;
    @RequestMapping("getId")
    public String getId() {
        return payService.getCheckId("12231231");
    }
}
