package com.duan.day06;

public class TestArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �������ͣ������������� ������������ */
		//������������
		/*
		int a = 10;//�ֲ����������ջ��
		print1(a);//ʵ�� Ϊ�ֲ��������и�ֵ
		System.out.println(a);
		*/
		
		//������������
		int [] nums = {10,20,30,40};//�����������ʹ���ֵַ �����������ͷ��ڶ���
		printArray(nums);
		System.out.println("��������������");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
	}
	
	public static void printArray(int [] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] += 5;
		}
		System.out.println("printArray������������");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
	}
	public static void print1(int a) {//�β� �ֲ�����������
		a += 5;
		System.out.println(a);		
	}

}
