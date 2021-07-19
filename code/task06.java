package com.duan.day04;

import java.util.Scanner;

public class task06 {

	public static void main(String[] args) {
		// 求一个三位数，该三位数等于其每位数字的阶乘之和。
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int n = input.nextInt();
		result(n);
	}
	public static void result(int n) {
		//计算个位十位百位
		int ge = n % 10;
		int shi = n / 10 % 10;
		int bai = n / 100;
		//计算阶乘
		int a=1,b=1,c=1;
		for (int i = 1; i <= ge; i++) {
			a*=i;
		}
		for (int i = 1; i <= shi; i++) {
			b*=i;
		}
		for (int i = 1; i <= bai; i++) {
			c*=i;
		}
		System.out.println(a+b+c);
	}
	
}
