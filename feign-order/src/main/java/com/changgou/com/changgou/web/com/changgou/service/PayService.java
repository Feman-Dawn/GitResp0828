package com.changgou.com.changgou.web.com.changgou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 功能描述
 *
 * @author guoli
 * @data 2021-08-25 20:29
 */
@Service
@FeignClient(value = "payment-service", fallback = )
public interface PayService {

    /**
     *
     * @param id
     * @return
     */
    @GetMapping(value = "payMent/getCheckId/{id}")
    String getCheckId(@PathVariable("id") String id);

}
