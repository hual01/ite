package com.xxx.yyy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xxx.yyy.common.IteResponse;
import com.xxx.yyy.domain.Employee;
import com.xxx.yyy.service.IIteService;

@RestController
@RequestMapping("/ite")
public class IteController {

	@Autowired
	IIteService iteService;
	
	/**
	 * 分页查询员工信息
	 * @param currentPage,当前页，默认1
	 * @param pageSize,每页条数，默认10
	 * @param employee,增加条件查询employee
	 * @return ResponseBean,自定义返回类。
	 */
	@GetMapping("/getEmpByPage")
	public IteResponse getEmpByPage(@RequestParam(defaultValue = "1") Integer currentPage,
			@RequestParam(defaultValue = "10") Integer pageSize,Employee employee) {
		try {
			IPage<Employee> iPage=iteService.getEmpByPage(currentPage,pageSize,employee);
			return IteResponse.ok(iPage);
		} catch (Exception e) {
			return IteResponse.error(e.getMessage());
		}
	}
}
