package com.duan.day03;

public class task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//计算1+3+5+...+99 的和。
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				sum +=i;
			}
		}
		System.out.println("1+3+5+...+99 的和是:"+sum);
	}

}
