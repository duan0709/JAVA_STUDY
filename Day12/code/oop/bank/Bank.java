package com.duan.day08.oop.bank;

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
	//���������û�������
	private User[] users = new User[5];
	//�û�����
	private int size;
	//1����ʼ���û�
	public void initial() {
		//�����û�
		User user1 = new User();
		user1.setCardNo("12345");
		user1.setIdentity("370503");
		user1.setUsername("����");
		user1.setPassword("12345");
		user1.setPhone("666666");
		user1.setBalance("10000");
		
 	}
	public Bank(){
		initial();
	}
	
	//2���û���¼
	public void login() {
		Scanner input = new Scanner(System.in);
		System.out.println("�����뿨�ţ�");
		String cartNo = input.next();
		System.out.println("���������룺");
		String password = input.next();
		
		
		//��������
		User u = null;
		//
		int size = 2;
		for (int i = 0; i < size; i++) {
			if (users[i].getCardNo().equals(cartNo) && users[i].getPassword().equals(password)) {
				u = users[i];
				break;
			}
			if (u != null) {
				System.out.println("��½�ɹ���");
				//��ʾ�˵�
				showMenu(u);
			}else {
				System.out.println("���Ż��������1");
			}
		}
	}
	//3����ʾ�˵�
	public void showMenu(User u) {
		System.out.println("==============��ӭ����XXXX����ϵͳ===="+u.getUsername()+"========");
		Scanner input = new Scanner(System.in);
		int chooice = input.nextInt();
		//switch case
		switch (chooice) {
		case 1:
			
			break;

		default:
			break;
		}
		do {
			System.out.println("��save����ȡ�withDraw����ת�ˣ�trans������ѯ��query�����޸����루modifyPassword��");
		} while (true);//ֻҪ�����˳����˵���ʾ������
	}
	//���
	public void save(User u) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������");
		double m = input.nextDouble();
		if (m > 0) {
			u.setBalance(u.getBalance() + m);
		}else {
			System.out.println("���ʧ��");
		}
	}
	public void withDraw(User u) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ȡ����");
		double m = input.nextDouble();
		if (m > 0) {
			
		}else {
			System.out.println("ȡ��ʧ��");
		}
	}
}
