package com.example.sb2.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

//给容器中加入我们自己定义的errorattributes
@Component
public class MyErrorAttributes extends DefaultErrorAttributes{
    //返回值的map是页面和json能获取的所有子弹
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String,Object> map =  super.getErrorAttributes(webRequest,includeStackTrace);
        map.put("company","atguigu");

        //我们的异常处理器携带的数据
        Map<String,Object> ext = (Map<String,Object>)webRequest.getAttribute("ext",0);
        map.put("ext",ext);
        return map;
    }
}
