package com.duan.day08.oop.bank;

import java.util.Random;

public class random {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			int r = random.nextInt(a.length);
			System.out.print(a[r]);
		}
	}
}
