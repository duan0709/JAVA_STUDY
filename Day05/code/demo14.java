package com.duan.day03;

import java.util.Scanner;

public class demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        ����1���༶��5��ͬѧ����ͨ������̨����5��ͬѧ�ķ�����
        ������ƽ���֣����¼�����Ϊ��ֵ����ʾ�û�����
        */
        Scanner input = new Scanner(System.in);
        //boolean flag = true;//���벼��ֵ���ж�
        double sum = 0;
        int i =1;
        for(;i <= 5;i++){
            System.out.println("�������"+i+"��ѧԱ�ĳɼ���");
            double score = input.nextDouble();
            if(score < 0){
                System.out.println("�ɼ�����Ϊ��ֵ");
                //flag = flalse//С��0��������Ϊ��
                break;
            }
            sum += score;
        }
        
        /*
        if(flag){
            souble avg = sum / 5;
            System.out.println("ƽ�����ǣ�"+avg+"�֡�")
        }
        */
        if(i == 6){//���û�и�ֵ��i�ĸ���Ϊ6��
            double avg = sum / 5;
            System.out.println("ƽ�����ǣ�"+avg+"�֡�");
        } 
	}

}
