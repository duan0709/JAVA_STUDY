package com.duan.day03;

import java.util.Scanner;

public class task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 循环）读入一个小于10 的整数n，输出它的阶乘n
		System.out.println("请输入一个整数：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int n = 1;
		for (int i = 1; i <= num; i++) {
			n *= i;
		}
		System.out.println(num+"的阶乘是："+n);
	}
}
