package com.duan.day06;

public class TestDArray1 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//�����ά����                         ��        ��   
		//�������� [][] ������ = new ��������[��ά����][��ά����];
		//�������� ������[][] = new ��������[��ά����][��ά����];
		
		int [][] nums = new int[3][5];
		//int nums [][] = new int[3][5];
		
		//��ֵ
		nums[0][0] = 10;//��һ�е�һ��
		nums[0][3] = 20;
		nums[1][0] = 30;
		nums[1][1] = 40;
		nums[2][2] = 50;
		nums[2][4] = 60;
		
		//ȡֵ
		System.out.println(nums.length);//��3
		System.out.println(nums[0].length);//���ʵ�ά���� �׸���ά����ĳ��� ��5
		System.out.println(nums[1].length);//��5
		System.out.println(nums[2].length);//��5
		
		//������ά����
		for (int i = 0; i < nums.length; i++) {//������ i = 0,1...
			for (int j = 0; j < nums[i].length; j++) {//������
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
		
		//��ά�����е�ÿһ��Ԫ�أ������˵�ά����ĵ�ַ������array[0]�ȼ����ڷ���0x0000A111
		System.out.println(nums);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
	}

}
