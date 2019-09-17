package com.arc.obj3;

public class CarInfo {
	
	
	//자동차의 모든 정보를 출력하는 메서드
	//메서드명은  carView
	
	public void carView(Car car) {
		System.out.println("================");
		System.out.println("Company : "+Car.company);
		System.out.println("Model : "+car.model);
		System.out.println("Color : "+car.color);
		System.out.println("Hp : "+car.hp);
	}
	
	
	
}
