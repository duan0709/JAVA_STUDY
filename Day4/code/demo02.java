package com.duan.day2;

public class demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        一元运算符 ++ --
        ++ 自增1
        1）如果++是一条语句 a++;与++a;都等价于a=a+1;
        */
        /*
        int a = 12;
        a = a + 1;
        System.out.println(a);
        */
        int a = 12;
        a++;
        //同上述结果一样，a++;替换成++a;结果也一样 
        //--自减1同理
        System.out.println(a);
        
        
        /*
        2）如果++不是一条语句 区分a++与++a
        a++ 先操作再运算 拿原值操作 运算再自增1
        ++a 先运算再操作 拿原值先自增1 拿着自增后的值操作
        【本质上看其先运算还是先操作】
        */
        
        /*
        int a = 12;
        int b = a++;//int b = a; 再运算a++
        System.out.println(a);//13
        System.out.println(b);//12
        */
        
        /*
        int a = 12;
        int b = ++a;//先运算++自增1，a=13，再操作 int b=a
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
