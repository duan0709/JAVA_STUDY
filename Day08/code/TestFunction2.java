package com.duan.day04;

public class TestFunction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("窗前明月光");
		printSign();
        System.out.println("疑是地上霜");
        printSign();
        System.out.println("举头望明月");
        printSign();
        System.out.println("低头思故乡");
        printSign();
	}
	//定义一个打印9个-的功能
	public static void printSign() {
		for (int i = 1; i <=9 ; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
