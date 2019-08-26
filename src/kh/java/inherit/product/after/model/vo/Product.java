package kh.java.inherit.product.after.model.vo;

import java.util.Date;
/**
 * 상속이란 ?
 *   - 부모 클래스의 멤버(필드/메서드)를 
 *     자식클래스의 멤버처럼 사용하는 것 
 * 
 * 특징
 *  - 부모클래스의 필드/메서드는 
 *    자식클래스에서 선언없이 접근 가능
 *  - 모든 클래스는 Object클래스의 후손
 *    - Object클래스의 멤버를 어느 클래스에서든 사용가능
 *  - 부모클래스의 생성자, 초기화블럭은 상속 안됨.
 *  - 부모클래스의 private멤버는 상속은 되지만,
 *    직접 접근 불가능.
 */ 
public class Product {
	//field
	private String brand;
	private String productCode;
	private String productName;
	private int price;
	private Date makeDate;
	
	//constructor(생성자)
	public Product() {
		
	}
	
	public Product(String brand, String productCode, String productName, int price, Date makeDate) {
		this.brand = brand;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.makeDate = makeDate;
	}
	
	//getter & setter
	
	public String getBrand() {
		return brand;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public Date getMakeDate() {
		return makeDate;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setMakeDate(Date makeDate) {
		this.makeDate = makeDate;
	}
	
	public void getProductInfo() {
		String info = brand+", "
				+ productCode+", "
				+ productName+", "
				+ price+", "
				+ makeDate;
		System.out.print(info);
	}
	
}
