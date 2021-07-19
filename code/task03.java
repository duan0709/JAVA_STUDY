package com.duan.day04;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//写一个函数，接收一个整数n，输出1+2+3+...+n 的和。
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n = input.nextInt();
		add(n);
		System.out.println("1+2+3+...n的值是："+add(n));
	}
	public static int add(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
