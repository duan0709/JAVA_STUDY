package com.duan.day2;
//1、导包 将外部class文件引入自身程序中
import java.util.Scanner;

public class demo09 {

	public static void main(String[] args) {
		//2、声明Scanner
		Scanner input = new Scanner(System.in);
		//3、input 接收字符串类型的值input.next();
		System.out.println("请输入您的姓名：");
		String name = input.next();
		System.out.println("您的姓名是："+name);
		//3、input 接收整型类型的值 input.nextInt();
        //如果录入不匹配数据，会产生java.util.InputMismatchEception，比如年龄输入18.1
        System.out.println("请输入您的年龄：");
        int age = input.nextInt();
        System.out.println("您的年龄是："+age);
        //3、input 接收整型类型的值 input.next().charAt(0);
        System.out.println("请输入您的性别：");
        char sex = input.next().charAt(0);
        System.out.println("您的性别是："+sex);
        //3、input 接收整型类型的值 input.nextDouble();
        System.out.println("请输入您的身高：");
        double height = input.nextDouble();
        System.out.println("您的身高是："+height+"cm");
	}

}
