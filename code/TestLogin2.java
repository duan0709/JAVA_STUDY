package com.duan.day04;

import java.util.Scanner;

public class TestLogin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����ʼ");
		login();
		System.out.println("�������");
	}
	/**
	 1���û�¼�뷽�� ��һְ��ԭ��
	 */
	 public static void login() {
		 Scanner input = new Scanner(System.in);
		 	//1������¼���û�������
			System.out.println("�����������û�����");
			String username = input.next();
			System.out.println("�������������룺");
			String password = input.next();
			//����isLogin����
			isLogin(username,password);
	}
	 /**
	 2����֤��¼���� ���η���
	 */
	 public static void isLogin(String username,String password) {
		//2���ж��Ƿ���ϵ�¼Ҫ��
		 if ("admin".equals(username)&&"123456".equals(password)) {
				System.out.println("��½�ɹ�");
			} else {
				System.out.println("��¼ʧ��");
			}
	} 

}
