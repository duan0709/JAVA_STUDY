package com.duan.day1;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
    	类型转换（基本数据类型）
    	一、自动转换
    	1、转换的两种数据类型要兼容
    	2、目标类型大于原类型（往高类型转换）
    	【从小到大】byte--short--int--long--float--double
    	char--int
		 */
		byte b = 100;
        short s = b;
        int i = s;
        long l = i;//不需加L，没越界
        float f = l;
        double d = f;
        System.out.println(d);
        
        char c = 'A';
        int ii = c;
        System.out.println(ii);
	}

}
