package com.duan.day08.oop.keyword;
/**
 * 学生类
 */
public class Student {
	//特征：属性 实例变量
	String name;
	int age;
	String sex;
	double score;
	
	//构造方法
	public Student() {
		
	}
	public Student(String name,int age,String sex,double score) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
	}
	
	//行为：方法 实例方法
	public void show() {
		System.out.println("大家好，我的名字是："+name+",年龄是："+age+",性别是："+sex+",成绩是："+score);
	}
	
	public void read() {
		this.show();
		System.out.println("阅读...");
	}
}
