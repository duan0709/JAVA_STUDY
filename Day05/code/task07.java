package com.duan.day03;

public class task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����1+3+5+...+99 �ĺ͡�
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				sum +=i;
			}
		}
		System.out.println("1+3+5+...+99 �ĺ���:"+sum);
	}

}
