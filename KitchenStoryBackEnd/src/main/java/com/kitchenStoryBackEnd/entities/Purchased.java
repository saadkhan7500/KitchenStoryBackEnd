package com.kitchenStoryBackEnd.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Purchased {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int productId;

	private String userEmail;
	
	private String status;

	public Purchased() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchased(int id, int productId, String userEmail, String status) {
		super();
		this.id = id;
		this.productId = productId;
		this.userEmail = userEmail;
		this.status = status;
	}

	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", productId=" + productId + ", userEmail=" + userEmail + "]";
	}

}
