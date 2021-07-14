package com.duan.day1;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建byte类型的变量，测试其取值范围
        //数据类型 变量名 = 值;
        byte b = 127;//取值范围 -2^7~2^7-1 超出报错
        System.out.println(b);
        
        //创建short类型的变量，测试其取值范围
        //数据类型 变量名 = 值;
        short s = 32767;//取值范围 -2^15~2^15-1 超出报错
        System.out.println(s);
        
        //创建int类型的变量，测试其取值范围
        //数据类型 变量名 = 值;
        int i = 2147483647;
        System.out.println(i);//取值范围 -2^31~2^31-1 超出报错
        
        //创建long型的变量，测试其取值范围
        //数据类型 变量名 = 值;
        //int为整数的默认类型，如需为long类型赋值较⼤整数时，需在值的后⾯追加“L”。
        long l = 2147483647L;
        System.out.println(l);//取值范围 -2^63~2^63-1 超出报错
        
        //float：单精度 7~8位
        //正数1为整数类型，可以赋值 int可表示范围在float之内
        float f = 1;
        System.out.println(f);
        //【注意】float f1 = 1.2 会报错，因为小数1.2默认为double类型 double比float精度高
        float f1 = 1.2F;
        System.out.println(f1);
        
        //double 双精度 15~16位 【小数默认为double类型】
        double d = 3.14;
        System.out.println(d);
        
        //多种赋值（都可以），在同种变量类型中，变量名不可重复
        double d1 = 2000;
        System.out.println(d1);
        double d2 = 2000.0;
        System.out.println(d2);
        double d3 = 2000D;
        System.out.println(d3);
        double d4 = 2E3;//相当于2乘10^3
        System.out.println(d4);
        
        //表示的数字大时会使用科学计数法表示，例如，下面会输出1.7E22（相当于1.7*10^22）
        double d5 =17000000000000000000000.0;
        System.out.println(d5);
        
        //尽量不使用他们计算
        double d6 = (1.4-0.5)/0.9;
        System.out.println(d6);
        
        //boolean变量，不参与运算
        //可直接赋值为true/false
        boolean b1 = true;
        System.out.println(b1);
        
        //可赋值为一个结果为true/false的表达式
        boolean b2 = 5>2;
        System.out.println(b2);
        
        //字符的三种赋值方式
        //第一种：字符赋值
        char c1 = 'A';
        System.out.println(c1);
        //第二种：整数赋值 0~65535
        char c2 = 65;
        System.out.println(c2);
        //第三种：进制赋值
        char c3 = '\u0041';
        System.out.println(c3);
        
        //转义字符
        /* \n 换行符*/
        /* \t 缩进（制表符）*/
        /* \\ 反斜线*/
        /* \' 单引号*/
        /* \" 双引号*/
        char c4 = '\n';
        System.out.println(c4);
        char c5 = '\t';
        System.out.println(c5);
        char c6 = '\\';
        System.out.println(c6);
        char c7 = '\'';
        System.out.println(c7);
        char c8 = '\"';
        System.out.println(c8);
        
        //字符串
        String s1 = "HelloJava";
        System.out.println(s1);
        //如果要打两个斜杠“\\”应该String c9 = '\\\\'这样写
        String c9 = "\\\\";
        System.out.println(c9);
	}

}
