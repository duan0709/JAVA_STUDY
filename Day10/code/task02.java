package com.duan.day06;

import java.util.Scanner;

public class task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Զ���һ����������a������һ������n�����n�������д��ڣ������n���±ꣻ��������ڣ����-1��
		int [] a = {1,2,3,4,5};
		Scanner input = new Scanner(System.in);
		System.out.println("int [] a = {1,2,3,4,5};");
		System.out.println("������һ������");
		int n = input.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				System.out.println("����������ڣ��±��ǣ�"+i);
				break;
			}else {
				System.out.println("-1");
				break;
			}
		}
	}

}
