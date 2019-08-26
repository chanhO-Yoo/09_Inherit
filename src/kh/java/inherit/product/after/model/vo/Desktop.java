package kh.java.inherit.product.after.model.vo;

import java.util.Date;

public class Desktop extends Computer {
	
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
			//부모생성자 호출 : 부모클래스의 생성자는 상속이 되지 않는다.
			//직접 super키워드를 통해 호출해야한다.
			super(brand,productCode,productName,price,makeDate,os);
			
			this.monitor = monitor;
			this.keyboard = keyboard;
			this.mouse = mouse;
		}
		
		//getter & setter
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
			String info = ", "
						+ monitor+", "
						+ keyboard+", "
						+ mouse;
			//부모에 선언된 메서드를 자기 메서드인 것처럼 사용 가능.
			getComputerInfo(); //void형
			System.out.println(info);
		}
		
		/**
		 * 상품이 가진 기본정보 출력
		 * brand,productCode,...
		 */
		public void printBasicInfo() {
			//private 멤버는 자식 클래스에서도 접근 불가
//			System.out.println(brand+", "+productCode);
			//public 멤버(메서드)를 통한 접근
			System.out.println(getBrand()+", "+getProductCode()+", "+getProductName());
			
			//Object클래스의 메서드
			System.out.println(getClass());
			System.out.println("Desktop : "+toString());
		}
}
