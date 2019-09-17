package com.arc.obj3;

public class Member {

	String name;
	int age;
	
	//public Member() {}  
	// -> default 생성자는 클래스 내에 생성자가 아무것도 존재하지 않을 때 
	//자동으로 컴파일러가 만들어주지만, 
	//하나라도 존재한다면 자동으로 만들어지지 않음.
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		
		
	}
	
}
