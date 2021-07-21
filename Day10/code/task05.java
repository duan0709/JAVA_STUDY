package com.duan.day06;

public class task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//完成数组的冒泡排序算法。给定一个数组：int[] a = {1,3,2,7,5}利用冒泡排序对其按照从小到大的顺序排序，然后输出结果。
		int[] a = {1,3,2,7,5};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("从小到大排序结果为：");
		for (int i : a) {
			System.out.print(i+"\t");			
		}
	}

}
