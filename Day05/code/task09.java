package com.duan.day03;

import java.util.Scanner;

public class task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for ѭ��������һ��С��10 ������n��������Ľ׳�n
		System.out.println("������һ��������");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int n = 1;
		for (int i = 1; i <= num; i++) {
			n *= i;
		}
		System.out.println(num+"�Ľ׳��ǣ�"+n);
	}
}
