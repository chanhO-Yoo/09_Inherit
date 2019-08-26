package kh.java.inherit.product.before.model.vo;

import java.util.Date;

public class SmartPhone {
		private String brand;
		private String productCode;
		private String productName;
		private int price;
		private Date makeDate;
		
		private String os;

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
			this.brand = brand;
			this.productCode = productCode;
			this.productName = productName;
			this.price = price;
			this.makeDate = makeDate;
			this.os = os;
			this.carrier = carrier;
		}
		
		//getter & setter
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getProductCode() {
			return productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public Date getMakeDate() {
			return makeDate;
		}
		public void setMakeDate(Date makeDate) {
			this.makeDate = makeDate;
		}
		public String getOs() {
			return os;
		}
		public void setOs(String os) {
			this.os = os;
		}
		public String getCarrier() {
			return carrier;
		}
		public void setCarrier(String carrier) {
			this.carrier = carrier;
		}

		//출력메서드
		public void printInfo() {
			String info = brand+", "
						+ productCode+", "
						+ productName+", "
						+ price+", "
						+ makeDate+", "
						+ os+", "
						+ carrier;
			System.out.println(info);
		}
}
