package com.duan.day03;
//1������
import java.util.Scanner;

public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
        ����1���༶��5��ͬѧ����ͨ������̨����5��ͬѧ�ķ�����������ƽ����
        */
        //2������Scanner
        Scanner input = new Scanner(System.in);
        //3����������
        double sum = 0;
        /*
        System.out.println("�������1��ѧԱ�ĳɼ���");
        double score = input.nextDouble();
        sum += score;
        System.out.println("�������2��ѧԱ�ĳɼ���");
        double score = input.nextDouble();
        sum += score;
        System.out.println("�������3��ѧԱ�ĳɼ���");
        double score = input.nextDouble();
        sum += score;
        */
        for(int i = 1;i <= 5;i++){
            System.out.println("�������"+i+"��ѧԱ�ĳɼ���");
        	double score = input.nextDouble();
        	sum += score;
        }
        //4����ƽ����
        double avg = sum / 5;
        System.out.println("ƽ�����ǣ�"+avg+"��");
	}

}
