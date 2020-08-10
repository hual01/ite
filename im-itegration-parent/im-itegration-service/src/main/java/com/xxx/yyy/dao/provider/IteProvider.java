package com.xxx.yyy.dao.provider;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;

import com.xxx.yyy.domain.Employee;

public class IteProvider {
	/**
	 * provider接收domain，需要用<Map>来接收，domain相当于一个value，key是domain的首字母小写
	 * @param employee
	 * @return
	 */
	public String getEmpByPage(Map<String,Employee> map) {
		SQL sql = new SQL();
		Employee employee = map.get("employee");//此处employee是Map的key，用来获取传入参数
		sql.SELECT("e.*");
		sql.FROM("employee e","department d");//此处employee是表名
		sql.WHERE("e.deptId=d.deptId");
		//条件查询
		if(employee.getId()!=null) {
			sql.WHERE("e.id="+employee.getId()+"");//最后面+""是转换为String
		}
		if(StringUtils.isNoneBlank(employee.getName())) {
			sql.WHERE("e.name='"+employee.getName()+"'");//''符号是sql的语法，猜测不用也可以，如上一条getId的写法
		}
		return sql.toString();
	}
}
