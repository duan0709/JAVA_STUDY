package com.duan.day03;

import java.util.Scanner;

public class demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���ݲ�ͬ����������ʾ��ͬ���� ��һ��������ipone 12 �ڶ��������� С�׵��� ������������ ���г� ���򣺽��� ��Ʊ
		 */
		// 2������Scanner
		Scanner input = new Scanner(System.in);
		// 3����������
		System.out.println("���������Σ�");
		int num = input.nextInt();
		// 4����������
		switch (num) {
		case 1:
			System.out.println("����ipone 12");
			break;
		case 2:
			System.out.println("����С�׵���");
			break;
		case 3:
			System.out.println("�������г�");
			break;
		default:
			System.out.println("����ipone 12");
			break;// ��������break;�����ӣ���case1ǰ�������Զִ��
		}
		System.out.println("�������");
	}
}
