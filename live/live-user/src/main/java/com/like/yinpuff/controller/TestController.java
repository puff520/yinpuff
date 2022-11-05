package com.like.yinpuff.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "test接口")
@RestController
@RequestMapping("/api/test")
public class TestController {


    @ApiOperation(value = "欢迎", httpMethod = "GET")
    @GetMapping(value = "/hello")
    public Object typeList() {
        return "ok" ;
    }

}
