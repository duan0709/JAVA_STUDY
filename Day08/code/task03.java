package com.duan.day04;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//дһ������������һ������n�����1+2+3+...+n �ĺ͡�
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int n = input.nextInt();
		add(n);
		System.out.println("1+2+3+...n��ֵ�ǣ�"+add(n));
	}
	public static int add(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
