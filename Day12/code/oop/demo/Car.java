package com.duan.day08.oop.demo;

public class Car {
	//����
	String brand;
	String color;
	double price;
	
	//���췽��
	public Car() {
		
	}
	
	
	public Car(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}


	//����
	public void run() {
		System.out.println(brand+"Ʒ�ƣ�"+color+"��ɫ������");
	}
	
	public void show() {
		System.out.println(brand+"\t"+this.color+"\t"+price);
	}
}
