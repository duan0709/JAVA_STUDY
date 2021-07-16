package com.duan.day03;

public class demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//计算1~100之间，所有偶数的和
        /*
        int i = 0;
        int sum = 0;
        while(i <= 100){
            if(1 % 2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("和是"+sum);
        System.out.println("程序结束");
        */
        int i = 0;
        int sum = 0;
        while(i <= 100){
            sum += i;
            i += 2;
        }
        System.out.println("和是："+sum);
        System.out.println("程序结束");
	}

}
