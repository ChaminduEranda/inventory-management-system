package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "product_id", nullable = false)
	private String productId;
	
	@NotBlank
	@Column(name = "product_name", nullable = false)
	private String productName;
	
	@NotBlank
	@Column(name = "product_type", nullable = false)
	private String productType;
	
	@NotBlank
	@Column(name = "status", nullable = false)
	private String status;

	public Product() {
		
	}

	public Product(String productId, String productName, String productType, String status) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
