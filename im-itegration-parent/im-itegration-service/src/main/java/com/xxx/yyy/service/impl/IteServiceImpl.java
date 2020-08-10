package com.xxx.yyy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.yyy.common.EmployeeVo;
import com.xxx.yyy.dao.IteMapper;
import com.xxx.yyy.domain.Employee;
import com.xxx.yyy.service.IIteService;
/**
 * 
 * IteServiceImpl要实现IService接口的方法，但如果它继承了ServiceImpl<BaseMapper<T>, T>，就不用了。
 * ServiceImpl是IService的实现类（ 泛型：M 是 mapper 对象，T 是实体 ， PK 是主键泛型 ）
 * @author fexia
 *
 */
@Service
public class IteServiceImpl extends ServiceImpl<IteMapper, Employee> implements IIteService{
	@Autowired
	IteMapper iteMapper;
	
	@Override
	public IPage<Employee> getEmpByPage(Integer currentPage, Integer pageSize, Employee employee) {
		// TODO Auto-generated method stub
		Page<Employee> pageDomain = new Page<>(currentPage,pageSize);
		return iteMapper.getEmpByPage(pageDomain,employee);
	}

}
