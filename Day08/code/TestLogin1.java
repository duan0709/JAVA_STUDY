package com.duan.day04;

import java.util.Scanner;

public class TestLogin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1������¼���û�������
		Scanner input = new Scanner(System.in);
		System.out.println("�����������û�����");
		String username = input.next();
		System.out.println("�������������룺");
		String password = input.next();
		//2���ж��Ƿ���ϵ�¼Ҫ��
		if ("admin".equals(username)&&"123456".equals(password)) {
			System.out.println("��½�ɹ�");
		} else {
			System.out.println("��¼ʧ��");
		}
		System.out.println("�������");
	}

}
