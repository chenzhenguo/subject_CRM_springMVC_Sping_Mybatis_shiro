package cn.czg.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Permission implements Comparable<Permission>,Serializable{
	private Integer id;
	private String name;
	private int pid;
	private String type;
	private String url;
	private String percode;
	private String pids;
	private int sort;
	private List<Permission> children=new ArrayList<Permission>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPercode() {
		return percode;
	}
	public void setPercode(String percode) {
		this.percode = percode;
	}
	public String getPids() {
		return pids;
	}
	public void setPids(String pids) {
		this.pids = pids;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public List<Permission> getChildren() {
		return children;
	}
	public void setChildren(List<Permission> children) {
		this.children = children;
	}
	@Override
	public int compareTo(Permission o) {
		// TODO Auto-generated method stub
		return this.sort-o.getSort();
	}
	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + ", pid=" + pid
				+ ", type=" + type + ", url=" + url + ", percode=" + percode
				+ ", pids=" + pids + ", sort=" + sort + ", children="
				+ children + "]";
	}
	
	
	
}
