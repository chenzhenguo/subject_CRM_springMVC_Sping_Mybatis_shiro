package cn.czg.service;

import java.util.List;

import cn.czg.vo.Department;


public interface DepartmentService {
	public List<Department> list();//获取权限列表
	public Department findDepartmentFromUserId(int id);

}
