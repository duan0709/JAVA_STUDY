package com.duan.day06;

public class task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//给定一个数组，把这个数组中所有元素顺序进行颠倒。
		int[] nums = {4,2,3,4,5};
		for (int i = 0; i < nums.length/2; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length-1-i];
			nums[nums.length-1-i] = temp;
		}
		for (int num : nums) {
			System.out.print(num+"\t");
		}
		
	}

}
