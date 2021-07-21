package com.duan.day06;

public class TestArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 参数类型：基本数据类型 引用数据类型 */
		//基本数据类型
		/*
		int a = 10;//局部变量存放在栈中
		print1(a);//实参 为局部变量进行赋值
		System.out.println(a);
		*/
		
		//引用数据类型
		int [] nums = {10,20,30,40};//引用数据类型传地址值 引用数据类型放在堆中
		printArray(nums);
		System.out.println("主方法遍历数组");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
	}
	
	public static void printArray(int [] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] += 5;
		}
		System.out.println("printArray方法遍历数组");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
	}
	public static void print1(int a) {//形参 局部变量的声明
		a += 5;
		System.out.println(a);		
	}

}
