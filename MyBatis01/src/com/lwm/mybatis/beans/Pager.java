package com.lwm.mybatis.beans;

import java.util.List;

public class Pager {

	private int pageNo;
	private int pageTotal;
	private int rowsTotal;
	private int pageSize;
	private List<Object> list;
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageTotal() {
		return pageTotal;
	}
	public void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}
	public int getRowsTotal() {
		return rowsTotal;
	}
	public void setRowsTotal(int rowsTotal) {
		this.rowsTotal = rowsTotal;
		pageTotal = rowsTotal % pageSize == 0 ? rowsTotal / pageSize : rowsTotal / pageSize + 1;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	@Override
	public String toString(){
		return "Pager [pageNo=" + pageNo + ", pageTotal=" + pageTotal
		+ ", rowsTotal=" + rowsTotal + ", pageSize=" + pageSize
		+ ", list=" + list + "]";
	}
}
