package com.duan.day2;
//导包
import java.util.Scanner;

public class demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 输入四位数字的会员号
		 百位数字等于产生的随机数字即为幸运会员
		 提示恭喜您中奖了，否则没中奖
		 */
		//2、创建Scanner
		Scanner input = new Scanner(System.in);
		//3、接收输入四位数字的会员号
		System.out.println("请输入四位数字的会员号：");
		int cartNo = input.nextInt();
		//百位数字等于产生的随机数字即为幸运会员
		int ge = cartNo % 10;
		int shi = cartNo / 10 % 10;
		int bai = cartNo / 100 % 10;
		int qian = cartNo / 1000 % 10;
		System.out.println("千位是"+qian+"百位是"+bai+"十位是"+shi+"个位是"+ge);
		int random =(int)(Math.random()*10);
		System.out.println(random);
		if (bai == random) {
			System.out.println("恭喜你中奖了！");
		} else {
			System.out.println("没中奖");
		}
		System.out.println("程序结束");
	}

}
