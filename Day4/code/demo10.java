package com.duan.day2;

//1、导包
import java.util.Scanner;

public class demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//如果java成绩大于90，奖励一个键盘
        //2、创建Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的java成绩：");
        //3、用input接收double类型的值 nextDouble();
        double score = input.nextDouble();
        //4、判断
        if(score > 90){
          System.out.println("奖励一个键盘");  
        }
        System.out.println("程序结束");
	}

}
