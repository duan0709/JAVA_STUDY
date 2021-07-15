package com.duan.day2;

//1、导包
import java.util.Scanner;

public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
		如果体彩中了500万，我买车、买房、欧洲	旅游，否则继续买
		要求控制台输入是否中奖
		字符串比较使用equals()方法
		技术点if-else
		值的比较
		基本数据类型
		等值判断 1 == 1 '是' == '是'
			引用数据类型
		等值判断（地址值）
			字符串内容比较 equals()
	*/
	        //2、创建Scanner
	        Scanner input = new Scanner(System.in);
	        //3、接收数据
	        System.out.println("请输入是否中奖");
	        /*
	        char answer = input.next().charAt(0);
	        //4、判断
	        if('是' == answer){
	            System.out.println("买车、买房、欧洲旅游");
	        }else{
	            System.out.println("继续买");
	        }
	        */
	        String answer = input.next();
	        if("是".equals(answer)){
	            System.out.println("买车、买房、欧洲旅游");
	        }else{
	            System.out.println("继续买");
	        }
	        System.out.println("程序结束");
	}

}
