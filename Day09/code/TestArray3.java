package com.duan.day05;

public class TestArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JDK1.5������ǿforѭ��
		//JDK1.5������ǿforѭ��ֻ�������������������ʹ���±�
		
		//�������� [] ������ = new �������� [����];
		int [] nums = new int[5];
		
		//����Ԫ��
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		//��������
		System.out.println("ͨ��forѭ��������");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		//ͨ����ǿforѭ���������е�ֵ���μ�1
		
		System.out.println("ͨ����ǿforѭ��������");
		//��ʱ����i��foreach��ǿ��forѭ��ֻ����������������൱�ڽ���Щ�����ó����ݴ�
		for (int i : nums) {
			i += 1;
			System.out.println(i);
		}
		
		//��������
		System.out.println("ͨ��forѭ��������");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
