package com.duan.day03;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 if 语句）读入一个表示年份的整数，判断这一年是否是闰年。如何判断一个年份 是否是闰年：
			如果这个年份能够被4 整除，且不能被100 整除，则这一年是闰年。例如，1996 年是闰年，而相应的，1993 年就不是闰年。
			如果这个年份能够被100 整除，则这个数必须要能被400 整除，才是闰年。例如，2000 年是闰年，1900 年不是闰年。 
		 */
		System.out.println("请输入年份");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if ((year % 4 == 0 && year % 100 != 0)||(year % 100 == 0 && year % 400 == 0)) {
			System.out.println("这一年是闰年");
		}else {
			System.out.println("这一年不是闰年");
		}
	}

}
