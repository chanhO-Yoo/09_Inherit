package kh.java.inherit.product.after.model.vo;

import java.util.Date;

public class Computer extends Product{
	//field
	private String os;
	
	//constructor
	public Computer() {
		
	}
	public Computer(String brand, String productCode, String productName, int price, Date makeDate, String os) {
		super(brand, productCode, productName, price, makeDate);
		this.os = os;
	}
	 
	//getter & setter
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	//출력메서드
	public void getComputerInfo() {
		getProductInfo();
		System.out.print(", "+os);
	}
	
}
