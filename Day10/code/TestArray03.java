package com.duan.day06;

public class TestArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������ͷ���ֵ
		int [] nums = {111,222,333,444,555};//�����ַΪ0x0000A001
				
		expand(nums);//0x0000B002 û�н��յģ��ͷ�
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
	}
	public static int[] expand(int [] arr) {//0x0000A001
		int [] newNums = new int[arr.length*2];//���죬�����¿ռ� 0x0000B002
		//����
		for (int i = 0; i < arr.length; i++) {
			newNums[i] = arr[i];
		}
		return newNums;//0x0000B002
	}
}
