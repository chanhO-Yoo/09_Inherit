package kh.java.inherit.product.after.model.vo;

import java.util.Date;

public class Television extends Product{
		
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
			super(brand, productCode, productName, price, makeDate);
			this.resolution = resolution;
			this.size = size;
		}
		
		//getter & setter
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
			String info = ", "
						+ resolution+", "
						+ size;
			getProductInfo();
			System.out.println(info);
		}
}
