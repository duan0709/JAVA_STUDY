package com.duan.day04;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用递归实现10以内的阶乘
		//有返回值带参方法
		int result = jiecheng(5);
		System.out.println("阶乘是："+result);
	}
	public static int jiecheng(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}else {
			return num*jiecheng(num-1);
		}
	}
}
