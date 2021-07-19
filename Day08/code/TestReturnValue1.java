package com.duan.day04;

public class TestReturnValue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//调用方式
		//第一种：直接打印
		System.out.println("和是："+add(2,3));
		//第二种：赋值给合适的变量
		int sum=add(2,3);
		System.out.println("两个数的和是："+sum);
		//第三种：参与运算
		System.out.println(add(2,3)+10);
		if(add(2,3)==5){
			System.out.println("结果为5");
		}
	}
	/**
	 计算两个数的和
	 */
	public static int add(int a,int b) {
		return a + b;
	}

}
