package com.duan.day06;

public class TestBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//冒泡排序：相邻两个数比较大小，互换位置
		
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
		
		
		//前一个数比后一个数大，交换
		
		for (int i = 0; i < nums.length-1; i++) {//控制轮数
			for (int j = 0; j < nums.length-1-i; j++) {//控制次数
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
