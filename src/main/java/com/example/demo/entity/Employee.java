package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id	//Primary key of the employee table
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name="employee_id", nullable= false)
	private String employeeId;
	
	@NotBlank
	@Column(name="first_name", nullable= false)
	private String firstName;
	
	@NotBlank
	@Column(name="last_name", nullable= false)
	private String lastName;
	
	@NotBlank
	@Column(name="address", nullable= false)
	private String address;
	
	@NotBlank
	@Size(min = 10, max= 10, message="Enter valid mobile number with 10 digits")
	@Column(name="phone", nullable= false)
	private String phone;
	
	@Email
	@NotBlank
	@Column(name="email", nullable= false)
	private String email;

	public Long getId() {
		return id;
	}	
	public Employee() {
		
	}
	
	public Employee(String employeeId, String firstName, String lastName, String address, String phone,
			String email) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
