package com.duan.day05;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����̨����5�����е����ƣ�ʹ�����鱣�棬���������
		Scanner input = new Scanner(System.in);
		//1����������
		String[] cities = new String[5];
		//2������̨����5�����е����ƴ�������
		for (int i = 0; i < cities.length; i++) {
			System.out.println("�������������");
			String city = input.next();
			//�����д�������
			cities[i] = city;
		}
		System.out.println("ͨ����ǿforѭ������");
		for (String city : cities) {
			System.out.println(city+"\t");
		}
		System.out.println("\n�������");
	}

}
