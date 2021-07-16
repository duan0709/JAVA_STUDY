package com.duan.day03;

public class demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        打印3行5颗*
        	*****
        	*****
        	*****
        	*****
        */
        //控制台打印*
        //System.out.println("*");
        //打印1行5颗*
        /*
        System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
        */
        /*
		for(int j=1;j<=5;j++){
			System.out.print("*");
		}
		System.out.println();//换行
		for(int j=1;j<=5;j++){
			System.out.print("*");
		}
		System.out.println();//换行
		for(int j=1;j<=5;j++){
			System.out.print("*");
		}
		System.out.println();//换行
		*/
        for(int i = 1;i <= 3;i++){
            for(int j = 1;j <= 5;j++){
                System.out.print("*");
            }
            System.out.println();//换行
        }
	}

}
