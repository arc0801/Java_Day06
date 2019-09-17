package com.arc.obj3;

public class Car {
	//제조사
	//모델명
	//색상
	//마력
	static String company="KIA";
	String model;
	String color;
	int hp;
	Wheel wheel;
	
	//디폴트 생성자 선언
	//제조사 : KIA
	//모델 : K7
	//색상 : Black
	//hp : 200
	//생성자 오버로딩
	public Car() {
		this("Black");
		this.color="B";
	}
	
	//같은 이름의 메서드를 여러 개 만드는 것
	public Car(String color) {
		this(color, 200);
	}
	
	//색상과 마력을 변경해서 만드는 생성자
	public Car(String color, int hp) {
		this(color, hp, "K7");
	}
	
	//색상, 마력, 모델명 변경 생성자
	public Car(String color, int hp, String model) {
		
		this.model = model;
		this.color = color;
		this.hp = hp;
		this.wheel = new Wheel();
	}
	
	
	
}
