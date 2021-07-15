package com.duan.day2;

import java.util.Scanner;

public class demo17 {

	public static void main(String[] args) {
		/*
		我想买车，买什么车决定于我在银行有多少存款	
		如果我的存款超过500万，我就买保时捷
		否则，如果我的存款超过100万，我就买路虎
		否则， 如果我的存款超过50万，我就买宝马
		否则， 如果我的存款超过10万，我就买大众
		否则， 如果我的存款10万以下 ，我买捷安特
		 */
		System.out.println("存款共有：（单位：万元）");
		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		if (money >= 500) {
			System.out.println("买保时捷");
		}
		if (money >= 100 && money < 500) {
			System.out.println("买路虎");
		}
		if (money >= 50 && money < 100) {
			System.out.println("买宝马");
		}
		if (money >= 10 && money < 50) {
			System.out.println("买大众");
		}
		if (money < 10) {
			System.out.println("买捷安特");
		}
	}

}
