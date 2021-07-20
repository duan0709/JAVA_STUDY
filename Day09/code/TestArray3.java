package com.duan.day05;

public class TestArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JDK1.5引入增强for循环
		//JDK1.5引入增强for循环只适用于数组遍历，不能使用下标
		
		//数据类型 [] 数据名 = new 数据类型 [长度];
		int [] nums = new int[5];
		
		//访问元素
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		//遍历数组
		System.out.println("通过for循环遍历：");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		//通过增强for循环将数组中的值依次加1
		
		System.out.println("通过增强for循环遍历：");
		//临时变量i，foreach增强型for循环只适用于数组遍历。相当于将这些数都拿出来暂存
		for (int i : nums) {
			i += 1;
			System.out.println(i);
		}
		
		//遍历数组
		System.out.println("通过for循环遍历：");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
