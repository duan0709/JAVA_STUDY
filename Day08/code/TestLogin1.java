package com.duan.day04;

import java.util.Scanner;

public class TestLogin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1、键盘录入用户名密码
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的用户名：");
		String username = input.next();
		System.out.println("请输入您的密码：");
		String password = input.next();
		//2、判断是否符合登录要求
		if ("admin".equals(username)&&"123456".equals(password)) {
			System.out.println("登陆成功");
		} else {
			System.out.println("登录失败");
		}
		System.out.println("程序结束");
	}

}
