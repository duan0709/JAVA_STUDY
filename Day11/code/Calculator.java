package com.duan.day07;
/**
 * 计算器类
 *重载
 *两同三不同
 *在同一个类中，方法名相同
 *参数列表不同（类型、个数、顺序）
 *与访问修饰符 返回值无关
 */
public class Calculator {

	//行为：方法
	//求和操作
	public int add(int a,int b) {
		return a + b;
	}
	public int add(int a,int b,int c) {
		return a + b + c;
	}
}
