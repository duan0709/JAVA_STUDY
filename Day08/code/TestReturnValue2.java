package com.duan.day04;

public class TestReturnValue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//需求：定义一个方法，计算两个整数的和，并返回结果，在main方法中打印
		System.out.println("两个数的和是："+add(2, 3));
	}
	//定义一个方法，计算两个整数的和，并返回结果
	public static int add(int a,int b) {
		return a + b;
		//return a - b;return表示方法结束了，后面若有表达式，返回会其结果，一个方法只能有一个返回值！！！
	}
}
