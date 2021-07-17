package com.duan.day03;

import java.util.Scanner;

public class task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//（switch 语句）读入一个整数，如果是1~5 之间，则分别输出5个福娃的名字，否则输出“北京欢迎你”。
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("贝贝");
			break;
			
		case 2:
			System.out.println("晶晶");
			break;
			
		case 3:
			System.out.println("欢欢");
			break;
			
		case 4:
			System.out.println("莹莹");
			break;
			
		case 5:
			System.out.println("妮妮");
			break;
		default:
			System.out.println("北京欢迎你");
			break;
		}
	}

}
