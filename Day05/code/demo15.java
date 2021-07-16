package com.duan.day03;

public class demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        continue的基本用法
        continue：结束本次循环、执行下一次循环
        */
        for(int i = 1;i <= 10;i++){
            if(i == 5){
                continue;
            }
            System.out.println("当前值："+i);
        }
        System.out.println("程序结束");
	}

}
