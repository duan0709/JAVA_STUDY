# Day08

> 方法的学习

## 方法



> 概念：实现特定功能的一段代码，**可反复使用**



```java
//语法
public static void 方法名称(){
    //方法主体
}
//将需要在多个位置重复使用的一组代码，定义在方法内部
//方法定义在类的内部，与main方法并列，不可嵌套！
```



```java
public class TestFunction1{
    public static void main(String[] args){
        //直接输出
        System.out.println("窗前明月光");
        System.out.println("---------");
        System.out.println("疑是地上霜");
        System.out.println("---------");
        System.out.println("举头望明月");
        System.out.println("---------");
        System.out.println("低头思故乡");
        System.out.println("---------");
        /*
        1、for循环打印9个-，i<=9
        for (int i = 1; i <=9; i++) {
			System.out.print("-");
			}
		System.out.println();
		}
        */
    }
}
```

## 方法的调用：方法名();



> 方法执行流程：调用方法时，优先执行方法内部代码，结束后，返回到方法调用处，继续向下执行



```java
//2、用方法打印9个-
public class TestFunction2 {
	public static void main(String[] args) {
        System.out.println("窗前明月光");
        printSign();
        System.out.println("疑是地上霜");
        printSign();
        System.out.println("举头望明月");
        printSign();
        System.out.println("低头思故乡");
        printSign();
	}
	//定义一个打印9个-的功能
	public static void printSign() {
		for (int i = 1; i <=9; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
```

## 方法参数：形参和实参



> 作用：方法的参数可以让代码功能更加灵活、普适性更高、易于修改及维护
>
> 注意：调用带参方法时，依次传入实参，类型、个数、顺序必须与形参对应



```java
//形参定义语法
public static void 方法名称(形式参数){
    //方法主体
}

//实参调用语法
方法名称(实际参数);

//形参等价于局部变量声明，实参等价于局部变量的赋值
```



> 单个参数



```java
public class TestFunction3 {
	public static void main(String[] args) {
        System.out.println("窗前明月光");
        int a = 9;
        printSign(a);
        //printSign(9);也可
        System.out.println("疑是地上霜");
        printSign(8);
        System.out.println("举头望明月");
        printSign(7);
        System.out.println("低头思故乡");
        printSign(6);
	}
	//定义一个打印count个-的功能
	public static void printSign(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
```

> 多个参数

```java
public class TestFunction4 {
	public static void main(String[] args) {
        System.out.println("窗前明月光");
        printSign(9,'#');
        System.out.println("疑是地上霜");
        printSign(9,'-');
        System.out.println("举头望明月");
        printSign(9,'+');
        System.out.println("低头思故乡");
        printSign(9,'*');
	}
	//定义一个打印count个任意符号的功能
	public static void printSign(int count,char sign) {
		for (int i = 1; i <= count; i++) {
			System.out.print(sign);
		}
		System.out.println();
	}
}
```

> 如何定义参数：根据具体业务需求，来定义方法的参数。如：用户登录的操作，需要传参String user,String password

## 返回值与返回值类型

> 概念：方法执行后的返回操作
>
> 定义的返回值类型：基本数据类型、引用数据类型、void
>
> 方法执行后，一些情况下有返回结果，一些情况下无返回结果
>
> return value;方法可以返回一个结果，结果类型必须与返回值类型一致
>
> return关键字的两种用法：
>
> return value;//结束当前方法，并伴有值的返回，将值返回到方法调用处（适用于具有返回值类型的方法）
>
> return;//结束方法，直接返回方法调用处（适合具有无返回值类型的方法）
>
> 好处：
>
> 减少代码冗余
>
> 提高复用性
>
> 提高可读性
>
> 提高可维护性

```java
//定义语法
public static 返回值类型 方法名称(形式参数列表){
    //方法主题
    return value;//返回值 可以返回一个结果，结果类型与返回值类型一致
}
//调用方法
变量 = 方法名称();
```



