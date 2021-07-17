package com.duan.day03;

import java.util.Scanner;

public class task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		switch 语句）读入一个整数或字符，代表季度，输出以下内容。
		第一季度：3－5月（春季）
		第二季度：6－8月（夏季）
		第三季度：9－11月（秋季）
		第四季度：12－2月（冬季）
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输⼊月份：");
		int month = scanner.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
		System.out.println("第一季度：3－5月（春季）");
		break;
		case 6:
		case 7:
		case 8:
		System.out.println("第二季度：6－8月（夏季）");
		break;
		case 9:
		case 10:
		case 11:
		System.out.println("第三季度：9－11⽉（秋季）");
		break;
		case 12:
		case 1:
		case 2:
		System.out.println("第四季度：12－2月（冬季）");
		break;
		default:
		System.out.println("输入错误！");
		break;
		}
	}

}
