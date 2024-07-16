package com.emailApp;

public class Email {
 
	static int num =0;
	private int id = ++num;
	private String fName;
	private String lName;
	private String department;
	private String password;
	private String email;
	
	
	
	public Email() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Email [id=" + id + ", fName=" + fName + ", lName=" + lName + ", department=" + department
				+ ", password=" + password + ", email=" + email + "]";
	}
	
	
}
