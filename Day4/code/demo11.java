package com.duan.day2;

//1������
import java.util.Scanner;

public class demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*java�ɼ�����98�֣�����html�ɼ�����80�֣���ʦ������������java�ɼ�����100�֣�Html�ɼ�����70�֣���ʦҲ���Խ�������*/
        //2������Scanner
        Scanner input = new Scanner(System.in);
        //3�����ճɼ�
         System.out.println("����������java�ɼ�");
        double javaScore = input.nextDouble();
        System.out.println("����������html�ɼ�");
        double htmlScore = input.nextDouble();
        //4���ж�
        if((javaScore > 98 && htmlScore > 80) || (javaScore == 100 && htmlScore > 70)){
          System.out.println("����һ������");  
        }
        System.out.println("�������");
	}

}
