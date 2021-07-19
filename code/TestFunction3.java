package com.duan.day04;

public class TestFunction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("窗前明月光");
		int a = 9;
        printSign(a);
        //printSign(9);也可
        System.out.println("疑是地上霜");
        printSign(8);
        System.out.println("举头望明月");
        printSign(7);
        System.out.println("低头思故乡");
        printSign(6);
	}
	//定义一个打印count个-的功能
	public static void printSign(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
