package com.bee.study;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
    }

    @RequestMapping("testaa")
    public String test(){
        return "aa";
    }
}
