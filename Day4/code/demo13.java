package com.duan.day2;
//����
import java.util.Scanner;

public class demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ������λ���ֵĻ�Ա��
		 ��λ���ֵ��ڲ�����������ּ�Ϊ���˻�Ա
		 ��ʾ��ϲ���н��ˣ�����û�н�
		 */
		//2������Scanner
		Scanner input = new Scanner(System.in);
		//3������������λ���ֵĻ�Ա��
		System.out.println("��������λ���ֵĻ�Ա�ţ�");
		int cartNo = input.nextInt();
		//��λ���ֵ��ڲ�����������ּ�Ϊ���˻�Ա
		int ge = cartNo % 10;
		int shi = cartNo / 10 % 10;
		int bai = cartNo / 100 % 10;
		int qian = cartNo / 1000 % 10;
		System.out.println("ǧλ��"+qian+"��λ��"+bai+"ʮλ��"+shi+"��λ��"+ge);
		int random =(int)(Math.random()*10);
		System.out.println(random);
		if (bai == random) {
			System.out.println("��ϲ���н��ˣ�");
		} else {
			System.out.println("û�н�");
		}
		System.out.println("�������");
	}

}
