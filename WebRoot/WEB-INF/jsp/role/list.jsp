<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <table width="80%" align="center">
    	<tr>
    		<td>编号</td>
    		<td>名称</td>
    	</tr>
    	<c:forEach items="${list }" var="bean">
    	<tr>
    		<td>${bean.id }</td>
    		<td>${bean.name }</td>
    		<td>
    			<shiro:hasPermission name="role:delete">
    				<a href="#">删除</a>
    			</shiro:hasPermission>
    			<shiro:hasPermission name="role:update">
    				<a href="#">修改</a>
    			</shiro:hasPermission>
    			
    		</td>
    	</tr>
    	</c:forEach>
    </table>
  </body>
</html>
