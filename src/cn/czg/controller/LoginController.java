package cn.czg.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.czg.service.PermissionService;
import cn.czg.service.UserService;
import cn.czg.vo.User;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private PermissionService permissionService;

	
	// ������¼ҳ��
	@RequestMapping("/toLogin.do")
	public ModelAndView tologin() {
		return new ModelAndView("login");
	}
	
	//��֤����shiro�ӹܣ������½����ɽ���shiroLoginFailure�׳����쳣����������Ϣ������ǰ̨
	@RequestMapping("/login.do")
	public ModelAndView login(ModelMap map,HttpServletRequest req){
		String exceptionClassName=(String)req.getAttribute("shiroLoginFailure");
		if(exceptionClassName!=null){
			if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
				map.addAttribute("msg", "�û���������!!!");
			} else if (IncorrectCredentialsException.class.getName().equals(
					exceptionClassName)) {
				map.addAttribute("msg", "�û������������!!!");
			} else{
				map.addAttribute("msg", "��¼ʱ�����쳣��������!!!");
			}
		}
		return new ModelAndView("login");		
	}
	
	@RequestMapping("/index.do")
	public ModelAndView index(HttpSession session){
		Subject subject = SecurityUtils.getSubject();//��Security��ȡ��currentUSer
		User currentUser =(User) subject.getPrincipal();
		session.setAttribute("currentUser",currentUser);
		return new ModelAndView("index");
		
	}
	
	@RequestMapping("/refuse.do")
	public ModelAndView refuse(){
		return new ModelAndView("refuse");
	}
	
	
	
	
	

}
