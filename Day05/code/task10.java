package com.duan.day03;

public class task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//（for 循环）求100 以内所有能被3 整除但不能被5 整除的数字的和。
		int sum = 0;
		for (int i = 3; i <= 100; i+=3) {
			if (i % 5 != 0) {
				System.out.println("100 以内所有能被3 整除但不能被5 整除的数字为"+i);
				sum += i;
			}
		}
		System.out.println("他们的和是："+sum);
	}

}
