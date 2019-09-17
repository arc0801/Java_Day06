package com.arc.obj2;

public class Computer {

	
	String cpu="amd";
	int ssd=512;
	
	public Computer() {
		this.cpu="i7";
		this.ssd=256;
	}
	
	public void info() {
		System.out.println("Cpu : "+ this.cpu);
		System.out.println("Ssd : "+ this.ssd);
	}
}
