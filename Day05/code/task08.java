package com.duan.day03;

public class task08 {

	public static void main(String[] args) {
		/*（while/do while循环）把
		计算1+2+3+...+100 的和,计算1+3+5+...+99 的和
 		两题用while 循环或do...while 循环改写。
		*/
		int i = 1,j = 1,m = 1,n = 1;
		int sum1 = 0,sum2 = 0,sum3 = 0,sum4 = 0;
		
		while (i <= 99) {
			sum1 += i;
			i += 2;
		}
		System.out.println("1+3+5+...+99 的和用while计算："+sum1);
		
		do {
			sum2 += j;
			j += 2;
		} while (j <= 99);
		System.out.println("1+3+5+...+99 的和用do while计算："+sum2);
		
		while (m <= 100) {
			sum3 += m;
			m++;
		}
		System.out.println("1+3+5+...+100 的和用while计算："+sum3);
		
		do {
			sum4 += n;
			n++;
		} while (n <= 100);
		System.out.println("1+3+5+...+100 的和用do while计算："+sum4);
	}
	
}
