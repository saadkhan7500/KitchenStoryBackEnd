package com.kitchenStoryBackEnd.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	
	private String kcal;
	
	
	private String category;
	
	
	private String price;
	
	
	private String quantity;

	
	private int discount;
	private String status;
	private String imgname;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, String kcal, String category, String price, String quantity,
			int discount, String status, String imgname) {
		super();
		this.id = id;
		this.name = name;
		this.kcal = kcal;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
		this.status = status;
		this.imgname = imgname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKcal() {
		return kcal;
	}
	public void setKcal(String kcal) {
		this.kcal = kcal;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", kcal=" + kcal + ", category=" + category + ", price="
				+ price + ", quantity=" + quantity + ",  discount=" + discount + ", status=" + status
				+ ", imgname=" + imgname + "]";
	}
	
	
	
	
}
