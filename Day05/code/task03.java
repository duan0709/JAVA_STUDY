package com.duan.day03;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 if ��䣩����һ����ʾ��ݵ��������ж���һ���Ƿ������ꡣ����ж�һ����� �Ƿ������꣺
			����������ܹ���4 �������Ҳ��ܱ�100 ����������һ�������ꡣ���磬1996 �������꣬����Ӧ�ģ�1993 ��Ͳ������ꡣ
			����������ܹ���100 �����������������Ҫ�ܱ�400 �������������ꡣ���磬2000 �������꣬1900 �겻�����ꡣ 
		 */
		System.out.println("���������");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if ((year % 4 == 0 && year % 100 != 0)||(year % 100 == 0 && year % 400 == 0)) {
			System.out.println("��һ��������");
		}else {
			System.out.println("��һ�겻������");
		}
	}

}
