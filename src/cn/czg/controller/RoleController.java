package cn.czg.controller;

import java.util.List;

import javax.enterprise.inject.Model;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.czg.service.RoleService;
import cn.czg.vo.Role;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	
	@RequestMapping("/list.do")
	@RequiresPermissions("role:list")//shiro会判断当前用户的的AuthorizationInfo   
	public String  list(ModelMap map) {
		map.addAttribute("list", roleService.list());
		return "role/list";
	}
	

}
