package com.duan.day06;

public class task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//给定一个数组，输出数组中的最大值和最小值。
		int [] nums = {59,2,38,47,55};
		int max,min;
		max = nums[0];
		min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("最大值是："+max+"最小值是："+min);
	}

}
