package com.duan.day04;

public class TestReturnValue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���÷�ʽ
		//��һ�֣�ֱ�Ӵ�ӡ
		System.out.println("���ǣ�"+add(2,3));
		//�ڶ��֣���ֵ�����ʵı���
		int sum=add(2,3);
		System.out.println("�������ĺ��ǣ�"+sum);
		//�����֣���������
		System.out.println(add(2,3)+10);
		if(add(2,3)==5){
			System.out.println("���Ϊ5");
		}
	}
	/**
	 �����������ĺ�
	 */
	public static int add(int a,int b) {
		return a + b;
	}

}
