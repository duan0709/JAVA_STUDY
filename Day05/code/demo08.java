package com.duan.day03;

import java.util.Scanner;

public class demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        ���󣺼����ҵ��������
        ��������Ľ�ʦ����
        ����ѧ���Ƿ�д
        */
        //2������Scannner
        Scanner input = new Scanner(System.in);
        char answer;//����
        do{
            //�����ҵ������
            System.out.println("��дһ�顣");
            System.out.println("���ݳ�д��������ʹ�����y/n��");
            //3����ֵ
            answer = input.next().charAt(0);
        }while(answer != 'y');
        System.out.println("�������");
	}

}
