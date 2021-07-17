package com.duan.day03;

import java.util.Scanner;

public class task02 {
	/*
	if语句）计算销售总金额
	图书批发商店的某本书的零售价是26.5元/本，
	如果客户一次性购买100本以上（包括100本），则每本的价格打9折
	如果客户一次性购买500本以上（包括500本），则每本的价格打8折并返回1000元给客户，
	请分别计算购买8本、150本、600本的应付金额是多少。要求购买书的数量从控制台输入。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double book = 26.5;
		System.out.println("请输入要购买几本书");
		int sum = input.nextInt();
		isSum(sum);
		double money =input.nextDouble();
	}
	public static void isSum(int sum) {
		if (sum > 0 && sum <= 100) {
			System.out.println("您购买了"+sum+"本书，应付金额为"+sum*26.5+"元");
		}
		if (sum >= 100 && sum < 500) {
			System.out.println("您购买了"+sum+"本书，应付金额为"+sum*26.5*0.9+"元");
		}
		if (sum >= 500) {
			System.out.println("您购买了"+sum+"本书，应付金额为"+sum*26.5*0.8+1000+"元");
		}
	}

}
