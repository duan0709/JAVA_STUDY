package com.duan.day03;

public class demo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  打印等腰三角形
		  *
		  ***
		  *****
		  *******
		  *********
		  i    j
		  1    1
		  2    3
		  3    5
		  4    7
		  ####*
		  ###***
		  ##*****
		  #*******
		  *********
		*/
		int rows=5;
		for(int i=1;i<=rows;i++){//外层循环控制行数
		    //打印空格（倒三角）
			for(int j=rows-1;j>=i;j--){//4 3 2 1  4>=2
				System.out.print(" ");
			}
		    //打印*
			for(int j=1;j<=2*i-1;j++){//内层循环控制列数
			   System.out.print("*");	   	
			}
			//换行
			System.out.println();
		}
	}

}
