package com.duan.day04;

import java.util.Scanner;

public class task06 {

	public static void main(String[] args) {
		// ��һ����λ��������λ��������ÿλ���ֵĽ׳�֮�͡�
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int n = input.nextInt();
		result(n);
	}
	public static void result(int n) {
		//�����λʮλ��λ
		int ge = n % 10;
		int shi = n / 10 % 10;
		int bai = n / 100;
		//����׳�
		int a=1,b=1,c=1;
		for (int i = 1; i <= ge; i++) {
			a*=i;
		}
		for (int i = 1; i <= shi; i++) {
			b*=i;
		}
		for (int i = 1; i <= bai; i++) {
			c*=i;
		}
		System.out.println(a+b+c);
	}
	
}
