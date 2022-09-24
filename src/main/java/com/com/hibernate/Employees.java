package com.com.hibernate;

public class Employees {

	private int empId;
	private String fullName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", fullName=" + fullName + "]";
	}
	
	
}
