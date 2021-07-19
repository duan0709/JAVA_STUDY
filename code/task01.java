package com.duan.day04;

import java.util.Scanner;

public class task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//写一个函数add，接收两个整数作为参数，返回这两个整数的和。
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = input.nextInt();
		System.out.println("请再输入一个整数");
		int b = input.nextInt();
		add(a,b);
	}
	public static void add(int a,int b) {
		System.out.println("结果是"+(a + b));
	}
}
