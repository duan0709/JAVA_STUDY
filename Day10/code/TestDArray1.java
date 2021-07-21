package com.duan.day06;

public class TestDArray1 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//定义二维数组                         行        列   
		//数据类型 [][] 数组名 = new 数据类型[高维长度][低维长度];
		//数据类型 数组名[][] = new 数据类型[高维长度][低维长度];
		
		int [][] nums = new int[3][5];
		//int nums [][] = new int[3][5];
		
		//存值
		nums[0][0] = 10;//第一行第一列
		nums[0][3] = 20;
		nums[1][0] = 30;
		nums[1][1] = 40;
		nums[2][2] = 50;
		nums[2][4] = 60;
		
		//取值
		System.out.println(nums.length);//行3
		System.out.println(nums[0].length);//访问低维长度 首个低维数组的长度 列5
		System.out.println(nums[1].length);//列5
		System.out.println(nums[2].length);//列5
		
		//遍历二维数组
		for (int i = 0; i < nums.length; i++) {//遍历行 i = 0,1...
			for (int j = 0; j < nums[i].length; j++) {//遍历列
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
		
		//高维数组中的每一个元素，保存了低维数组的地址。访问array[0]等价于在访问0x0000A111
		System.out.println(nums);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
	}

}
