package com.duan.day04;

public class TestReturnValue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = isEven(2);
		System.out.println("����ǣ�"+result);
	}
	public static String isEven(int num) {
		if (num % 2 == 0) {
			return "ż��";
		} else {
			return "����";
		}
	}
}