```java
public class TestReturnValue1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//调用方式
		//第一种：直接打印
		System.out.println("和是："+add(2,3));
		//第二种：赋值给合适的变量
		int sum=add(2,3);
		System.out.println("两个数的和是："+sum);
		//第三种：参与运算
		System.out.println(add(2,3)+10);
		if(add(2,3)==5){
			System.out.println("结果为5");
		}
	}
	/**
	 计算两个数的和
	 */
	public static int add(int a,int b) {
		return a + b;
	}
}
```



```java
public class TestReturnValue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//需求：定义一个方法，计算两个整数的和，并返回结果，在main方法中打印
		System.out.println("两个数的和是："+add(2, 3));
	}
	//定义一个方法，计算两个整数的和，并返回结果
	public static int add(int a,int b) {
		return a + b;
		//return a - b;return表示方法结束了，后面若有表达式，返回会其结果，一个方法只能有一个返回值！！！
	}
}
```



```java
public class TestReturnValue3{
    public static void main(String[] args){
        String result = isEven(5);
        System.out.println("结果是："+result);
    }
    public static String isEven(int num){
        if(num % 2 == 0){
            return "偶数";
        }else{
            return "奇数";
        }
    }
}
```



```java
public class TestReturnValue4 {
	public static void main(String[] args) {
		show();
	}
	public static void show() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			if (i == 50) {
				//break;结束当前循环
				return;//结束方法
			}
		}
		System.out.println("程序结束");
	}
}
```

> 方法根据有无返回值和有无参数分为四类方法

```java
public static 返回值类型 方法名(){
    方法体(功能代码)
}
//1、无返回值无参方法 void()
public static void 方法名(){
    return;//结束方法
}
//2、无返回值带参方法 void(形式参数)：局部变量的声明
public static void 方法名(数据类型 变量名1,数据类型 变量名2...){
    return;//结束方法
}
//3、有返回值无参方法 返回值类就是数据类型 由return后面值决定
public static 返回值类型 方法名(){
    return value;//必须写return
}
//4、有返回值带参方法 返回值类就是数据类型 由return后面值决定
public static 返回值类型 方法名(数据类型 变量名1,数据类型 变量名2...){
    return value;//必须写return
}
```

## 递归

```java
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("main方法开始");
		m1();
		System.out.println("main方法结束");
	}
	public static void m1() {
		System.out.println("m1方法开始");
		m2();
		System.out.println("m1方法结束");
	}
	public static void m2() {
		System.out.println("m2方法开始");
		System.out.println("m2方法结束");
	}
}
```



```java
public class Demo2 {
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		System.out.println("m1方法开始");
		//无穷递归，溢出
		m1();
		System.out.println("m1方法结束");
	}
}
```



```java
public class Demo3 {
	public static void main(String[] args) {
		//使用递归实现10以内的阶乘
		//有返回值带参方法
		int result = jiecheng(5);
		System.out.println("阶乘是："+result);
	}
	public static int jiecheng(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}else {
			return num*jiecheng(num-1);
		}
	}
}
```



```java
public class Demo4 {
	public static void main(String[] args) {
		//斐波那契数列
		/*
		F(0)=0，F(1)=1, F(n)=F(n - 1)+F(n - 2)（n ≥ 2，n ∈ N*）
		0 1 1  2   3  5  8  13  21 34 55
		0 1 2  3   4  5  6  7   8
		*/
		int result = feibo(9);
		System.out.println(result);
	}
	public static int feibo(int num) {
		if(num == 1 ||num == 2) {
			return 1;
		} else {
			return feibo(num - 1) +feibo(num - 2);
		}
	}
}
```



```java
public class Demo5 {
	public static void main(String[] args) {
		/*
		  使用递归计算1-100的和
		  有返回值带参方法
		*/
		int result = jiecheng(5);
		System.out.println(result);
	}
	public static int jiecheng(int num) {
		if (num == 1 || num ==0) {
			return 1;
		} else {
			return num +jiecheng(num - 1);
		}
	}
}
```

