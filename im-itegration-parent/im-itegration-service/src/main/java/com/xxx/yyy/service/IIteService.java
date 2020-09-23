package com.xxx.yyy.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.yyy.common.MyException;
import com.xxx.yyy.domain.Employee;
/**
 * IService有批量操作的方法，可以在Controller里面调用，但BaseMapper没有。
 * @author fexia
 *
 */
public interface IIteService  extends IService<Employee>{

	IPage<Employee> getEmpByPage(Integer currentPage, Integer pageSize, Employee employee);

	int addEmp(Employee employee) throws MyException;

	int deleteEmpById(String id);

	int updateEmp(Employee employee);


}
