package com.duan.day07;
/**
 * ������
 * ��ѧ��������������н��б���
 */
public class TestStudent {
	public static void main(String[] args) {
		//�������ѧ������
		Student xm = new Student();
		
		//Ϊ��������Խ��и�ֵ
		xm.name = "С��";
		xm.age = 18;
		xm.sex = "��";
		xm.score = 80;
		
		//�����÷���
		//������.������();
		xm.sayHi();
		
		
		Student xh = new Student();
	
		xh.name = "С��";
		xh.age = 18;
		xh.sex = "Ů";
		xh.score = 88;
		
		xh.sayHi();
		
		System.out.println("=====================");
		//���鶨�巽ʽ
		//�������� [] ������ = new �������� [����];
		/*
		int[] nums = new int[2];
		nums[0] = a;
		nums[1] = 22;
		
		Student[] stus = new Student[2];
		stus[0] = xm;
		stus[1] = xh;
		*/
		//�������� [] ������ = new ��������[]{value1,value2,...};
		/*
		int[] nums = new int[] {a,22};
		Student [] stus = new Student[] {xm,xh};
		*/
		//�������� [] ������ = {value1,value2,...};
		/*
		int nums = {a,22};
		Student[] stus = {xm,xh};
		*/
		Student[] stus= {xm,xh};
		/*
		for (int i = 0; i < stus.length; i++) {
			stus[i].sayHi();
		}
		*/
		/*
		 * ��������
		for (Student num : nums) {
			System.out.println(num);//11,12
		}
		*/
		//��ѧ��������������в����б���
		for (Student stu : stus) {
			//xm.sayHi();
			stu.sayHi();
		}
	}
}
