package com.duan.day05;

public class TestDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 扩容思路： 
		 创建大于原数组长度的新数组 
		 将原数组中的元素依次复制到新数组中。
		 通过System.arraycopy(原数组名,起始位置,新数组名,新数组起始位置,复制元素个数)方式复制
		 */
		
		// 1、创建源数组
		//创建空间大小为5的数组
		int[] nums = new int[5];
				
		//2、访问数组
		nums[0]=11;
		nums[1]=22;
		nums[2]=33;
		nums[3]=44;
		nums[4]=55;
				
		//3、遍历数组
		System.out.println("通过for循环遍历");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
				
		//4、创建一个新数组
		int [] newNums = new int [nums.length*2];
				
		//5、将原数组中的元素复制到新数组中
		//System.arraycopy(原数组名,起始位置,新数组名,新数组起始位置,复制元素个数)
		System.arraycopy(nums, 0, newNums, 0, nums.length);
		//6、遍历新数组
		System.out.println("通过for循环遍历");
		for (int i = 0; i < newNums.length; i++) {
			System.out.println(newNums[i]+"\t");
		}
		System.out.println();
	}

}
