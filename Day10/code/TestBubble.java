package com.duan.day06;

public class TestBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ð�����������������Ƚϴ�С������λ��
		
		int [] nums = {4,3,5,2,1};
		/*
		int a = 10;
		int b = 20;
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);//20
		System.out.println(b);//10
		*/
		
		
		//ǰһ�����Ⱥ�һ�����󣬽���
		
		for (int i = 0; i < nums.length-1; i++) {//��������
			for (int j = 0; j < nums.length-1-i; j++) {//���ƴ���
				if (nums[j] > nums[j+1]) {					
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k]+"\t");
		}
		System.out.println();
	}

}
