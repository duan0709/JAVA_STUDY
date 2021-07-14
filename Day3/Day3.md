# Day3

> 前面是概述和环境搭建，接下来准备语言基础

## 3.1 变量

* 概念：简单来理解就是可以改变的量

* 变量组成三要素：数据类型、变量名、值

```java
public class TestVariable1{
    public static void main(String[] args){
        //声明变量，数据类型 变量名
        int money;
        //赋值
        money = 100;
        //输出
        System.out.println(money);
    }
}
```

* 变量的定义方式

1、先声明，再赋值

> 数据类型 变量名;
>
> 变量名 = 值;

2、声明并赋值

> 数据类型 变量名 = 值;

3、多个同类型变量的声明与赋值

```java
public class TestVariable{
    public static void main(String[] args){
        //先声明，再赋值
        int age;
        age = 18;
        System.out.println(age);
        //声明并赋值
        int length = 18;
        System.out.println(length);
        //多个同类型变量的声明与赋值
        int a,b,c;
        a = 5;
        b = 6;
        c = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
```



## 3.2 数据类型

* 基本数据类型（四类八种）

1、数值型

> 整型 byte【1字节】、short【2字节】、int【4字节】、long【8字节】
>
> 浮点型 float【4字节】、double【8字节】

2、非数值型

> 字符型 char【2字节】
>
> 布尔型 boolean

* 引用数据类型

> 字符串 String
>
> 数组
>
> 对象

```java
public class TestType{
    public static void main(String[] args){
        
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
    }
}
```

```java
public class TestFloatAndDouble{
    public static void main(String[] args){
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
        double d4 = 2E3;//相当于2*10^3
        System.out.println(d4);
        
        //表示的数字大时会使用科学计数法表示，例如，下面会输出1.7E22（相当于1.7*10^22）
        double d5 =17000000000000000000000.0;
        System.out.println(d5);
        
        //尽量不使用他们计算
        double d6 = (1.4-0.5)/0.9;
        System.out.println(d6);
    }
}
```

```java
public class TestBoolean{
	public static void main(String[] args){
        //boolean变量，不参与运算
        //可直接赋值为true/false
        boolean b1 = true;
        System.out.println(b1);
        
        //可赋值为一个结果为true/false的表达式
        boolean b2 = 5>2;
        System.out.println(b2);
    }
}
```

```java
public class TestCharacter1{
    public static void main(String[] args){
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
    }
}

```

```java
public class TestString{
    public static void main(String[] args){
        //字符串
        String s = "HelloJava";
        System.out.println(s);
        //如果要打两个斜杠“\\”应该String c9 = '\\\\'这样写
        String c9 = "\\\\";
        System.out.println(c9);
    }
}
```



## 3.3 运算符

## 3.4 类型转换

```java
public class TestConvert1{
    public static void main(String[] args){
        /*
        	类型转换（基本数据类型）
        	一、自动转换
        	1、转换的两种数据类型要兼容
        	2、目标类型大于原类型（自动往高类型转换）
        	【从小到大】byte--short--int--long--float--double
        	char--int
        */
        byte b = 100;
        short s = b;
        int i = s;
        long l = i;//不需加L，没越界
        System.out.println(l);
    }
}
```

```java
public classTestConver2{
    public static void main(String[] args){
        /*
        二、强制类型转换
        	1、转换的两种数据类型要兼容
        	2、目标类型小于原类型（强制转换称更低的类型）
        	【从大到小】
        */
        short s = 123;
        byte b = (byte)s;
        System.out.println(b);
        
        int i = 65;
        char c = (char)i;
        System.out.println(c);
        
        //double转int，越界，精度有损失，小数点全舍掉了
        double d = 3.14;
        int ii = (int)d;
        System.out.println(ii);
    }
}
```

```java
public class TestConvert3{
	public static void main(String[] args){
        //扩展内容不强制掌握
        short s = 256;
        byte b =(byte)s;
        System.out.println(b);
        /*
        涉及进制转换
        short占2字节共16位，256为10进制转化为2进制0000 0001 0000 0000
        byte占1字节共8位，从右往左截取8位0000 0000
        第一位为符号位，0为正，1为负。
        输出结果为0
        */
    }
}
```

## 3.5 类型提升

## 3.6 控制台录入

## 3.7 其他

> 完成今日思维导图

未完待续...

