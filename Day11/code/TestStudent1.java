package com.duan.day07;

/**
 *1. new Student()���ã�
 *   ʵ��һ������
 *   Student()���췽��
 *2.��ζ��幹�췽����
 *  �﷨��
 *    ����Ȩ�޷�   ����(){
 *    
 *    }
 *    ע�⣺��д����ֵ����
 * 3���췽����ε��ã�
 *    new ����();
 * 4.���췽�������ã�
 *   A.�������
 *   BΪ���Ը�ֵ
 *
 */
public class TestStudent1 {
	public static void main(String[] args) {
		
		//��������
		//A.ִ��new Student��������  ���п��ٿռ�
		//C.�����췽�����ڴ��ַ�������ñ���
		Student1 xm=new Student1();
		
		xm.name="С��";
		xm.age=16;
		xm.sex="��";
		xm.score=98.5;
		
		xm.sayHi();
		
		Student1 xh=new Student1("С��", 15, "Ů", 99.0);
		xh.sayHi();
		
		
	}
}

