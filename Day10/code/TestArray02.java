package com.duan.day06;

public class TestArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组类型返回值
		int [] nums = {111,222,333,444,555};//假如地址为0x0000A001
		
		int [] na = expand(nums);//0x0000B002
		for (int i = 0; i < na.length; i++) {
			System.out.println(na[i]+"\t");
		}
		System.out.println();
	}
	public static int[] expand(int [] arr) {//0x0000A001
		int [] newNums = new int[arr.length*2];//构造，开辟新空间 0x0000B002
		//复制
		for (int i = 0; i < arr.length; i++) {
			newNums[i] = arr[i];
		}
		return newNums;//0x0000B002
	}
}
