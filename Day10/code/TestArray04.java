package com.duan.day06;

public class TestArray04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//可变长参数JDK1.5之后
		//语法：数据类型...形参名
		int [] nums = {10,20,30,40,50};
		printArray(nums);
		
		printArray();//底层new数组
		
		printArray(1);
		
		printArray(1,2);
		
		printArray(1,2,3,4);
	}
	public static void printArray(int ... arr) {
		System.out.println("遍历参数");
		for (int a : arr) {
			System.out.println(a+"\t");
		}
		System.out.println();
	}
}
