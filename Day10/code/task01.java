package com.duan.day06;

public class task01 {

	static int [] nums = {1,5,3,5,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//дһ������������һ�����������ƽ��ֵ
		avg();
	}
	public static void avg() {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("ƽ��ֵ�ǣ�"+sum/nums.length);
	}

}
