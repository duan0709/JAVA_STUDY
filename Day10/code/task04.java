package com.duan.day06;

public class task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ�����飬���������������Ԫ��˳����еߵ���
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
