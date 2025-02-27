package com.example.sb2.controller;

import com.example.sb2.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
@ControllerAdvice
public class MyExceptionHandler {

 /*   @ResponseBody
    @ExceptionHandler
    public Map<String,Object> handleException(Exception e){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("code","user.notexist");
        map.put("message",e.getMessage());
        return map;
    }*/


    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e,HttpServletRequest request){
        Map<String,Object> map = new HashMap<String, Object>();
        //传入我们自己的错误状态码 4xx 5xx
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user.notexist");
        map.put("message","用户出错啦");

        request.setAttribute("ext",map);
        return "forward:/error";
    }
}
