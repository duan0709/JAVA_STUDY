package com.duan.day04;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  ʹ�õݹ����1-100�ĺ�
		  �з���ֵ���η���
		*/
		int result = jiecheng(5);
		System.out.println(result);
	}
	public static int jiecheng(int num) {
		if (num == 1 || num ==0) {
			return 1;
		} else {
			return num +jiecheng(num - 1);
		}
	}
}
