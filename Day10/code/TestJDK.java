package com.duan.day06;

public class TestJDK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JDK����java.util.Arrays.sort(������)//JDK�ṩ������
		
		int [] nums = {4,5,3,2,1};
		java.util.Arrays.sort(nums);
		
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(i+"\t");
		}
		//��������
		System.out.println("��������");
		for (int j = 0; j < nums.length/2; j++) {
			int temp = nums[j];
			nums[j] = nums[nums.length-1-j];
			nums[nums.length-1-j] = temp;
		}
		System.out.println();
		for (int i : nums) {
			System.out.print(i+"\t");
		}
	}

}
