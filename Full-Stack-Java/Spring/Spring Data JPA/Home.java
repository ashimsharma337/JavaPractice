package com.example.homebuyer.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HOME")
public class Home {
     
	@Id
	@Column(name="HOME_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String address;
	@Column
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Home [id=" + id + ", address=" + address + ", price=" + price + "]";
	}
	public Home() {
		super();
	}
	public Home(String address, int price) {
		super();
		this.address = address;
		this.price = price;
	}
}
