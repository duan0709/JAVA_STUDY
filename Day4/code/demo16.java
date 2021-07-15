package com.duan.day2;

import java.util.Scanner;

public class demo16 {

	public static void main(String[] args) {
		/*输入四个季节：
		 如果春天，输出“春暖花开”，
		 如果是夏天，输出“夏日炎炎”,
		 如果是秋天，则输出"秋高气爽",
		 如果是冬天，则输出"安静祥和"。*/
		System.out.println("请输入季节：");
		Scanner input = new Scanner(System.in);
		String season = input.next();
		if (season.equals("春天")||season.equals("夏天")||season.equals("秋天")||season.equals("秋天")) {
			if(season.equals("春天")) {
				System.out.println("春暖花开");
			}
			if (season.equals("夏天")) {
				System.out.println("夏日炎炎");
			}
			if (season.equals("秋天")) {
				System.out.println("秋高气爽");
			}
			if (season.equals("秋天")) {
				System.out.println("安静祥和");
			}
		}else {
			System.out.println("请输入合理的季节！！！");
		}
	}

}
