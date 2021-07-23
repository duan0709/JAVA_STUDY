package com.duan.day08.oop.keyword;

public class TestStudent {
	public static void main(String[] args) {
		
		//实例对象
		Student xm = new Student();
		//访问属性 存值
		//对象名.属性名 = 值;
		xm.name = "小明";
		xm.age = 18;
		xm.sex = "男";
		xm.score = 98.5;
		//访问方法
		//对象名.方法名();
		
		xm.read();
		
		
		//创建对象
		Student xh = new Student("小红",18,"女",99);
		
		xh.read();
	}
}
