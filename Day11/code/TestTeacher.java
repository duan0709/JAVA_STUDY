package com.duan.day07;

/**
 *构造方法重载
 *
 */
public class TestTeacher {
	public static void main(String[] args) {
		  
		new Teacher();
		
		new Teacher("tom");
		
		new Teacher("tom",28);
		
		new Teacher("tom",28,"男");
		
		new Teacher("tom",28,"男",18000);
	}
}
