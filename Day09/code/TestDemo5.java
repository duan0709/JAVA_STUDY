package com.duan.day05;

public class TestDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ����˼·�� 
		 ��������ԭ���鳤�ȵ������� 
		 ��ԭ�����е�Ԫ�����θ��Ƶ��������С�
		 ͨ��System.arraycopy(ԭ������,��ʼλ��,��������,��������ʼλ��,����Ԫ�ظ���)��ʽ����
		 */
		
		// 1������Դ����
		//�����ռ��СΪ5������
		int[] nums = new int[5];
				
		//2����������
		nums[0]=11;
		nums[1]=22;
		nums[2]=33;
		nums[3]=44;
		nums[4]=55;
				
		//3����������
		System.out.println("ͨ��forѭ������");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
				
		//4������һ��������
		int [] newNums = new int [nums.length*2];
				
		//5����ԭ�����е�Ԫ�ظ��Ƶ���������
		//System.arraycopy(ԭ������,��ʼλ��,��������,��������ʼλ��,����Ԫ�ظ���)
		System.arraycopy(nums, 0, newNums, 0, nums.length);
		//6������������
		System.out.println("ͨ��forѭ������");
		for (int i = 0; i < newNums.length; i++) {
			System.out.println(newNums[i]+"\t");
		}
		System.out.println();
	}

}
