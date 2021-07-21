package com.duan.day06;

public class TestJDK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JDKÅÅĞò£ºjava.util.Arrays.sort(Êı×éÃû)//JDKÌá¹©£¨ÉıĞò£©
		
		int [] nums = {4,5,3,2,1};
		java.util.Arrays.sort(nums);
		
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(i+"\t");
		}
		//ÄæĞòÅÅĞò
		System.out.println("ÄæĞòÅÅĞò");
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
