package com.duan.day03;
//1、导包
import java.util.Scanner;

public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
        现有1个班级的5名同学，请通过控制台输入5名同学的分数，并计算平均分
        */
        //2、创建Scanner
        Scanner input = new Scanner(System.in);
        //3、接收数据
        double sum = 0;
        /*
        System.out.println("请输入第1名学员的成绩：");
        double score = input.nextDouble();
        sum += score;
        System.out.println("请输入第2名学员的成绩：");
        double score = input.nextDouble();
        sum += score;
        System.out.println("请输入第3名学员的成绩：");
        double score = input.nextDouble();
        sum += score;
        */
        for(int i = 1;i <= 5;i++){
            System.out.println("请输入第"+i+"名学员的成绩：");
        	double score = input.nextDouble();
        	sum += score;
        }
        //4、求平均分
        double avg = sum / 5;
        System.out.println("平均分是："+avg+"分");
	}

}
