package com.duan.day04;

import java.util.Scanner;

public class task07 {

	public static void main(String[] args) {
		/*
		 ��֤��°ͺղ��룺�κ�һ������6��ż�������ֽܷ�����������ĺ͡�Ҫ������һ�����������������ܱ��ֽ�������������ĺ͡�
		eg : 14
		14=3+11
		14=7+7
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����");
		int n = input.nextInt();
		isPrime(n);
	}
	
	public static boolean isPrime(int n) {
	    if (n <= 3) {
	        return n > 1;
	    }
	    //ֻ���ж�һ�����ܷ�С��sqrt(n)����������
	    int sqrt = (int)Math.sqrt(n);
	    for (int i = 3; i <= sqrt; i += 2) {
	        if(n % 2 == 0 || n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	
}
