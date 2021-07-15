package com.duan.day2;

public class demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//逻辑运算符
        // && || ！
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);//全真为真
        System.out.println(a || b);//一真为真
        
        boolean c = 10 > 5;
        boolean d = 8 < 20;
        System.out.println(c && d);//true
        System.out.println(c || d);//true
	}

}
