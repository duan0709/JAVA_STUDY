package com.duan.day04;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}
	public static void m1() {
		System.out.println("m1方法开始");
		//无穷递归，溢出
		m1();
		System.out.println("m1方法结束");
	}
}
