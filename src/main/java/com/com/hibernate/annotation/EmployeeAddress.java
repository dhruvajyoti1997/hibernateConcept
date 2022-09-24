package com.com.hibernate.annotation;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
/*
 * @Embeddable is used to create a single table
 * */
//@Embeddable
public class EmployeeAddress {

	private String permanentaddress;
	private String currentaddress;
	public String getPermanentaddress() {
		return permanentaddress;
	}
	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}
	public String getCurrentaddress() {
		return currentaddress;
	}
	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}
//	public EmployeeAddress(String permanentaddress, String currentaddress) {
//		super();
//		this.permanentaddress = permanentaddress;
//		this.currentaddress = currentaddress;
//	}
	@Override
	public String toString() {
		return "EmployeeAddress [permanentaddress=" + permanentaddress + ", currentaddress=" + currentaddress + "]";
	}
}
