package com.duan.day2;

import java.util.Scanner;

public class demo17 {

	public static void main(String[] args) {
		/*
		�����򳵣���ʲô�����������������ж��ٴ��	
		����ҵĴ���500���Ҿ���ʱ��
		��������ҵĴ���100���Ҿ���·��
		���� ����ҵĴ���50���Ҿ�����
		���� ����ҵĴ���10���Ҿ������
		���� ����ҵĴ��10������ ������ݰ���
		 */
		System.out.println("���У�����λ����Ԫ��");
		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		if (money >= 500) {
			System.out.println("��ʱ��");
		}
		if (money >= 100 && money < 500) {
			System.out.println("��·��");
		}
		if (money >= 50 && money < 100) {
			System.out.println("����");
		}
		if (money >= 10 && money < 50) {
			System.out.println("�����");
		}
		if (money < 10) {
			System.out.println("��ݰ���");
		}
	}

}
