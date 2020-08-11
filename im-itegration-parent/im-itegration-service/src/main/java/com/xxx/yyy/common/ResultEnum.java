package com.xxx.yyy.common;
/**
 * 枚举类，用于返回
 * @author fexia
 *
 */
public enum ResultEnum {
	SUCCESS("0000","success"),
	ERROR("0000","error");
	private String code;
	private String result;
	private ResultEnum(String code, String result) {
		this.code = code;
		this.result = result;
	}
	
	
}
