package com.duan.day07;
/*
 ����һ��Address �࣬�������£�
11.1 �������������ԣ�
11.1.1 String ���͵�address����ʾ��ַ��
11.1.2 String ���͵�zipCode����ʾ�ʱࡣ
11.2 �������������췽����
11.2.1 �޲ι��췽����
11.2.2 �����������Ĺ��췽����
 */
public class Address {
	
	String address;
	String zipCode;
	//�޲�
	public Address() {
		
	}
	//�в�
	public Address(String a,String z) {
		address = a;
		zipCode = z;
	}
	public void print() {
		  System.out.print("��ַ��"+address+"\t");
		  System.out.print("�ʱࣺ"+zipCode+"\t");
		 }
	
}
