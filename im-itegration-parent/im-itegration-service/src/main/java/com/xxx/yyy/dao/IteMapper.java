package com.xxx.yyy.dao;

import org.apache.ibatis.annotations.SelectProvider;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xxx.yyy.common.EmployeeVo;
import com.xxx.yyy.dao.provider.IteProvider;
import com.xxx.yyy.domain.Employee;
/**
 * 因为主启动类上注解了@MapperScan，所以此处可以不注解@Mapper
 * @author fexia
 *
 */
public interface IteMapper extends BaseMapper<Employee>{
	/**
	 * 使用@SelectProvider注解，可以自写sql,不局限于mybatis-plus提供的方法
	 * @param currentPage
	 * @param pageSize
	 * @param employee
	 * @return
	 */
	@SelectProvider(type = IteProvider.class,method="getEmpByPage")
	IPage<Employee> getEmpByPage(Page<Employee> pageDomain, Employee employee);

}
