package com.duan.day2;

public class demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        һԪ����� ++ --
        ++ ����1
        1�����++��һ����� a++;��++a;���ȼ���a=a+1;
        */
        /*
        int a = 12;
        a = a + 1;
        System.out.println(a);
        */
        int a = 12;
        a++;
        //ͬ�������һ����a++;�滻��++a;���Ҳһ�� 
        //--�Լ�1ͬ��
        System.out.println(a);
        
        
        /*
        2�����++����һ����� ����a++��++a
        a++ �Ȳ��������� ��ԭֵ���� ����������1
        ++a �������ٲ��� ��ԭֵ������1 �����������ֵ����
        �������Ͽ��������㻹���Ȳ�����
        */
        
        /*
        int a = 12;
        int b = a++;//int b = a; ������a++
        System.out.println(a);//13
        System.out.println(b);//12
        */
        
        /*
        int a = 12;
        int b = ++a;//������++����1��a=13���ٲ��� int b=a
        System.out.println(a);//13
        System.out.println(b);//13
        */
        
        
        /*
        int a = 12;
        int b = a++ + 9;//int b = a + 9;
        System.out.println(a);//13
        System.out.println(b);//21
        */
        
        /*
        int a = 12;
        int b = ++a + 9;//int b = 13+9=22;
        System.out.println(a);//13
        System.out.println(b);//22
        */
            
        /*    
        int a = 12;
        int b =(a++ + 3)*2;//int b = (a + 3)*2;
        System.out.println(a);//13
        System.out.println(b);//30
        */
        
        /*    
        int a = 7;
        int b = (a++) + (a++);
        System.out.println(a);//9
        System.out.println(b);//15
        */
        
        int c = 7;
        int d = (c++) + (++c);
        System.out.println(c);//9
        System.out.println(d);//16
	}

}
