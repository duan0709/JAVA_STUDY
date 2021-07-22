package com.duan.day07;
/*
 创建一个Address 类，描述如下：
11.1 该类有两个属性：
11.1.1 String 类型的address，表示地址。
11.1.2 String 类型的zipCode，表示邮编。
11.2 该类有两个构造方法：
11.2.1 无参构造方法。
11.2.2 带两个参数的构造方法。
 */
public class Address {
	
	String address;
	String zipCode;
	//无参
	public Address() {
		
	}
	//有参
	public Address(String a,String z) {
		address = a;
		zipCode = z;
	}
	public void print() {
		  System.out.print("地址："+address+"\t");
		  System.out.print("邮编："+zipCode+"\t");
		 }
	
}
