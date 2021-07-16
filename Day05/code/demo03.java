package com.duan.day03;

import java.util.Scanner;

public class demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个数");
		Scanner num1 = new Scanner(System.in);
		double a = num1.nextDouble();
		
		System.out.println("请再输入一个数");
		Scanner num2 = new Scanner(System.in);
		double b = num2.nextDouble();
		
		System.out.println("请选择要进行的计算（+、-、*、/）");
		Scanner input = new Scanner(System.in);
		char Calculation = input.next().charAt(0);
		switch (Calculation) {
		case '+':
			System.out.println("结果是："+(a+b));
			break;
		case '-':
			
			break;
		case '*':
			
			break;
		case '/':
			
			break;
			
		default:
			break;
		}
	}

}
