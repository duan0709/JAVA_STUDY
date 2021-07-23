package com.duan.day08.oop.inherit;

public class TestExtends2 {
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "宝马";
		car.price = 300000;
		car.speed = 120;
		System.out.println("这是一辆"+car.brand+"品牌的汽车，正以"+car.speed+"km/s的速度行驶");
		
		Bus bus = new Bus();
		bus.seatNum = 8;
		bus.price = 1000000;
		bus.speed = 80;
		System.out.println("这是一辆"+bus.seatNum+"座的公交车，正以"+bus.speed+"km/s的速度行驶");
		
	}
}
//父类 交通工具类
class Vehicle{
	double price;
	int speed;
	public void run() {
		System.out.println("行驶中...");
	}
}
//子类
class Car extends Vehicle{
	String brand;//品牌
}
//子类
class Bus extends Vehicle{
	int seatNum;//座位数
}
//子类
class Bicycle extends Vehicle{
	String color;
}