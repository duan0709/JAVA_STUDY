package com.duan.day03;

import java.util.Scanner;

public class demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ����");
		Scanner num1 = new Scanner(System.in);
		double a = num1.nextDouble();
		
		System.out.println("��������һ����");
		Scanner num2 = new Scanner(System.in);
		double b = num2.nextDouble();
		
		System.out.println("��ѡ��Ҫ���еļ��㣨+��-��*��/��");
		Scanner input = new Scanner(System.in);
		char Calculation = input.next().charAt(0);
		switch (Calculation) {
		case '+':
			System.out.println("����ǣ�"+(a+b));
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
