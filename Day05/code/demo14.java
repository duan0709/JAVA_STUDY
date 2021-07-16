package com.duan.day03;

import java.util.Scanner;

public class demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        现有1个班级的5名同学，请通过控制台输入5名同学的分数，
        并计算平均分，如果录入分数为负值，提示用户结束
        */
        Scanner input = new Scanner(System.in);
        //boolean flag = true;//引入布尔值，判断
        double sum = 0;
        int i =1;
        for(;i <= 5;i++){
            System.out.println("请输入第"+i+"名学员的成绩：");
            double score = input.nextDouble();
            if(score < 0){
                System.out.println("成绩不能为负值");
                //flag = flalse//小于0，将其置为负
                break;
            }
            sum += score;
        }
        
        /*
        if(flag){
            souble avg = sum / 5;
            System.out.println("平均分是："+avg+"分。")
        }
        */
        if(i == 6){//如果没有赋值，i的个数为6个
            double avg = sum / 5;
            System.out.println("平均分是："+avg+"分。");
        } 
	}

}
