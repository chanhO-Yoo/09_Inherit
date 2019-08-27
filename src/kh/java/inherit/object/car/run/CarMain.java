package kh.java.inherit.object.car.run;

import kh.java.inherit.object.car.model.vo.Car;

public class CarMain {
	public static void main(String[] args) {
		Car c1 = new Car("소나타", "검정", 2000);
		System.out.println(c1.hashCode());
		
		//equals & hashCode
		Car c2 = new Car("소나타", "검정", 2000);
		System.out.println(c2.hashCode());
		
		//객체 주소값 비교
		System.out.println(c1 == c2);
		//equals
		System.out.println(c1.equals(c2)); //위의 코드와 동일한 연산 처리
		
		//clone() 메서드
		Car c3 = c1.clone();
		System.out.println(c3);
		System.out.println(c3.hashCode());
	}
}
