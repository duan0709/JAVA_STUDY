package com.duan.day06;

public class task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ�����飬��������е����ֵ����Сֵ��
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
		System.out.println("���ֵ�ǣ�"+max+"��Сֵ�ǣ�"+min);
	}

}
