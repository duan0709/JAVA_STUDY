package com.duan.day04;

import java.util.Scanner;

public class task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//дһ������������һ���������������������������ӡ�
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int num = input.nextInt();
		isYinzi(num);
	}
	public static void isYinzi(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
