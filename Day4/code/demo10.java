package com.duan.day2;

//1������
import java.util.Scanner;

public class demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���java�ɼ�����90������һ������
        //2������Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("����������java�ɼ���");
        //3����input����double���͵�ֵ nextDouble();
        double score = input.nextDouble();
        //4���ж�
        if(score > 90){
          System.out.println("����һ������");  
        }
        System.out.println("�������");
	}

}
