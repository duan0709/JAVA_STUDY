package com.duan.day06;

public class task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ѡ������ ����һ�����飺int[] a = {1,3,2,7,5}����ð��������䰴�մ�С�����˳������Ȼ����������
		int[] a = {1,3,2,7,5};
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.print("���մ�С�����˳������Ϊ��");
		for (int b : a) {
			System.out.print(b+"\t");
		}
	}

}
