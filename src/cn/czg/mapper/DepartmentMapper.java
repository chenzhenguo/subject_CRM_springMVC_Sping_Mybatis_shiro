package cn.czg.mapper;

import java.util.List;

import cn.czg.vo.Department;
import cn.czg.vo.Role;

public interface DepartmentMapper {

	public  Department findDepartmentByUserId(int id);//通过id查找角色
	public List<Department> list();
}
