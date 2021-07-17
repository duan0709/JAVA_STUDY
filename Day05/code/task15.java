package com.duan.day03;

import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 （for循环）求水仙花数。
			提示：所谓水仙花数，是指一个三位数abc，
			如果满⾜a³+b³+c³=abc，则abc是水仙花数。
		*/
		/*
		System.out.println("请输入一个三位数");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int ge = num % 10;
		int shi = num / 10 % 10;
		int bai = num / 100;
		if (num > 0 && num <= 999) {
			if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == num) {
				System.out.println("这个三位数是水仙花数");
			}else {
				System.out.println("这个三位数不是水仙花数");
			}
		} else {
			System.out.println("请输入合理的数值！！！");
		}
		*/
		for (int num = 100; num <= 999; num++) {
			int ge = num % 10;
			int shi = num / 10 % 10;
			int bai = num / 100;
			if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == num) {
				System.out.println(num);
			}
		}
	}

}
