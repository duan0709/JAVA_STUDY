package com.duan.day03;

import java.util.Scanner;

public class demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        需求：计算三个班，每个班5名同学的平均成绩
        */
        Scanner input = new Scanner(System.in);
        for(int i = 1;i <= 3;i++){
            double sum = 0;
            for(int j = 1;j <= 5;j++){
                System.out.println("请输入第"+j+"名学员的成绩：");
				double score=input.nextDouble();
				sum+=score;
            }
            double avg=sum/5;
            System.out.println("第"+i+"个班的，5名学员平均分是："+avg+"分。");
        }
	}

}
