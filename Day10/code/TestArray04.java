package com.duan.day06;

public class TestArray04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ɱ䳤����JDK1.5֮��
		//�﷨����������...�β���
		int [] nums = {10,20,30,40,50};
		printArray(nums);
		
		printArray();//�ײ�new����
		
		printArray(1);
		
		printArray(1,2);
		
		printArray(1,2,3,4);
	}
	public static void printArray(int ... arr) {
		System.out.println("��������");
		for (int a : arr) {
			System.out.println(a+"\t");
		}
		System.out.println();
	}
}
