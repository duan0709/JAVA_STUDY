package com.duan.day08.oop.bank;

import java.util.Scanner;

/**
 * 银行类
 * Bank类主要包括以下功能
	初始化用户（initial）
	用户登录（login）
	显示菜单（showMenu）
	存款（save）、取款（withDraw）、转账（trans）、查询余额（query）、修改密码（modifyPassword）
 */
public class Bank {
	//创建保存用户的数组
	private User[] users = new User[5];
	//用户个数
	private int size;
	//1、初始化用户
	public void initial() {
		//创建用户
		User user1 = new User();
		user1.setCardNo("12345");
		user1.setIdentity("370503");
		user1.setUsername("张三");
		user1.setPassword("12345");
		user1.setPhone("666666");
		user1.setBalance("10000");
		
 	}
	public Bank(){
		initial();
	}
	
	//2、用户登录
	public void login() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入卡号：");
		String cartNo = input.next();
		System.out.println("请输入密码：");
		String password = input.next();
		
		
		//遍历数组
		User u = null;
		//
		int size = 2;
		for (int i = 0; i < size; i++) {
			if (users[i].getCardNo().equals(cartNo) && users[i].getPassword().equals(password)) {
				u = users[i];
				break;
			}
			if (u != null) {
				System.out.println("登陆成功！");
				//显示菜单
				showMenu(u);
			}else {
				System.out.println("卡号或密码错误1");
			}
		}
	}
	//3、显示菜单
	public void showMenu(User u) {
		System.out.println("==============欢迎进入XXXX银行系统===="+u.getUsername()+"========");
		Scanner input = new Scanner(System.in);
		int chooice = input.nextInt();
		//switch case
		switch (chooice) {
		case 1:
			
			break;

		default:
			break;
		}
		do {
			System.out.println("存款（save）、取款（withDraw）、转账（trans）、查询余额（query）、修改密码（modifyPassword）");
		} while (true);//只要不按退出，菜单显示不结束
	}
	//存款
	public void save(User u) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入存款金额");
		double m = input.nextDouble();
		if (m > 0) {
			u.setBalance(u.getBalance() + m);
		}else {
			System.out.println("存款失败");
		}
	}
	public void withDraw(User u) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入取款金额");
		double m = input.nextDouble();
		if (m > 0) {
			
		}else {
			System.out.println("取款失败");
		}
	}
}
