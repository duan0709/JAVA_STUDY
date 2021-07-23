package com.duan.day08.oop.inherit;

public class TestExtends {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "哈士奇";
		dog1.age = 2;
		dog1.sex = "公";
		dog1.furColor = "灰白色";
		
		Bird bird1 = new Bird();
		bird1.breed = "麻雀";
		bird1.age = 1;
		bird1.sex = "雄";
		bird1.furColor = "灰色";
	}
}

//父类
class Animal{
	String breed;
	String sex;
	int age;
	
	public void eat() {
		
	}
	public void sleep() {
		
	}
}

//子类
class Dog extends Animal{
	String furColor;
	public void run() {
		
	}
}
//子类
class Fish extends Animal{
	public void swim() {
		
	}
}
//子类
class Bird extends Animal{
	String furColor;
	public void fly() {
		
	}
}
//子类
class Snake extends Animal{
	public void climb() {
		
	}
}