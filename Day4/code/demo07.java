package com.duan.day2;

public class demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
        // byte  short int long float double
        int a = 10;
        double b = 20.5;
        double result1 = a + b;
        System.out.println(result1);
        
        int c = 5;
        float d = 1.2F;
        float result2 = c + d;
        System.out.println(result2);
        
        int e = 100;
        long f = 50L;
        long result3 = e + f;
        System.out.println(result3);
        
        byte g = 10;
        int h = 20;
        int result4 = g + h;
        System.out.println(result4);
        
        byte j = 5;
        short k = 5;
        int result5 = j + k;//ע������Ϊint
        System.out.println(result5);
        //���⣺�κ�������String��ӣ�+��ʱ��ʵΪƴ�ӣ������Զ�����ΪString��
        /*
        	�ھ���+�������ַ�����������ΪString����
				+�������ַ�������+����������ӷ�����
        */
        System.out.println(12 + 34);
        System.out.println(12 + 'A' + 34);//12+65+34=111
        System.out.println(12 + 3.14);
        System.out.println(12 + "����" + 34);
        
 		//����������ת��Ϊ�ַ������ͣ��ӿ��ַ���""
        //System.out.println(12 + "" + 34);
	}

}
