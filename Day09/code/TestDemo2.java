package com.duan.day05;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ����һ���������飬����һ������n�����n�������д��ڣ�����±꣬�����������-1
		 */
		//1������һ����������
		int[] nums = {12,33,56,44};
		//2������һ������n
		System.out.println("������һ������");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		//3�������������nֵ�Ƿ����
		int i = 0;
		for (; i < nums.length; i++) {
			if (num == nums[i]) {
				System.out.println("�±��ǣ�"+i);
				break;
			}
		}
		if (i ==nums.length) {
			System.out.println("�±���-1");
		}
	}

}
