package com.duan.day05;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 给定一个整数数组，读入一个整数n，如果n在数组中存在，输出下标，不存在则输出-1
		 */
		//1、给定一个整数数组
		int[] nums = {12,33,56,44};
		//2、读入一个整数n
		System.out.println("请输入一个整数");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		//3、遍历数组查找n值是否存在
		int i = 0;
		for (; i < nums.length; i++) {
			if (num == nums[i]) {
				System.out.println("下标是："+i);
				break;
			}
		}
		if (i ==nums.length) {
			System.out.println("下标是-1");
		}
	}

}
