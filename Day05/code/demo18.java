package com.duan.day03;

import java.util.Scanner;

public class demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        ���󣺼��������࣬ÿ����5��ͬѧ��ƽ���ɼ�
        */
        Scanner input = new Scanner(System.in);
        for(int i = 1;i <= 3;i++){
            double sum = 0;
            for(int j = 1;j <= 5;j++){
                System.out.println("�������"+j+"��ѧԱ�ĳɼ���");
				double score=input.nextDouble();
				sum+=score;
            }
            double avg=sum/5;
            System.out.println("��"+i+"����ģ�5��ѧԱƽ�����ǣ�"+avg+"�֡�");
        }
	}

}
