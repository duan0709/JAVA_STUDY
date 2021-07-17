package com.duan.day03;

import java.util.Scanner;

public class task01 {
	/*
	 （if 语句）读入一个整数，表示一个人的年龄。如果小于6岁，则输出“儿童”，6岁到13岁，输出“少儿”；14岁到17岁，输出“青少年”；18岁到35岁，输出“青年”；36岁到50岁，输出“中年”； 50岁以上输出“中老年”。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入年龄：");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		isName(age);
	}
	public static void isName(int age) {
		if (age < 6) {
			System.out.println("儿童");
		}
		if (age > 6 && age < 13) {
			System.out.println("少儿");
		}
		if (age > 14 && age < 17) {
			System.out.println("青少年");
		}
		if (age > 18 && age < 35) {
			System.out.println("青年");
		}
		if (age > 36 && age < 50) {
			System.out.println("中年");
		}
		if (age > 50) {
			System.out.println("中老年");
		}
	}

}
