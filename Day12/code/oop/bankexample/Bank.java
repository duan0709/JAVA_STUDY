package com.duan.day08.oop.bankexample;

import java.util.Scanner;

/**
 * ������
 * Bank����Ҫ�������¹���
	��ʼ���û���initial��
	�û���¼��login��
	��ʾ�˵���showMenu��
	��save����ȡ�withDraw����ת�ˣ�trans������ѯ��query�����޸����루modifyPassword��
 */
public class Bank {
	//���������������û���Ϣ
	private User[] users = new User[5];
	//Ĭ���û�����
	private int count = 2;
	
	//1����ʼ���û�
	public void initial() {
		//�����û�
		User user1 = new User();
		user1.setCarNum("12345");
		user1.setIdentity("370503");
		user1.setUsername("����");
		user1.setPassword("12345");
		user1.setPhoneNum("123456");
		user1.setBalance(10000);
		
		User user2 = new User("1234","370504","����","1234","12345",1000);
		
		users[0] = user1;
		users[1] = user2;
		
		//������Ч����
		count = 2;
		
		System.out.println("ϵͳ��ʼ�����...");
	}
	
	//���췽�� ����ʼִ�г�ʼ������
	public Bank() {
		initial();
	}
	
	//2���û���¼
	public void login() {
		//2.1���������˺����룬��֤
		Scanner input = new Scanner(System.in);
		System.out.println("�����뿨�ţ�");
		int carNum = input.nextInt();
		System.out.println("����������");
		int password = input.nextInt();
		
		//�������� 
		User user = null;
		for (int i = 0; i < count; i++) {
			//�жϣ�����û���������ȷ����¼
			if (users[i].getCarNum().equals(carNum) && users[i].getPassword().equals(password)) {
				user = users[i];
			}
		}
	}

}
