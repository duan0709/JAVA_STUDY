package com.duan.day04;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  使用递归计算1-100的和
		  有返回值带参方法
		*/
		int result = jiecheng(5);
		System.out.println(result);
	}
	public static int jiecheng(int num) {
		if (num == 1 || num ==0) {
			return 1;
		} else {
			return num +jiecheng(num - 1);
		}
	}
}
