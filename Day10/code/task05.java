package com.duan.day06;

public class task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������ð�������㷨������һ�����飺int[] a = {1,3,2,7,5}����ð��������䰴�մ�С�����˳������Ȼ����������
		int[] a = {1,3,2,7,5};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("��С����������Ϊ��");
		for (int i : a) {
			System.out.print(i+"\t");			
		}
	}

}
