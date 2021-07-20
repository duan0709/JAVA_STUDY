package com.duan.day05;

public class TestDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 给定一个整数数组，统计数组中所有元素的平均值
		 */
		
		//1、给定一个整数数组
		//创建数组
		//数据类型[] 数组名 = new 数据类型 []{value1,value2value3,...};
		int [] score = new int[] {90,85,60,89};
		//2、统计数组中所有元素的和
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		//3、求平均分 注意类型，强转double
		double avg = (double)sum / score.length;
		System.out.println("平均分是："+avg+"分");
	}

}
