package kh.java.inherit.product.after.model.vo;

import java.util.Date;

public class SmartPhone extends Computer {

	//field
	private String carrier;//통신사
	
	//기본생성자
	public SmartPhone(){
		
	} 
	//파라미터 생성자
	public SmartPhone(String brand, 
			String productCode,
			String productName, 
			int price, 
			Date makeDate,
			String os,
			String carrier) {
		//부모생성자 호출
		super(brand,productCode,productName,price,makeDate,os);
		
		this.carrier = carrier;
	}
	
	//getter & setter
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	//출력메서드
	public void printInfo() {
		String info = ", "
					+ carrier;
		//부모로부터 상속받은 메서드 호출
		getComputerInfo();
		System.out.println(info);
	}
}
