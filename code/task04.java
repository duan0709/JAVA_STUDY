package com.duan.day04;

import java.util.Scanner;

public class task04 {

	public static void main(String[] args) {
		//дһ������������һ����������n�����n��HelloWorld��
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����");
		int n = input.nextInt();
		output(n);
	}
	public static void output(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("HelloWorld");
		}
	}
}
