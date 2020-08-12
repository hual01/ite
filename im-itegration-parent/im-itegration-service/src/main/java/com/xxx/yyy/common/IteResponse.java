package com.xxx.yyy.common;

public class IteResponse {
	private String status;//返回状态码
	private String msg;//执行成功或失败异常的信息
	private Object data;//返回数据
	
	//执行成功，返回结果放入data
	public static IteResponse ok(Object data) {
		return new IteResponse(ResultCode.SUCCESS_COD,ResultCode.SUCCESS_RESULT,data);
	}
	//执行失败，或抛出异常，放入msg
	public static IteResponse error( String msg) {
		return new IteResponse(ResultCode.ERROR_COD,ResultCode.ERROR_RESULT+msg,null);
	}
	//因为有了3个参数的构造方法，所以无参构造方法必须显示存在，才能实例化对象。
	public IteResponse() {
		super();
	}
	//3个参数的构造方法，方便自定义返回结果
	public IteResponse(String status, String msg, Object data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

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
