package com.duan.day2;

public class demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        赋值运算符
        // = += -= *= /= %=
        */
        /*
        int a = 10;
        a = a + 5;
        System.out.println(a);
        */
        int a = 10;
        a += 5;//相当于a = a + 5;
        System.out.println(a);
        
        int b = 10;
        b *= 3;//相当于b = b * 10;
        System.out.println(b);
        
        int c = 20;
        c /= 3;//c = c/3;
        System.out.println(c);
        
        int d = 20;
        d %= 3;//c = c%3;
        System.out.println(d);
        
        
        //面试题
        /*
        byte y = 5;
        y = y+1;//类型不兼容，强转y = (byte)(y+1);可以
        System.out.println(y);
        */
        byte y = 5;
        y += 1;//这样运行不报错
        System.out.println(y);
	}

}
