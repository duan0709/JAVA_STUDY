package com.duan.day08.oop.demo;

public class Car {
	//属性
	String brand;
	String color;
	double price;
	
	//构造方法
	public Car() {
		
	}
	
	
	public Car(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}


	//方法
	public void run() {
		System.out.println(brand+"品牌，"+color+"颜色的汽车");
	}
	
	public void show() {
		System.out.println(brand+"\t"+this.color+"\t"+price);
	}
}
