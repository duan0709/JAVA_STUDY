package com.duan.day03;

public class task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//（for循环）计算2000年1月1日到2008年1月1日相距多少天。（注意闰年）
		int count = 0,sum = 0;
		for (int i = 2000; i < 2008; i++) {
			if ((i % 4 == 0 && i % 100 != 0)||(i % 100 == 0 && i % 400 == 0)) {
				count++;
			}
			sum = count*366+(8-count)*365;
		}
		System.out.println("2000年1月1日到2008年1月1日相距"+sum+"天");
	}

}
