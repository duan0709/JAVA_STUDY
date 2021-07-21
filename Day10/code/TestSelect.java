package com.duan.day06;

public class TestSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//选择排序：固定值与其他值依次比较大小，互换位置
		int [] nums = {4,3,5,2,1};
		for (int i = 0; i < nums.length - 1; i++) {//控制轮数
			//不与自身比较
			for (int j = i + 1; j < nums.length; j++) {//控制次数
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k]+"\t");
		}
		System.out.println();
	}

}
