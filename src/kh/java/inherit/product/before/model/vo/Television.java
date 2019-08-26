package kh.java.inherit.product.before.model.vo;

import java.util.Date;

public class Television {
		private String brand;
		private String productCode;
		private String productName;
		private int price;
		private Date makeDate;
		
		private String resolution;//해상도 fhd, uhd
		private int size;
		
		//기본생성자
		public Television(){
			
		}
		//파라미터 생성자
		public Television(String brand, 
						String productCode,
						String productName, 
						int price, 
						Date makeDate,
						String resolution,
						int size) {
			this.brand = brand;
			this.productCode = productCode;
			this.productName = productName;
			this.price = price;
			this.makeDate = makeDate;
			this.resolution = resolution;
			this.size = size;
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
		public String getResolution() {
			return resolution;
		}
		public void setResolution(String resolution) {
			this.resolution = resolution;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}

		//출력메서드
		public void printInfo() {
			String info = brand+", "
						+ productCode+", "
						+ productName+", "
						+ price+", "
						+ makeDate+", "
						+ resolution+", "
						+ size;
			System.out.println(info);
		}
}
