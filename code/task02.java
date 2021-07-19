package com.duan.day04;

import java.util.Scanner;

public class task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//写一个函数，接收一个整数，输出这个整数的所有因子。
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = input.nextInt();
		isYinzi(num);
	}
	public static void isYinzi(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
