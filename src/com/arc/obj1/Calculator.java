package com.arc.obj1;

public class Calculator {

	//메서드 오버로딩(overloading)
	//비슷한 일을 하는 똑같은 이름의 메서드를 여러 개 만드는 것.
	//new의 개념
	//성립조건 ; 메서드의 이름이 같고, 매개변수의 개수나 DataType의 구성이 달라야 함.
	//접근지정자나 리턴타입은 상관이 없음.
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void hap(int num1, float num2) {
		System.out.println(num1+num2);
	}
	
	public void hap(float num1, float num2) {
		System.out.println(num1+num2);
	}
	
	public void hap(float num1, double num2) {
		System.out.println(num1+num2);
	}
	
	public double hap(double num1, double num2) {
		System.out.println(num1+num2);
		return num1+num2;
	}
	
	
	
	
}
