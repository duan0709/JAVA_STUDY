package com.duan.day03;

public class task11 {

	public static void main(String[] args) {
		// for ѭ��������ҳ���λ����abcd ������ (ab+cd)(ab+cd)=abcd ������
		for (int i = 1000; i <=9999; i++) {
			int f_2 = i / 100;
			int l_2 = i % 100;
			int num = 0; 
			if ( (f_2+l_2)*(f_2+l_2) == i) {
				System.out.println(i);
			}
		}		
	}
}
