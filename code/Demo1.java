package com.duan.day04;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main方法开始");
		m1();
		System.out.println("main方法结束");
	}
	public static void m1() {
		System.out.println("m1方法开始");
		m2();
		System.out.println("m1方法结束");
	}
	public static void m2() {
		System.out.println("m2方法开始");
		System.out.println("m2方法结束");
	}

}
