package com.duan.day04;

import java.util.Scanner;

public class task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//дһ������add����������������Ϊ���������������������ĺ͡�
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int a = input.nextInt();
		System.out.println("��������һ������");
		int b = input.nextInt();
		add(a,b);
	}
	public static void add(int a,int b) {
		System.out.println("�����"+(a + b));
	}
}
