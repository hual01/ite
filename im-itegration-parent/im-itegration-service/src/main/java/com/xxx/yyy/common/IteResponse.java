package com.xxx.yyy.common;

public class IteResponse {
	private String status;//返回状态码
	private String msg;//执行成功或失败异常的信息
	private Object data;//返回数据
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
