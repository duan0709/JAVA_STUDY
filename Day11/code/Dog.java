package com.duan.day07;
/**
 * 类
 * 自定义类 HelloWorld Dog
 * 系统类 System String Math
 * Dog类
 */
public class Dog {
	//特征（属性）代表有什么
	//数据类型 属性名
	//品种 年龄 性别 毛色
	String breed;//品种
	int age;//年龄
	String sex;//性别
	String furClolor;//毛色
	int num;//编号
	
	//行为（方法）代表能做什么
	//eat()
	public void eat() {
		System.out.println("eating");
	}
	//sleep()
	public void sleep() {
		System.out.println("sleeping");
	}

}
