package com.duan.day06;

public class TestDArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ��ά����Ĵ����﷨
		 ���������ٷ���ռ䣺
		 ��������[][] ������;
		 ������ = new ��������[��ά����][��ά����];
		int[][] nums;
		nums=new int[3][5];
		����������ռ䣺
		��������[][] ������ = new ��������[��ά����][��ά����];
		int[][] nums=new int[3][5];
		��������ֵ��������
		��������[][] ������ = new ��������[��ά����][]; //���������飬����new��ά����
		��������ֵ���򣩣�
		��������[][] ������ = { {v1,v2,v3},{v4,v5},{v6,v7,v8,v9} }; //��ʾ��ʼ��
		 */
		
		//��������ֵ������
		//��������[][] ������ = new ��������[��ά����][];
		int [][] nums = new int [3][];
		
		//������ά����
		int [] a = new int[3];
		nums[0] = new int[5];//��һ��5��
		nums[1] = a;//�ڶ���3��
		nums[2] = new int[2];//������2��
		
		//������Ĭ��ֵ 0
		System.out.println("������ά����");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
		
		//��������ֵ����
		//�������� [][] ������ = { {v1,v2,v3},{v4,v5},{v6,v7,v8,v9} }; //��ʾ��ʼ��
		double [][] scores = {{3.14,12.6},{5.67},{4.14,7.89,6.12}};
		System.out.println("������ά����");
		for (double[] score : scores) {
			for (double s : score) {
				System.out.print(s+"\t");
			}
			System.out.println();
		}
	}

}
