package com.duan.day04;

public class TestReturnValue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = isEven(2);
		System.out.println("结果是："+result);
	}
	public static String isEven(int num) {
		if (num % 2 == 0) {
			return "偶数";
		} else {
			return "奇数";
		}
	}
}
