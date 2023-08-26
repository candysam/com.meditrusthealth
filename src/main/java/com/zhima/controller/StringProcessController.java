package com.zhima.controller;

import com.zhima.request.TestReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@Validated
public class StringProcessController {

    @PostMapping("/api/v1/test/submit")
    public void test(@RequestBody @Validated TestReq testReq) {
        log.info("testReq:{}", testReq);
    }
}
