package com.duan.day2;

public class demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//三元（目）运算符
        //布尔表达式?表达式1:表达式2
        double score = 100.0;
        //1、三元运算符可以进行逻辑判断
        System.out.println(score == 100.0 ? "真棒" : "加油");
        //2、三元运算符可以判断完为变量赋值
        String str = score == 100.0 ? "真棒" : "加油";
        System.out.println(str);
	}

}
