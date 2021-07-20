package com.duan.day05;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 数组的遍历
		// 声明并分配空间
		// 在内存中，申请长度为5的连续空间，存储5个int类型的值
		// 数据类型 [] 数组名 = new 数据类型 [长度];
		
		int[] nums = new int[5];
		
		//访问元素 存值
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		//访问元素 取值
		System.out.println(nums.length);
		
		//数组的遍历
		System.out.println("通过for循环遍历");
		//下标从0开始，小于数组长度
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		/*
		 增强for循环
		 */
		System.out.println("通过增强for循环遍历：");
		for (int n : nums) {//将nums数组中的元素取出，依次赋值给变量n
			System.out.println(n);
		}
	}

}
