package com.com.hibernate.annotation;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
/*
 * entity is used to set the hibernate hbm.xml configuration to create entity
 * table we have mentioned here to create a table or update
 * @Id for the id field
 * @GeneratedValue(strategy = GenerationType.IDENTITY) for auto increment the id
 * @Column(name= "") for setting the database columns
 * */
@Entity
@Table(name= "tbl_employees")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Employees {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int empId;
	@Column(name= "fullname")
	private String fullName;
	@Embedded
	 EmployeeAddress empaddress; //reference type variable
	 
	 
	/*suppose we dont need any particular column we have to use
	 *  @Transiant in top of that variable
	*/
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
	
	public EmployeeAddress getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(EmployeeAddress empaddress) {
		this.empaddress = empaddress;
	}
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", fullName=" + fullName + ", empaddress=" + empaddress + "]";
	}
	
	
}
