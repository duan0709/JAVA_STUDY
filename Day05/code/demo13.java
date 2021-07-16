package com.duan.day03;

public class demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        break的基本用法
        break：终止、跳出switch、循环结构
        */
        for(int i = 1;i <= 10;i++){
            if(i == 5){
                break;
            }
            System.out.println("当前值"+i);
        }
        System.out.println("程序结束");
	}

}
