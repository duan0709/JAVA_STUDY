package com.duan.day05;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����ı���
		// ����������ռ�
		// ���ڴ��У����볤��Ϊ5�������ռ䣬�洢5��int���͵�ֵ
		// �������� [] ������ = new �������� [����];
		
		int[] nums = new int[5];
		
		//����Ԫ�� ��ֵ
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		//����Ԫ�� ȡֵ
		System.out.println(nums.length);
		
		//����ı���
		System.out.println("ͨ��forѭ������");
		//�±��0��ʼ��С�����鳤��
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		/*
		 ��ǿforѭ��
		 */
		System.out.println("ͨ����ǿforѭ��������");
		for (int n : nums) {//��nums�����е�Ԫ��ȡ�������θ�ֵ������n
			System.out.println(n);
		}
	}

}
