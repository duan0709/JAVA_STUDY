package com.duan.day2;

import java.util.Scanner;

public class demo15 {

	public static void main(String[] args) {
		//如果是男生送名牌手表，否则送lv包包。
		System.out.println("请输入：（男生/女生）");
		Scanner input = new Scanner(System.in);
		String sex = input.next();
		gift(sex);
		
	}
	public static void gift(String sex) {
		if (sex.equals("男生")) {
			System.out.println("送名牌手表");
		} else if(sex.equals("女生")){
			System.out.println("送lv包包");
		}else {
			System.out.println("请输入合法值");
			Scanner input = new Scanner(System.in);
			String isSex = input.next();
			gift(isSex);
		}
	} 

}
