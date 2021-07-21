package com.duan.day06;

import java.util.Scanner;

public class task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//自定义一个整数数组a，读入一个整数n，如果n在数组中存在，则输出n的下标；如果不存在，输出-1。
		int [] a = {1,2,3,4,5};
		Scanner input = new Scanner(System.in);
		System.out.println("int [] a = {1,2,3,4,5};");
		System.out.println("请输入一个整数");
		int n = input.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				System.out.println("输入的数存在，下标是："+i);
				break;
			}else {
				System.out.println("-1");
				break;
			}
		}
	}

}
