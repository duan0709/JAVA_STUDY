package com.duan.day2;

import java.util.Scanner;

public class demo15 {

	public static void main(String[] args) {
		//����������������ֱ�������lv������
		System.out.println("�����룺������/Ů����");
		Scanner input = new Scanner(System.in);
		String sex = input.next();
		gift(sex);
		
	}
	public static void gift(String sex) {
		if (sex.equals("����")) {
			System.out.println("�������ֱ�");
		} else if(sex.equals("Ů��")){
			System.out.println("��lv����");
		}else {
			System.out.println("������Ϸ�ֵ");
			Scanner input = new Scanner(System.in);
			String isSex = input.next();
			gift(isSex);
		}
	} 

}
