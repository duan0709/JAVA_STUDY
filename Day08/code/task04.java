package com.duan.day04;

import java.util.Scanner;

public class task04 {

	public static void main(String[] args) {
		//写一个函数，接收一个整数参数n，输出n个HelloWorld。
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数");
		int n = input.nextInt();
		output(n);
	}
	public static void output(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("HelloWorld");
		}
	}
}
