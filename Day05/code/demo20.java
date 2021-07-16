package com.duan.day03;

public class demo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 九九乘法表
		*/
		//列*行
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();//换行
		}
		
	}

}
