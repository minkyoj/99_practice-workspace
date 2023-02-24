package com.kh.water.model.vo;

public class Water {
	private String waterNo;
	private String brand;
	private String price;
	
	public Water(){}

	public Water(String waterNo, String brand, String price) {
		super();
		this.waterNo = waterNo;
		this.brand = brand;
		this.price = price;
	}

	
	public String getWaterNo() {
		return waterNo;
	}

	public void setWaterNo(String waterNo) {
		this.waterNo = waterNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Water [waterNo=" + waterNo + ", brand=" + brand + ", price=" + price + "]";
	}

	
	
	
	
}
