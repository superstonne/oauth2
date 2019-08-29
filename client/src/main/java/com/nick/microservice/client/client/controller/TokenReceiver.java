package com.nick.microservice.client.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: 肖奈（贺金龙）
 * @create: 2019-08-28 17:42
 */
@Slf4j
@RestController
@RequestMapping("/client/token")
public class TokenReceiver {

    @GetMapping("/code")
    public void receiveToken(@RequestParam("code") String code) {
        log.info("收到授权码：{}", code);
    }
}
