package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="assignments")
public class Assignment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name="employee_id", nullable= false)
	private String employeeId;
	
	@NotBlank
	@Column(name="product_id", nullable= false)
	private String productId;
	
	@NotBlank
	@Column(name="issued_date", nullable= false)
	private String issuedDate;
	
	@Column(name="returned_date", nullable= true)
	private String returnedDate;

	public Assignment() {
		
	}

	public Assignment(String employeeId, String productId, String issuedDate, String returnedDate) {
		super();
		this.employeeId = employeeId;
		this.productId = productId;
		this.issuedDate = issuedDate;
		this.returnedDate = returnedDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(String returnedDate) {
		this.returnedDate = returnedDate;
	}	
	
}
