package com.duan.day04;

import java.util.Scanner;

public abstract class task05 {

	public static void main(String[] args) {
		// дһ������������һ�������������������Ǽ�λ����
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int n = input.nextInt();
		isWhatWei(n);
		
	}
	public static void isWhatWei(int n) {
		int count = 0;
		do {
			count++;
			n = n / 10;
		} while (n != 0);
		System.out.println("���������"+count+"λ��");
	}
	
}
