package com.duan.day08.oop.demo;

import java.util.Scanner;

public class TestCar {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Car c1 = new Car("大众","黑",100000);
		c1.run();
		c1.show();
		
		Car c2 = new Car("保时捷","白",5000000);
		c2.run();
		c2.show();
		
		System.out.println("==============================");
		//创建汽车数组，保存多个汽车，遍历汽车数组
		/*
		Car[] cars;
		cars = new Car[2];
		cars[0] = c1;
		cars[1] = c2;
		*/
		//键盘录入
		System.out.println("请输入仓库车位数量");
		int n = input.nextInt();
		Car[] cars= new Car[n];
		//循环录入
		for (int i = 0; i < cars.length; i++) {
			//两种方式
			//第一种方式
			Car car = new Car();
			System.out.println("请输入"+(i+1)+"号车库"+"汽车的品牌：");
			car.brand = input.next();
			//第二种方式
			//String brand = input.next();
			System.out.println("请输入"+(i+1)+"号车库"+"汽车的颜色：");
			car.color = input.next();
			//String color = input.next();
			System.out.println("请输入"+(i+1)+"号车库"+"汽车的价格：");
			car.price = input.nextDouble();
			//double price = input.nextDouble();
			
			//Car car = new Car(brand,color,price);
			//入库
			cars[i] = car;
		}
		
		//遍历
		for (Car car : cars) {
			car.run();
		}
	}
}
