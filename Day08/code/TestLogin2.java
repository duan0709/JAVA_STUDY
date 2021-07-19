package com.duan.day04;

import java.util.Scanner;

public class TestLogin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("程序开始");
		login();
		System.out.println("程序结束");
	}
	/**
	 1、用户录入方法 单一职能原则
	 */
	 public static void login() {
		 Scanner input = new Scanner(System.in);
		 	//1、键盘录入用户名密码
			System.out.println("请输入您的用户名：");
			String username = input.next();
			System.out.println("请输入您的密码：");
			String password = input.next();
			//调用isLogin方法
			isLogin(username,password);
	}
	 /**
	 2、验证登录方法 带参方法
	 */
	 public static void isLogin(String username,String password) {
		//2、判断是否符合登录要求
		 if ("admin".equals(username)&&"123456".equals(password)) {
				System.out.println("登陆成功");
			} else {
				System.out.println("登录失败");
			}
	} 

}
