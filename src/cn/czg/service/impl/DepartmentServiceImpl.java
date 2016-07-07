package cn.czg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.czg.mapper.DepartmentMapper;
import cn.czg.mapper.RoleMapper;
import cn.czg.service.DepartmentService;
import cn.czg.service.RoleService;
import cn.czg.vo.Department;
import cn.czg.vo.Role;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentMapper departmentMapper ;
	
	@Override
	public List<Department> list() {
	
		return departmentMapper.list();
	}

	@Override
	public Department findDepartmentFromUserId(int id) {
		
		return departmentMapper.findDepartmentByUserId(id);
	}

	
	
}
