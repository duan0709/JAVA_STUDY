package com.duan.day03;

import java.util.Scanner;

public class task01 {
	/*
	 ��if ��䣩����һ����������ʾһ���˵����䡣���С��6�꣬���������ͯ����6�굽13�꣬������ٶ�����14�굽17�꣬����������ꡱ��18�굽35�꣬��������ꡱ��36�굽50�꣬��������ꡱ�� 50����������������ꡱ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������䣺");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		isName(age);
	}
	public static void isName(int age) {
		if (age < 6) {
			System.out.println("��ͯ");
		}
		if (age > 6 && age < 13) {
			System.out.println("�ٶ�");
		}
		if (age > 14 && age < 17) {
			System.out.println("������");
		}
		if (age > 18 && age < 35) {
			System.out.println("����");
		}
		if (age > 36 && age < 50) {
			System.out.println("����");
		}
		if (age > 50) {
			System.out.println("������");
		}
	}

}
