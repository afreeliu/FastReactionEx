package com.rem.exceptionhandler;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ZExceptionHandler {
 
    /**
     *  拦截Exception类的异常
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(Exception e){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("retcode", "500");
        result.put("retdesc", e.getMessage());
        //正常开发中，可创建一个统一响应实体，如CommonResp
        return result; 
    }
}