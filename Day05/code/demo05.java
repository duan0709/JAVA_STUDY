package com.duan.day03;

public class demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        需求：计算1+2+...+99+100的总和
        解决方案：
        1、直接打印
        2、公式
        3、循环
        4、声明1个变量i，声明1个变量sum
        5、声明100个变量，声明1个变量sum
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
        int i = 1;//1、初始部分
        int sum = 0;//2、条件判断
        while(i <= 100){//3、循环操作
            sum += i;
            i++;//4、迭代部分
        }
        System.out.println(sum);
	}

}
