package com.duan.day03;

public class demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        ���󣺼���1+2+...+99+100���ܺ�
        ���������
        1��ֱ�Ӵ�ӡ
        2����ʽ
        3��ѭ��
        4������1������i������1������sum
        5������100������������1������sum
        */
        
        /*
            int i = 1;
            int sum = 0;
            sum += i;
            i++;
            sum += i;
            i++;
            sum += i;
            i++;
            sum += i;
            i++;
        */
        int i = 1;//1����ʼ����
        int sum = 0;//2�������ж�
        while(i <= 100){//3��ѭ������
            sum += i;
            i++;//4����������
        }
        System.out.println(sum);
	}

}
