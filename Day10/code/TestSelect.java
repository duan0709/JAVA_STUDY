package com.duan.day06;

public class TestSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ѡ�����򣺹̶�ֵ������ֵ���αȽϴ�С������λ��
		int [] nums = {4,3,5,2,1};
		for (int i = 0; i < nums.length - 1; i++) {//��������
			//��������Ƚ�
			for (int j = i + 1; j < nums.length; j++) {//���ƴ���
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
