# 课后作业1.1

1、（if 语句）读入一个整数，表示一个人的年龄。如果小于6岁，则输出“儿童”，6岁到13岁，输出“少儿”；14岁到17岁，输出“青少年”；18岁到35岁，输出“青年”；36岁到50岁，输出“中年”； 50岁以上输出“中老年”。

2、（if语句）计算销售总金额
图书批发商店的某本书的零售价是26.5元/本，如果客户一次性购买100本以上（包括100本），则每本的价格打9折，如果客户一次性购买500本以上（包括500本），则每本的价格打8折并返回1000元给客户，请分别计算购买8本、150本、600本的应付金额是多少。要求购买书的数量从控制台输入。

3、（if 语句）读入一个表示年份的整数，判断这一年是否是闰年。如何判断一个年份 是否是闰年：
3.1 如果这个年份能够被4 整除，且不能被100 整除，则这一年是闰年。例如，1996 年是闰年，而相应的，1993 年就不是闰年。
3.2 如果这个年份能够被100 整除，则这个数必须要能被400 整除，才是闰年。例如，2000 年是闰年，1900 年不是闰年。

4、（if语句）代码如下,运行完成之后的结果是:10是偶数。横线处补全代码

```java
public class Test{
	public static void main(String[] args){
		int a=10;
		if(____________){
		System.out.println(a+"是偶数");
		}
	}
}
```

5、（if语句）以下代码运行结果？

```java
public static void main(String[] args) {
	boolean flag = false;
	int num = 10;
	if (flag){
		num++;
	}
	num++;
	if(num < 11){
		System.out.println("天⽣我材必有⽤");
	if (num > 5){
		System.out.println("千⾦散尽还复来");
	}
}
System.out.println("饿了么？");
}
```

6、（switch 语句）读入一个整数，如果是1~5 之间，则分别输出5个福娃的名字，否则输出“北京欢迎你”。

7、（switch 语句）读入一个整数或字符，代表季度，输出以下内容。
		第一季度：3－5月（春季）
		第二季度：6－8月（夏季）
		第三季度：9－11月（秋季）
		第四季度：12－2月（冬季）

8、（局部变量）以下代码运行结果为？简述原因？

```java
public static void main(String[] args){
	int a = 20;
	if(a == 20){
		int b = 30;
	}
	int b = 40;
	System.out.println(b);
}
```





> 1、
>
> ```java
> import java.util.Scanner;
> public class task01 {
> 
> 	public static void main(String[] args) {
> 	System.out.println("请输入年龄：");
> 		Scanner input = new Scanner(System.in);
> 		int age = input.nextInt();
> 		isName(age);
> 	}
> 	public static void isName(int age) {
> 		if (age < 6) {
> 			System.out.println("儿童");
> 		}
> 		if (age > 6 && age < 13) {
> 			System.out.println("少儿");
> 		}
> 		if (age > 14 && age < 17) {
> 			System.out.println("青少年");
> 		}
> 		if (age > 18 && age < 35) {
> 			System.out.println("青年");
> 		}
> 		if (age > 36 && age < 50) {
> 			System.out.println("中年");
> 		}
> 		if (age > 50) {
> 			System.out.println("中老年");
> 		}
> 	}
> ```
>
> 2、
>
> ```java
> import java.util.Scanner;
> public class task02 {
> 	public static void main(String[] args) {
> 		Scanner input = new Scanner(System.in);
> 		double book = 26.5;
> 		System.out.println("请输入要购买几本书");
> 		int sum = input.nextInt();
> 		isSum(sum);
> 		double money =input.nextDouble();
> 	}
> 	public static void isSum(int sum) {
> 		if (sum > 0 && sum <= 100) {
> 			System.out.println("您购买了"+sum+"本书，应付金额为"+sum*26.5+"元");
> 		}
> 		if (sum >= 100 && sum < 500) {
> 			System.out.println("您购买了"+sum+"本书，应付金额为"+sum*26.5*0.9+"元");
> 		}
> 		if (sum >= 500) {
> 			System.out.println("您购买了"+sum+"本书，应付金额为"+sum*26.5*0.8+1000+"元");
> 		}
> 	}
> 
> }
> ```
>
> 3、
>
> ```java
> import java.util.Scanner;
> public class task03 {
> 	public static void main(String[] args) {
> 		System.out.println("请输入年份");
> 		Scanner input = new Scanner(System.in);
> 		int year = input.nextInt();
> 		if ((year % 4 == 0 && year % 100 != 0)||(year % 100 == 0 && year % 400 == 0)) {
> 			System.out.println("这一年是闰年");
> 		}else {
> 			System.out.println("这一年不是闰年");
> 		}
> 	}
> }
> ```
>
> 4、10 % 2 == 0
>
> 5、饿了么？
>
> 6、
>
> ```java
> import java.util.Scanner;
> public class task04 {
> 	public static void main(String[] args) {
> 		Scanner input = new Scanner(System.in);
> 		int num = input.nextInt();
> 		switch (num) {
> 		case 1:
> 			System.out.println("贝贝");
> 			break;
> 			
> 		case 2:
> 			System.out.println("晶晶");
> 			break;
> 			
> 		case 3:
> 			System.out.println("欢欢");
> 			break;
> 			
> 		case 4:
> 			System.out.println("莹莹");
> 			break;
> 			
> 		case 5:
> 			System.out.println("妮妮");
> 			break;
> 		default:
> 			System.out.println("北京欢迎你");
> 			break;
> 		}
> 	}
> }
> ```
>
> 7、
>
> ```java
> import java.util.Scanner;
> public class task05 {
> 	public static void main(String[] args) {
> 		Scanner scanner = new Scanner(System.in);
> 		System.out.println("请输⼊月份：");
> 		int month = scanner.nextInt();
> 		switch (month) {
> 		case 3:
> 		case 4:
> 		case 5:
> 		System.out.println("第一季度：3－5月（春季）");
> 		break;
> 		case 6:
> 		case 7:
> 		case 8:
> 		System.out.println("第二季度：6－8月（夏季）");
> 		break;
> 		case 9:
> 		case 10:
> 		case 11:
> 		System.out.println("第三季度：9－11⽉（秋季）");
> 		break;
> 		case 12:
> 		case 1:
> 		case 2:
> 		System.out.println("第四季度：12－2月（冬季）");
> 		break;
> 		default:
> 		System.out.println("输入错误！");
> 		break;
> 		}
> 	}
> }
> ```
>
> 8、40

