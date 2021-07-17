package com.duan.day03;

import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  （循环）*读入一个整数n，输出如下图形
		n = 3
		 *
		 ***
		 *****
		n = 4
		    *
		   ***
		  *****
		 *******
		 */
		System.out.println("请输入n的值：(3 or 4)");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n == 3 || n == 4) {
			if (n == 3) {
				for (int i = 1; i <= 3; i++) {
					for (int j = 1; j <= 2 * i - 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			} else {
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n - i; j++) {
						System.out.print(" ");
					}
					for (int j = 1; j <= 2 * i - 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		} else {
			System.out.println("请在3和4之间选择！！！");
		}

	}

}
