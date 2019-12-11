package com.mindtree.Campsumind.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy;

@Entity
@Table(name="CampusMinds")
public class CampusMind {
	
	@Id
	@Column(name="mid")
	private String mid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="city")
	private String city;
	
	@OneToOne
	Laptop laptop;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "CampusMind [mid=" + mid + ", name=" + name + ", city=" + city + ", laptop=" + laptop + "]";
	}

	public CampusMind(String mid, String name, String city, Laptop laptop) {
		super();
		this.mid = mid;
		this.name = name;
		this.city = city;
		this.laptop = laptop;
	}

	public CampusMind() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
