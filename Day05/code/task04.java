package com.duan.day03;

import java.util.Scanner;

public class task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��switch ��䣩����һ�������������1~5 ֮�䣬��ֱ����5�����޵����֣����������������ӭ�㡱��
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("����");
			break;
			
		case 2:
			System.out.println("����");
			break;
			
		case 3:
			System.out.println("����");
			break;
			
		case 4:
			System.out.println("ӨӨ");
			break;
			
		case 5:
			System.out.println("����");
			break;
		default:
			System.out.println("������ӭ��");
			break;
		}
	}

}
