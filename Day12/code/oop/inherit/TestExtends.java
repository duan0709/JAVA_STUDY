package com.duan.day08.oop.inherit;

public class TestExtends {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "��ʿ��";
		dog1.age = 2;
		dog1.sex = "��";
		dog1.furColor = "�Ұ�ɫ";
		
		Bird bird1 = new Bird();
		bird1.breed = "��ȸ";
		bird1.age = 1;
		bird1.sex = "��";
		bird1.furColor = "��ɫ";
	}
}

//����
class Animal{
	String breed;
	String sex;
	int age;
	
	public void eat() {
		
	}
	public void sleep() {
		
	}
}

//����
class Dog extends Animal{
	String furColor;
	public void run() {
		
	}
}
//����
class Fish extends Animal{
	public void swim() {
		
	}
}
//����
class Bird extends Animal{
	String furColor;
	public void fly() {
		
	}
}
//����
class Snake extends Animal{
	public void climb() {
		
	}
}