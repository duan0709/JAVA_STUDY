package com.duan.day05;

public class Test {
	// 1����������
	static int[] nums = new int[5];//nums���Ǿ�̬ȫ�ֱ����������ɾ�̬ȫ�ֱ���
	//��ЧԪ�ظ��� �����±����ЧԪ�ظ������ ����̶�λ��
	//static int size = 3;
	static int size = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������������ɾ�Ĳ�

		
		
		//2����ֵ
		/*nums[0] = 11;
		nums[1] = 22;
		nums[2] = 33;*/
		insert(0, 11);
		insert(1, 22);
		insert(2, 33);
		
		//��������
		printArray();
		
		insert(3, 44);
		
		//��ӷ���
		insert(0,88);
		
		
		/*
		int target = search(4);
		System.out.println(target);
		*/
		/*
		replace(0, 100);
		printArray();
		*/
		delete(0);
		printArray();
	}
	//����һ������Ϊnums���������ֵ
	public static void insert(int position,int value) {
		//��������
		if (size == nums.length) {
			expand();
		}
		
		//��Чλ�õ��ж�
		if (position < 0 || position > size) {
			System.out.println("����λ������������0~"+size+"֮���ֵ");
			return;
		}
		/*
		//�������ҵ�Ϊ0�Ŀ�λ�ò����ȥ
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				//�ҵ�һ����λ�ò���
				nums[i] = value;
				break;
			}
			
		}
		*/
		//������ͬ��д ������ֵ nums[size++] = value;
		/*
		nums[size] = value;
		size++;
		*/
		//�ƶ�Ԫ��ͬʱ����ֵ
		for (int i = size; i > position; i--) {
			nums[i] = nums[i-1];
		}
		nums[position] = value;
		size++;
	}
	//���ݵķ���
	public static void expand() {
		System.out.println("��ʼ������");
		int [] newNums = new int[nums.length*2];
		System.arraycopy(nums, 0, newNums, 0, nums.length);
		//��ַ�滻
		nums = newNums;
	}
	
	//ɾ�����ܣ����ݶ�Ӧλ��ɾ����Ӧֵ����λ�ú��ֵ������ǰ�ƣ�
	public static void delete(int position) {
		//��Чλ�õ��ж�
		if (position < 0 || position > size) {
			System.out.println("����λ������������0~"+size+"֮���ֵ");
			return;
		}
		for (int i = position; i <size - 1; i++) {
			nums[i] = nums[i+1];
		}
		size--;
	}
	
	//�滻���ܣ���ԭλ�õ�ֵ�滻����ֵ��
	public static void replace(int position,int value) {
		//��Чλ�õ��ж�
		if (position < 0 || position > size) {
			System.out.println("����λ������������0~"+size+"֮���ֵ");
			return;
		}
		nums[position] = value;
	}
	
	//���ҹ��ܣ�ͨ���±��ȡ��Ӧ��ֵ��
	public static int search(int position) {
		
		//��Чλ�õ��ж�
		if (position < 0 || position > size) {
			System.out.println("����λ������������0~"+size+"֮���ֵ");
			return -1;//�����⣨-1����û�ж�Ӧ���±꣩��ʱ����
		}
		return nums[position];
	}
	
	//��������ķ���
	public static void printArray() {
		//3������
				for (int i = 0; i < nums.length; i++) {
					System.out.println(nums[i]+"\t");
				}
				System.out.println();
	}

}
