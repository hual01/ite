package com.xxx.yyy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xxx.yyy.common.IteResponse;
import com.xxx.yyy.domain.Employee;
import com.xxx.yyy.service.IIteService;

import io.swagger.annotations.ApiOperation;

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
	
	@PostMapping("/addEmp")
	@ApiOperation(value = "新增员工")
	public IteResponse addEmp(@RequestBody Employee employee) {
		try {
			int add=iteService.addEmp(employee);
			return IteResponse.ok(add);
		} catch (Exception e) {
			return IteResponse.error(e.getMessage());
		}
	}
	@PostMapping("/batchAdddingEmp")
	@ApiOperation(value = "批量新增员工")
	public IteResponse batchAdddingEmp(@RequestBody List<Employee> list) {
		try {
			boolean add=iteService.saveBatch(list);
			return IteResponse.ok(add);
		} catch (Exception e) {
			return IteResponse.error(e.getMessage());
		}
	}
	@DeleteMapping("/deleteEmpById")
	@ApiOperation(value = "根据ID删除员工")
	public IteResponse deleteEmpById(@RequestParam String id) {
		try {
			int delete=iteService.deleteEmpById(id);
			return IteResponse.ok(delete);
		} catch (Exception e) {
			return IteResponse.error(e.getMessage());
		}
	}
	@PutMapping("/updateEmp")
	@ApiOperation(value = "更新员工")
	public IteResponse updateEmp(@RequestBody Employee employee) {
		try {
			int add=iteService.updateEmp(employee);
			return IteResponse.ok(add);
		} catch (Exception e) {
			return IteResponse.error(e.getMessage());
		}
	}
	
}
