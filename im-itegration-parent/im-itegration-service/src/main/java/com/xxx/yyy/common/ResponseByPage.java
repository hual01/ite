package com.xxx.yyy.common;

import java.util.List;
/**
 * 分页查询返回的类
 * @author fexia
 *
 */
public class ResponseByPage {
	
	private Long total;//数据条数
	private List<?> data;//返回值集合，注意这里List<?>的写法
	
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<?> getData() {
		return data;
	}
	public void setData(List<?> data) {
		this.data = data;
	}
	
}
