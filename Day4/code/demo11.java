package com.duan.day2;

//1、导包
import java.util.Scanner;

public class demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*java成绩大于98分，而且html成绩大于80分，老师奖励他；或者java成绩等于100分，Html成绩大于70分，老师也可以奖励他。*/
        //2、创建Scanner
        Scanner input = new Scanner(System.in);
        //3、接收成绩
         System.out.println("请输入您的java成绩");
        double javaScore = input.nextDouble();
        System.out.println("请输入您的html成绩");
        double htmlScore = input.nextDouble();
        //4、判断
        if((javaScore > 98 && htmlScore > 80) || (javaScore == 100 && htmlScore > 70)){
          System.out.println("奖励一个键盘");  
        }
        System.out.println("程序结束");
	}

}
