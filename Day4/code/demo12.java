package com.duan.day2;

//1������
import java.util.Scanner;

public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
		����������500�����򳵡��򷿡�ŷ��	���Σ����������
		Ҫ�����̨�����Ƿ��н�
		�ַ����Ƚ�ʹ��equals()����
		������if-else
		ֵ�ıȽ�
		������������
		��ֵ�ж� 1 == 1 '��' == '��'
			������������
		��ֵ�жϣ���ֵַ��
			�ַ������ݱȽ� equals()
	*/
	        //2������Scanner
	        Scanner input = new Scanner(System.in);
	        //3����������
	        System.out.println("�������Ƿ��н�");
	        /*
	        char answer = input.next().charAt(0);
	        //4���ж�
	        if('��' == answer){
	            System.out.println("�򳵡��򷿡�ŷ������");
	        }else{
	            System.out.println("������");
	        }
	        */
	        String answer = input.next();
	        if("��".equals(answer)){
	            System.out.println("�򳵡��򷿡�ŷ������");
	        }else{
	            System.out.println("������");
	        }
	        System.out.println("�������");
	}

}
