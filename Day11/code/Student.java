package com.duan.day07;
/**
 * 定义学生类
 * 属性：姓名（name）、年龄（age）、性别（sex）、分数（score）
 * 方法：打招呼 sayHi()//打印学生所有信息
 */
public class Student {

	//特征：属性
	String name;
	int age;
	String sex;
	double score;
	
	//行为：方法
	public void sayHi() {
		System.out.println("大家好，我的名字是"+name+"，今年"+age+"岁了"+"性别："+sex+"成绩是："+score);
	}
}
