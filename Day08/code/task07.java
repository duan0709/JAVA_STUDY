package com.duan.day04;

import java.util.Scanner;

public class task07 {

	public static void main(String[] args) {
		/*
		 验证哥德巴赫猜想：任何一个大于6的偶数，都能分解成两个质数的和。要求输入一个整数，输出这个数能被分解成哪两个质数的和。
		eg : 14
		14=3+11
		14=7+7
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数");
		int n = input.nextInt();
		isPrime(n);
	}
	
	public static boolean isPrime(int n) {
	    if (n <= 3) {
	        return n > 1;
	    }
	    //只需判断一个数能否被小于sqrt(n)的奇数整除
	    int sqrt = (int)Math.sqrt(n);
	    for (int i = 3; i <= sqrt; i += 2) {
	        if(n % 2 == 0 || n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	
}
