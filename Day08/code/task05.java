package com.duan.day04;

import java.util.Scanner;

public abstract class task05 {

	public static void main(String[] args) {
		// 写一个函数，接收一个整数，输出这个整数是几位数。
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n = input.nextInt();
		isWhatWei(n);
		
	}
	public static void isWhatWei(int n) {
		int count = 0;
		do {
			count++;
			n = n / 10;
		} while (n != 0);
		System.out.println("这个整数是"+count+"位数");
	}
	
}
