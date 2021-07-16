package com.duan.day03;

import java.util.Scanner;

public class demo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        现有1个班级的5名同学，请通过控制台输入5名同学的分数，并计算平均分
        统计80分以上分数学员所占比例
        */
        Scanner input = new Scanner(System.in);
        int total = 0;
        for(int i = 1;i <= 5;i++){
            System.out.println("请输入第"+i+"名学员的成绩：");
            double score = input.nextDouble();
            if(score < 80){
                continue;
            }
            total++;//计数
        }
        double rate = (double)total / 5;//double类型自动转换
        System.out.println("统计80分以上分数数学员所占比例"+rate*100+"%");
	}

}
