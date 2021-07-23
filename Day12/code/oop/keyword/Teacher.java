package com.duan.day08.oop.keyword;
/**
 * 教师类
 */
public class Teacher {
	//特征：属性
	String name;
	int age;
	String sex;
	double salary;
	
	//构造方法
	public Teacher() {
		
	}
	
	
	public Teacher(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		System.out.println("Teacher的三参构造");
	}
	
	public Teacher(String name, int age, String sex,double salary) {
		/*
		 * this.name = name; this.age = age; this.sex = sex; this.salary = salary;
		 */
		//调用三参方法
		this(name,age,sex);
		this.salary = salary;
		System.out.println("Teacher的四参构造");
	}


	//行为：方法
	public void show() {
		System.out.println("大家好，我的名字是："+name+",年龄是："+age+",性别是："+sex+",薪资是："+salary);
	}
}
