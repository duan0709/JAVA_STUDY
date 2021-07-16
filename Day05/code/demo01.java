package com.duan.day03;

import java.util.Scanner;

public class demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 根据不同输入名次显示不同奖励 第一名：奖励ipone 12 第二名：奖励 小米电视 第三名：奖励 自行车 否则：奖励 彩票
		 */
		// 2、创建Scanner
		Scanner input = new Scanner(System.in);
		// 3、接收数据
		System.out.println("请输入名次：");
		int num = input.nextInt();
		// 4、处理数据
		switch (num) {
		case 1:
			System.out.println("奖励ipone 12");
			break;
		case 2:
			System.out.println("奖励小米电视");
			break;
		case 3:
			System.out.println("奖励自行车");
			break;
		default:
			System.out.println("奖励ipone 12");
			break;// 尽量加上break;若不加，放case1前，这句永远执行
		}
		System.out.println("程序结束");
	}
}
