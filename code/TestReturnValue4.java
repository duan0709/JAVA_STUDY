package com.duan.day04;

public class TestReturnValue4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
	}
	public static void show() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			if (i == 50) {
				//break;������ǰѭ��
				return;//��������
			}
		}
		System.out.println("�������");
	}
}
