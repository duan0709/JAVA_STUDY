package com.duan.day05;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//控制台输入5个城市的名称，使用数组保存，并遍历输出
		Scanner input = new Scanner(System.in);
		//1、定义数组
		String[] cities = new String[5];
		//2、控制台输入5个城市的名称存入数组
		for (int i = 0; i < cities.length; i++) {
			System.out.println("请输入城市名：");
			String city = input.next();
			//将城市存入数组
			cities[i] = city;
		}
		System.out.println("通过增强for循环遍历");
		for (String city : cities) {
			System.out.println(city+"\t");
		}
		System.out.println("\n程序结束");
	}

}
