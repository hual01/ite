package com.xxx.yyy.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
@ResponseBody
public class CommonExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public IteResponse excute(Exception e) {
		e.printStackTrace();
		//此处可以自定义多个异常
		if(e.getClass() == MyException.class){
			return IteResponse.error(e.getMessage());
		}
		
		return IteResponse.error("服务器内部错误");
		
	}
}
