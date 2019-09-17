package com.arc.obj3;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CarInfo carInfo = new CarInfo();
		Car car = new Car(); //여기서 1 번 끝남.
		Car car2 = new Car("Red");
		Car car3 = new Car("Blue", 3000);
		Car car4 = new Car("Yellow", 5000, "K3");
		
		//car.Car -> 호출 불가. 1번만 가능
		
		Car.company="Samsung";
		
		
		carInfo.carView(car);
		carInfo.carView(car2);
		carInfo.carView(car3);
		carInfo.carView(car4);
	}
}
