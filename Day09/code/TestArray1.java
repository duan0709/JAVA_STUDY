package com.duan.day05;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组的创建方式
		
		//声明并分配空间
		//在内存中，申请长度为5的连续空间，存储5个int类型的值
		//数据类型 [] 数组名 = new 数据类型 [长度];
		int [] nums = new int [5];
		
		//访问元素 存值
		//数组名[下标] = 值;
		nums [0] = 10;
		nums [1] = 20;
		nums [2] = 30;
		nums [3] = 40;
		nums [4] = 50;
		
		//访问元素 取值
		//数组名 [下标];
		int num = nums [0];
		System.out.println(num);
		//System.out.println(nums [0]);也可以
	}

}
