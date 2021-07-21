package com.duan.day06;

public class TestDArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 二维数组的创建语法
		 先声明、再分配空间：
		 数据类型[][] 数组名;
		 数组名 = new 数据类型[高维长度][低维长度];
		int[][] nums;
		nums=new int[3][5];
		声明并分配空间：
		数据类型[][] 数组名 = new 数据类型[高维长度][低维长度];
		int[][] nums=new int[3][5];
		声明并赋值（繁）：
		数据类型[][] 数组名 = new 数据类型[高维长度][]; //不规则数组，自行new低维数组
		声明并赋值（简）：
		数据类型[][] 数组名 = { {v1,v2,v3},{v4,v5},{v6,v7,v8,v9} }; //显示初始化
		 */
		
		//声明并赋值（繁）
		//数据类型[][] 数组名 = new 数据类型[高维长度][];
		int [][] nums = new int [3][];
		
		//创建低维数组
		int [] a = new int[3];
		nums[0] = new int[5];//第一行5列
		nums[1] = a;//第二行3列
		nums[2] = new int[2];//第三行2列
		
		//数组有默认值 0
		System.out.println("遍历二维数组");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
		
		//声明并赋值（简）
		//数组类型 [][] 数组名 = { {v1,v2,v3},{v4,v5},{v6,v7,v8,v9} }; //显示初始化
		double [][] scores = {{3.14,12.6},{5.67},{4.14,7.89,6.12}};
		System.out.println("遍历二维数组");
		for (double[] score : scores) {
			for (double s : score) {
				System.out.print(s+"\t");
			}
			System.out.println();
		}
	}

}
