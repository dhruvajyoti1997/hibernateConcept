package com.hibernate.nativesql;


/* 
 * This code is related to native sql
 * 
 * */ 
public class Student {

	   private int studentId;
	    private String studentName;
	    private String address;
	    private int age;
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address
					+ ", age=" + age + "]";
		}
	    
	    
}
