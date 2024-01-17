package com.ems.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {
   @Id
   private int employeeId;
   private String employeeFirstName;
   private String employeeLastName;
   private String employeeRole;
   private String employeeLogId;
   private String employeePwd;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeFirstName, String employeeLastName, String employeeRole,
			String employeeLogId, String employeePwd) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeRole = employeeRole;
		this.employeeLogId = employeeLogId;
		this.employeePwd = employeePwd;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	public String getEmployeeLogId() {
		return employeeLogId;
	}
	public void setEmployeeLogId(String employeeLogId) {
		this.employeeLogId = employeeLogId;
	}
	public String getEmployeePwd() {
		return employeePwd;
	}
	public void setEmployeePwd(String employeePwd) {
		this.employeePwd = employeePwd;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName + ", employeeLastName="
				+ employeeLastName + ", employeeRole=" + employeeRole + ", employeeLogId=" + employeeLogId
				+ ", employeePwd=" + employeePwd + "]";
	}
  
}
