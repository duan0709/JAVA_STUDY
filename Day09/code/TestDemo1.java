package com.duan.day05;

public class TestDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 ����һ���������飬ͳ������������Ԫ�ص�ƽ��ֵ
		 */
		
		//1������һ����������
		//��������
		//��������[] ������ = new �������� []{value1,value2value3,...};
		int [] score = new int[] {90,85,60,89};
		//2��ͳ������������Ԫ�صĺ�
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		//3����ƽ���� ע�����ͣ�ǿתdouble
		double avg = (double)sum / score.length;
		System.out.println("ƽ�����ǣ�"+avg+"��");
	}

}
