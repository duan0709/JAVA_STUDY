package com.duan.day04;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//쳲���������
		/*
		F(0)=0��F(1)=1, F(n)=F(n - 1)+F(n - 2)��n �� 2��n �� N*��
		0 1 1  2   3  5  8  13  21 34 55
		0 1 2  3   4  5  6  7   8
		*/
		int result = feibo(9);
		System.out.println(result);
	}
	public static int feibo(int num) {
		if(num == 1 ||num == 2) {
			return 1;
		} else {
			return feibo(num - 1) +feibo(num - 2);
		}
	}

}
