package com.duan.day03;

public class demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        需求：打印100遍HelloJava
        */
        /*
        int i = 1;
        while(i <= 100){
            System.out.println(i+"HelloJava");
            i++;
        }
        System.out.println("程序结束");
        */
        //while循环修改for循环 1、修改关键字2、在布尔表达式前后各加一个分号
        /*
        int i = 1;
        for(;i <= 100;){
            System.out.println(i+"HelloJava");
            i++;
        }
        System.out.println("程序结束");
        */
        for(int i = 1;i <= 100;i++){
            System.out.println(i+"HelloJava");
        }
        System.out.println("程序结束");
	}

}
