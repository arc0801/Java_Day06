package com.arc.obj1;

public class Member {

	int age; //회원의 나이
	String name; //회원의 이름
	
	//생성자 선언
	//디퐅트 생성자
	//기본 생성자
	//빈생성자
	public Member() {
		
		System.out.println("Member 객체 생성");
		this.age = 27;
		this.name = "arc";
		this.info(age);
		
	}
	
	
	public void info(int age) {
		//회원의 정보를 출력하는 메서드..
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this);
		//this : 자기자신의 객체 주소
		//내부에서 자동 생성되고 내부에서만 사용되는 참조변수
		//메서드 내에서만 사용가능
		//생략가능
		
		
		//메서드 내에서 다른 메서드 호출 가능
		
		
	}
	
	public void info2() {
		System.out.println("info2 Method");
		
		this.info(10);
		
		
		
	}
	
}
