package com.duan.day2;

import java.util.Scanner;

public class demo16 {

	public static void main(String[] args) {
		/*�����ĸ����ڣ�
		 ������죬�������ů��������
		 ��������죬������������ס�,
		 ��������죬�����"�����ˬ",
		 ����Ƕ��죬�����"�������"��*/
		System.out.println("�����뼾�ڣ�");
		Scanner input = new Scanner(System.in);
		String season = input.next();
		if (season.equals("����")||season.equals("����")||season.equals("����")||season.equals("����")) {
			if(season.equals("����")) {
				System.out.println("��ů����");
			}
			if (season.equals("����")) {
				System.out.println("��������");
			}
			if (season.equals("����")) {
				System.out.println("�����ˬ");
			}
			if (season.equals("����")) {
				System.out.println("�������");
			}
		}else {
			System.out.println("���������ļ��ڣ�����");
		}
	}

}
