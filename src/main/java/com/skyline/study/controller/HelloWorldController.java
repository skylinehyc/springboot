package com.skyline.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author skyline
 */
@RestController // @RestController 的意思就是controller里面的方法都以json格式输出
public class HelloWorldController {

/**
 * @author skyline
 * @description 页面展示hello world
 * @date 17:53 2018/10/31
 * @return Sting
**/
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World1";
    }
}
