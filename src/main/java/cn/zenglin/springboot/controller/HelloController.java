package cn.zenglin.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

//@ResponseBody//这个类的所有方法返回的数据直接写给浏览器（如果是对象转为json数据）
@Controller
//@RestController//包含以上两个注解
public class HelloController {

//    @RequestMapping({"/","/index.html"})
//    public String index(){
//        return "index";
//    }


    @RequestMapping("hello")
    public String hello(){
        return "hello world quick";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("name", Arrays.asList("张三","李四","王五"));
        return "success";
    }
}
