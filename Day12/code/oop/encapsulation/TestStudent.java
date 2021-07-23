package com.duan.day08.oop.encapsulation;
/**
 * 封装的步骤
 * 1、把属性变成私有的，在类外不能访问【属性提娜佳private修饰】
 * 2、添加get（获取）和set（设置）方法
 */
public class TestStudent {
	public static void main(String[] args) {
		
		//创建对象
		Student xm = new Student();
		//访问属性
		xm.setName("小明");
		xm.setAge(16);
		xm.setSex("男");
		xm.setScore(98.5);
		
		//访问方法
		xm.show();
		
		Student xh = new Student("小红",5555,"hhh",199.0);
		xh.show();
	}
}
