package com.duan.day03;
//1������
import java.util.Scanner;

public class demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����̨��������n������n�Ľ׳ˣ�!n��������1*2*...*n
        //2������Scanner
        Scanner input = new Scanner(System.in);
        //3����������
        System.out.println("������һ��������");
        int n = input.nextInt();
        //4������n�Ľ׳ˣ�!n��
        /*������Ĭ��ֵ��int�����ȡֵ��Χ��2147483647
        �������13�Ľ׳˳�Խ��ȡֵ��Χ��ֵ��׼ȷ��*/
        long sum = 1;
        for(int i = 1;i <= n;i++){
            sum *= i;
        }
        System.out.println(n+"�Ľ׳��ǣ�"+sum);
        System.out.println("�������");
	}

}
