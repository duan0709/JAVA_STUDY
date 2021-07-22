package com.duan.day07;

public class Teacher {
	   
	//特征：属性  实例变量
	String name;
	int age;
	String sex;
	double salary;
	//构造方法
	public Teacher() {
		System.out.println("Teacher无参构造方法执行了");
	}
	public Teacher(String name) {
		System.out.println("Teacher(name)构造方法执行了");
	}
	public Teacher(String name,int age) {
		System.out.println("Teacher(name,age)构造方法执行了");
	}
	public Teacher(String name,int age,String sex) {
		System.out.println("Teacher(name,age,sex)构造方法执行了");
	}
	public Teacher(String name,int age,String sex,double salary) {
		System.out.println("Teacher(name,age,sex,salary)构造方法执行了");
	}
	//行为：方法
	public void show() {
		System.out.println(name+"\t"+age+"\t"+sex+"\t"+salary);
	}
}

