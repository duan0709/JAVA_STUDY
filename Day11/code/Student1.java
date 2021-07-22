package com.duan.day07;

public class Student1 {

	//特征:属性 实例变量
	String name;
	int age;
	String sex;
	double score;
	
	//构造方法
	public Student1() {
		//B.构造方法执行分成两步
		//1.初始化属性
		//2执行构造方法中的逻辑代码
		System.out.println("构造方法执行了");
	}
//	//     new Student("小红", 15, "女", 99.0);
	public Student1(String n,int a,String s,double c) {
		name=n;
		age=a;
		sex=s;
		score=c;
	}
	
	//行为:方法
	public void sayHi() {
		System.out.println("大家好，我的名字是："+name+",年龄是："+age+",性别是："+sex+",成绩是："+score+"分。");
	}
}

