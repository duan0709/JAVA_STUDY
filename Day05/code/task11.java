package com.duan.day03;

public class task11 {

	public static void main(String[] args) {
		// for 循环）编程找出四位整数abcd 中满足 (ab+cd)(ab+cd)=abcd 的数。
		for (int i = 1000; i <=9999; i++) {
			int f_2 = i / 100;
			int l_2 = i % 100;
			int num = 0; 
			if ( (f_2+l_2)*(f_2+l_2) == i) {
				System.out.println(i);
			}
		}		
	}
}
