package com.duan.day03;

public class task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输出99 乘法表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <=i; j++) {
				//列*行
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}	
	}
}
