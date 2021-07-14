package com.duan.day1;

public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        二、强制类型转换
        	1、转换的两种数据类型要兼容
        	2、目标类型小于原类型（强制转换称更低的类型）
        	【从大到小】
        */
        short s = 123;
        byte b = (byte)s;
        System.out.println(b);
        
        int i = 65;
        char c = (char)i;
        System.out.println(c);
        
        //double转int，越界，精度有损失，小数点全舍掉了
        double d = 3.14;
        int ii = (int)d;
        System.out.println(ii);
	}

}
