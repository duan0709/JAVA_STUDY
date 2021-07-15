package com.duan.day2;

public class demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//类型提升
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
        int result5 = j + k;//注意这里为int
        System.out.println(result5);
        //特殊：任何类型与String相加（+）时，实为拼接，其结果自动提升为String。
        /*
        	口诀：+两端有字符串整体提升为String类型
				+两端无字符串类型+算术运算符加法运算
        */
        System.out.println(12 + 34);
        System.out.println(12 + 'A' + 34);//12+65+34=111
        System.out.println(12 + 3.14);
        System.out.println(12 + "哈哈" + 34);
        
 		//将任意类型转换为字符串类型，加空字符串""
        //System.out.println(12 + "" + 34);
	}

}
