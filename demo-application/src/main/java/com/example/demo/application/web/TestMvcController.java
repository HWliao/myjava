package com.example.demo.application.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HWliao
 */
@Api(value = "Demo Test",tags = "Demo Test Rest Api")
@Slf4j
@RestController
@RequestMapping("/demo/test")
public class TestMvcController {

    @ApiOperation("Say Hello")
    @GetMapping("/hello")
    public Object sayHello() {
        return "hello world!";
    }
}
