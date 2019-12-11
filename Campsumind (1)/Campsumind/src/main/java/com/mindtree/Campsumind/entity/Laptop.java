package com.mindtree.Campsumind.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Laptop")
public class Laptop {

	@Id
	@Column(name = "laptopId")
	private int laptopId;


	@Column(name = "brand")
	private String brand;

	@Column(name = "price")
	private double price;

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", brand=" + brand + ", price=" + price + "]";
	}

	public Laptop(int laptopId, String brand, double price) {
		super();
		this.laptopId = laptopId;
		this.brand = brand;
		this.price = price;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
