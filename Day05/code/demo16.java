package com.duan.day03;

import java.util.Scanner;

public class demo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        ����1���༶��5��ͬѧ����ͨ������̨����5��ͬѧ�ķ�����������ƽ����
        ͳ��80�����Ϸ���ѧԱ��ռ����
        */
        Scanner input = new Scanner(System.in);
        int total = 0;
        for(int i = 1;i <= 5;i++){
            System.out.println("�������"+i+"��ѧԱ�ĳɼ���");
            double score = input.nextDouble();
            if(score < 80){
                continue;
            }
            total++;//����
        }
        double rate = (double)total / 5;//double�����Զ�ת��
        System.out.println("ͳ��80�����Ϸ�����ѧԱ��ռ����"+rate*100+"%");
	}

}
