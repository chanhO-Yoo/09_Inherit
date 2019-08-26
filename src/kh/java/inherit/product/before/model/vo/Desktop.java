package kh.java.inherit.product.before.model.vo;

import java.util.Date;

public class Desktop {
		private String brand;
		private String productCode;
		private String productName;
		private int price;
		private Date makeDate;
		
		private String os;

		private String monitor;
		private String keyboard;
		private String mouse; 
		
		//기본생성자
		public Desktop(){
			
		}
		//파라미터 생성자
		public Desktop(String brand, 
						String productCode,
						String productName, 
						int price, 
						Date makeDate,
						String os,
						String monitor,
						String keyboard,
						String mouse) {
			this.brand = brand;
			this.productCode = productCode;
			this.productName = productName;
			this.price = price;
			this.makeDate = makeDate;
			this.os = os;
			this.monitor = monitor;
			this.keyboard = keyboard;
			this.mouse = mouse;
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
		public String getMonitor() {
			return monitor;
		}
		public void setMonitor(String monitor) {
			this.monitor = monitor;
		}
		public String getKeyboard() {
			return keyboard;
		}
		public void setKeyboard(String keyboard) {
			this.keyboard = keyboard;
		}
		public String getMouse() {
			return mouse;
		}
		public void setMouse(String mouse) {
			this.mouse = mouse;
		}
		//출력메서드
		public void printInfo() {
			String info = brand+", "
						+ productCode+", "
						+ productName+", "
						+ price+", "
						+ makeDate+", "
						+ os+", "
						+ monitor+", "
						+ keyboard+", "
						+ mouse;
			System.out.println(info);
		}
}
