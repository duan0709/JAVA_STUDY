package com.duan.day2;

//如果有包的声明，必须放在文件的首行
//1、引用JDK提供的扫描工具

import java.util.Scanner;
public class demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数据类型 变量名 = 值;
        //2、声明Scanner
		Scanner input = new Scanner(System.in);
		//3、基于Scanner变量名input.nextInt();获取整数
		int i = input.nextInt();
        System.out.println(i);
        
	}

}
