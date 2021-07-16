package com.duan.day03;

public class demo19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 打印直角三角形
		 *
		 **
		 ***
		 ****
		 ******
		 行 i=1  *=1
		    i=2  *=2
		*/
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();//换行
		}
	}

}
