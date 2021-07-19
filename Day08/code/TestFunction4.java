package com.duan.day04;

public class TestFunction4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("窗前明月光");
        printSign(9,'#');
        System.out.println("疑是地上霜");
        printSign(9,'-');
        System.out.println("举头望明月");
        printSign(9,'+');
        System.out.println("低头思故乡");
        printSign(9,'*');
	}
	//定义一个打印count个任意符号的功能
	public static void printSign(int count,char sign) {
		for (int i = 1; i <= count; i++) {
			System.out.print(sign);
		}
		System.out.println();
	}

}
