package com.duan.day03;

import java.util.Scanner;

public class demo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        ���󣺼����ҵ��������
        ��������Ľ�ʦ����
        ����ѧ���Ƿ�д
        */
        //2������Scannner
        Scanner input = new Scanner(System.in);
        String answer;//����
        do{
            //�����ҵ������
            System.out.println("��дһ�顣");
            System.out.println("���ݳ�д��������ʹ�����y/n��");
            //3����ֵ
            answer = input.next();
        }while(!"y".equals(answer));
        System.out.println("y".equals(answer));
        System.out.println("�������");
	}

}
