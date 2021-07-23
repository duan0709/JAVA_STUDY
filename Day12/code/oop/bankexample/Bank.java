package com.duan.day08.oop.bankexample;

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
	//创建数组来保存用户信息
	private User[] users = new User[5];
	//默认用户个数
	private int count = 2;
	
	//1、初始化用户
	public void initial() {
		//创建用户
		User user1 = new User();
		user1.setCarNum("12345");
		user1.setIdentity("370503");
		user1.setUsername("张三");
		user1.setPassword("12345");
		user1.setPhoneNum("123456");
		user1.setBalance(10000);
		
		User user2 = new User("1234","370504","李四","1234","12345",1000);
		
		users[0] = user1;
		users[1] = user2;
		
		//设置有效个数
		count = 2;
		
		System.out.println("系统初始化完毕...");
	}
	
	//构造方法 ，开始执行初始化操作
	public Bank() {
		initial();
	}
	
	//2、用户登录
	public void login() {
		//2.1首先输入账号密码，验证
		Scanner input = new Scanner(System.in);
		System.out.println("请输入卡号：");
		int carNum = input.nextInt();
		System.out.println("请输入密码");
		int password = input.nextInt();
		
		//遍历数组 
		User user = null;
		for (int i = 0; i < count; i++) {
			//判断，如果用户名密码正确，登录
			if (users[i].getCarNum().equals(carNum) && users[i].getPassword().equals(password)) {
				user = users[i];
			}
		}
	}

}
