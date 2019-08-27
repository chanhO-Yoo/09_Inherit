package kh.java.inherit.object.car.model.vo;

public class Car {
	//field
	private String carName;
	private String carColor;
	private int engineCC;
	
	//constructor
	public Car() {
		super();
	}
	
	public Car(String carName, String carColor, int engineCC) {
		this.carName = carName;
		this.carColor = carColor;
		this.engineCC = engineCC;
	}
	//복사 생성자
	public Car(Car c) {
		this.carName = c.carName;
		this.carColor = c.carColor;
		this.engineCC = c.engineCC;
	}

	//getter & setter
	//getter method
	public String getCarName() {
		return carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public int getEngineCC() {
		return engineCC;
	}
	//setter method
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	
	//toString() 메서드 override
	@Override
	public String toString() {
		return carName+", "+carColor+", "+engineCC;
	}
	
	//equals() 메서드 override
	//객체간 필드값 비교연산을 하는 메서드
	@Override
	public boolean equals(Object obj) {
		Car other = (Car)obj;
		//필드 비교는 필드 타입에 맞게 비교연산 처리 할 것
		if(carName.equals(other.carName) 
		   && carColor.equals(other.carColor)
		   && engineCC == other.engineCC) {
			return true;
		}
		return false;
	}
	
	/*
	 * equals 메서드와 hashCode메서드는 반드시 함께 Override할 것.
	 * 
	 * -> equals 메서드의 실행결과가 true라면, 
	 *    각 객체의 hashCode값도 같아야 한다.
	 */
	@Override
	public int hashCode() {
		return (carName+carColor+engineCC).hashCode();
	}
	
	/*
	 * clone
	 * 
	 * protected native Object clone() throws CloneNotSupportedException;
	 *  
	 *  오버라이드
	 *   - 오버라이드 시 접근제한자는 부모메서드의 접근제한자보다 
	 *   넓은 접근제한자로 변경가능
	 *   - 예외의 수는 더 적게 가능
	 *   
	 *   - 공변반환타입(jdk 1.5이후 추가된 기능)
	 *     - 자손클래스로 리턴 타입은 변경가능하다.
	 */
	
	@Override
	public Car clone() {
		//복사 생성자
		return new Car(this);
	}
}
