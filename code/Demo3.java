package com.duan.day04;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʹ�õݹ�ʵ��10���ڵĽ׳�
		//�з���ֵ���η���
		int result = jiecheng(5);
		System.out.println("�׳��ǣ�"+result);
	}
	public static int jiecheng(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}else {
			return num*jiecheng(num-1);
		}
	}
}
