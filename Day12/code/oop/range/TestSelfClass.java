package com.duan.day08.oop.range;
/**
 * private
 * 访问本类
 * 四个访问权限符均有效
 */
public class TestSelfClass {
	private String a = "A";//私有的 红色正方形
	String b = "B";//default 默认的 蓝色的三角形
	protected String c = "C";//受保护的 黄色的菱形
	public String d = "D";//公共的 绿色的圆形
	
	public void show() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this.d);
	}
}
