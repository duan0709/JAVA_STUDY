package com.duan.day2;
//1������ ���ⲿclass�ļ��������������
import java.util.Scanner;

public class demo09 {

	public static void main(String[] args) {
		//2������Scanner
		Scanner input = new Scanner(System.in);
		//3��input �����ַ������͵�ֵinput.next();
		System.out.println("����������������");
		String name = input.next();
		System.out.println("���������ǣ�"+name);
		//3��input �����������͵�ֵ input.nextInt();
        //���¼�벻ƥ�����ݣ������java.util.InputMismatchEception��������������18.1
        System.out.println("�������������䣺");
        int age = input.nextInt();
        System.out.println("���������ǣ�"+age);
        //3��input �����������͵�ֵ input.next().charAt(0);
        System.out.println("�����������Ա�");
        char sex = input.next().charAt(0);
        System.out.println("�����Ա��ǣ�"+sex);
        //3��input �����������͵�ֵ input.nextDouble();
        System.out.println("������������ߣ�");
        double height = input.nextDouble();
        System.out.println("��������ǣ�"+height+"cm");
	}

}
