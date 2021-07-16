package com.duan.day03;
//1、导包
import java.util.Scanner;

public class demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//控制台输入整数n，计算n的阶乘（!n）。例：1*2*...*n
        //2、创建Scanner
        Scanner input = new Scanner(System.in);
        //3、接收数据
        System.out.println("请输入一个整数：");
        int n = input.nextInt();
        //4、计算n的阶乘（!n）
        /*整数的默认值是int，最大取值范围是2147483647
        如果计算13的阶乘超越其取值范围，值不准确了*/
        long sum = 1;
        for(int i = 1;i <= n;i++){
            sum *= i;
        }
        System.out.println(n+"的阶乘是："+sum);
        System.out.println("程序结束");
	}

}
