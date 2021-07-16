package com.duan.day03;

import java.util.Scanner;

public class demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        需求：检查作业完成情况，
        根据输入的教师评语
        决定学生是否抄写
        */
        //2、创建Scannner
        Scanner input = new Scanner(System.in);
        char answer;//声明
        do{
            //检查作业完成情况
            System.out.println("抄写一遍。");
            System.out.println("根据抄写情况输入较使评语：（y/n）");
            //3、接值
            answer = input.next().charAt(0);
        }while(answer != 'y');
        System.out.println("程序结束");
	}

}
