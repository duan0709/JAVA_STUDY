package com.duan.day03;

public class task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��for ѭ������100 ���������ܱ�3 ���������ܱ�5 ���������ֵĺ͡�
		int sum = 0;
		for (int i = 3; i <= 100; i+=3) {
			if (i % 5 != 0) {
				System.out.println("100 ���������ܱ�3 ���������ܱ�5 ����������Ϊ"+i);
				sum += i;
			}
		}
		System.out.println("���ǵĺ��ǣ�"+sum);
	}

}
