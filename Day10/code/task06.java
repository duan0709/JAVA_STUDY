package com.duan.day06;

public class task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//选择排序 给定一个数组：int[] a = {1,3,2,7,5}利用冒泡排序对其按照从小到大的顺序排序，然后输出结果。
		int[] a = {1,3,2,7,5};
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.print("按照从小到大的顺序排序为：");
		for (int b : a) {
			System.out.print(b+"\t");
		}
	}

}
