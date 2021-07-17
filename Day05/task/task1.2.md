# task1.2.md

1、（for 循环）计算1+2+3+...+100 的和
2、（for 循环）计算1+3+5+...+99 的和。
3、（while/do while循环）把1、2 两题用while 循环或do...while 循环改写。
4、（for 循环）读入一个小于10 的整数n，输出它的阶乘n。
5、（for 循环）求100 以内所有能被3 整除但不能被5 整除的数字的和。
6、（for 循环）编程找出四位整数abcd 中满足 (ab+cd)(ab+cd)=abcd 的数。
7、（for循环）输出99 乘法表。
8、（for循环）计算2000年1月1日到2008年1月1日相距多少天。（注意闰年）
9、（循环）*读入一个整数n，输出如下图形

```java
n = 3
*
***
*****
n = 4
   *
  ***
 *****
*******
```

```java
思路：
9.1 读入的整数n，就是外层循环的循环次数。
9.2 对于每一行，要做的事情：
9.2.1 输出若干个空格；
9.2.2 输出若干个星；
9.2.3 换行。
提示：输出不换行，⽤System.out.print()。
```

10、（for循环）求水仙花数。
提示：所谓水仙花数，是指一个三位数abc，如果满⾜a³+b³+c³=abc，则abc是水仙花数。

> 1、
>
> ```java
> public class task06 {
> 	public static void main(String[] args) {
> 		int sum = 0;
> 		for (int i = 1; i <= 100; i++) {
> 			sum +=i;
> 		}
> 		System.out.println("1+2+3+...+100 的和是:"+sum);
> 	}
> }
> ```
>
> 2、
>
> ```java
> public class task07 {
> 	public static void main(String[] args) {
> 		int sum = 0;
> 		for (int i = 1; i < 100; i++) {
> 			if (i % 2 != 0) {
> 				sum +=i;
> 			}
> 		}
> 		System.out.println("1+3+5+...+99 的和是:"+sum);
> 	}
> }
> ```
>
> 3、
>
> ```java
> public class task08 {
> 	public static void main(String[] args) {
> 		int i = 1,j = 1,m = 1,n = 1;
> 		int sum1 = 0,sum2 = 0,sum3 = 0,sum4 = 0;
> 		
> 		while (i <= 99) {
> 			sum1 += i;
> 			i += 2;
> 		}
> 		System.out.println("1+3+5+...+99 的和用while计算："+sum1);
> 		
> 		do {
> 			sum2 += j;
> 			j += 2;
> 		} while (j <= 99);
> 		System.out.println("1+3+5+...+99 的和用do while计算："+sum2);
> 		
> 		while (m <= 100) {
> 			sum3 += m;
> 			m++;
> 		}
> 		System.out.println("1+3+5+...+100 的和用while计算："+sum3);
> 		
> 		do {
> 			sum4 += n;
> 			n++;
> 		} while (n <= 100);
> 		System.out.println("1+3+5+...+100 的和用do while计算："+sum4);
> 	}	
> }
> ```
>
> 4、
>
> ```java
> import java.util.Scanner;
> public class task09 {
> 	public static void main(String[] args) {
> 		System.out.println("请输入一个整数：");
> 		Scanner input = new Scanner(System.in);
> 		int num = input.nextInt();
> 		int n = 1;
> 		for (int i = 1; i <= num; i++) {
> 			n *= i;
> 		}
> 		System.out.println(num+"的阶乘是："+n);
> 	}
> }
> ```
>
> 5、
>
> ```java
> public class task10 {
> 	public static void main(String[] args) {
> 		int sum = 0;
> 		for (int i = 3; i <= 100; i+=3) {
> 			if (i % 5 != 0) {
> 				System.out.println("100 以内所有能被3 整除但不能被5 整除的数字为"+i);
> 				sum += i;
> 			}
> 		}
> 		System.out.println("他们的和是："+sum);
> 	}
> }
> ```
>
> 6、
>
> ```java
> public class task11 {
> 	public static void main(String[] args) {
> 		for (int i = 1000; i <=9999; i++) {
> 			int f_2 = i / 100;
> 			int l_2 = i % 100;
> 			int num = 0; 
> 			if ( (f_2+l_2)*(f_2+l_2) == i) {
> 				System.out.println(i);
> 			}
> 		}		
> 	}
> }
> ```
>
> 7、
>
> ```java
> public class task12 {
> 	public static void main(String[] args) {
> 		for (int i = 1; i <= 9; i++) {
> 			for (int j = 1; j <=i; j++) {
>              	 //列*行
> 				System.out.print(j+"*"+i+"="+(i*j)+"\t");
> 			}
> 			System.out.println();
> 		}	
> 	}
> }
> ```
>
> 8、
>
> ```java
> public class task13 {
> 	public static void main(String[] args) {
> 		int count = 0,sum = 0;
> 		for (int i = 2000; i < 2008; i++) {
> 			if ((i % 4 == 0 && i % 100 != 0)||(i % 100 == 0 && i % 400 == 0)) {
> 				count++;
> 			}
> 			sum = count*366+(8-count)*365;
> 		}
> 		System.out.println("2000年1月1日到2008年1月1日相距"+sum+"天");
> 	}
> }
> ```
>
> 9、
>
> ```java
> import java.util.Scanner;
> public class task14 {
> 	public static void main(String[] args) {
> 		System.out.println("请输入n的值：(3 or 4)");
> 		Scanner input = new Scanner(System.in);
> 		int n = input.nextInt();
> 		if (n == 3 || n == 4) {
> 			if (n == 3) {
> 				for (int i = 1; i <= 3; i++) {
> 					for (int j = 1; j <= 2 * i - 1; j++) {
> 						System.out.print("*");
> 					}
> 					System.out.println();
> 				}
> 			} else {
> 				for (int i = 1; i <= n; i++) {
> 					for (int j = 1; j <= n - i; j++) {
> 						System.out.print(" ");
> 					}
> 					for (int j = 1; j <= 2 * i - 1; j++) {
> 						System.out.print("*");
> 					}
> 					System.out.println();
> 				}
> 			}
> 		} else {
> 			System.out.println("请在3和4之间选择！！！");
> 		}
> 	}
> }
> ```
>
> 10、
>
> ```java
> import java.util.Scanner;
> public class task15 {
> 	public static void main(String[] args) {
> 		/*
> 		System.out.println("请输入一个三位数");
> 		Scanner input = new Scanner(System.in);
> 		int num = input.nextInt();
> 		int ge = num % 10;
> 		int shi = num / 10 % 10;
> 		int bai = num / 100;
> 		if (num > 0 && num <= 999) {
> 			if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == num) {
> 				System.out.println("这个三位数是水仙花数");
> 			}else {
> 				System.out.println("这个三位数不是水仙花数");
> 			}
> 		} else {
> 			System.out.println("请输入合理的数值！！！");
> 		}
> 		*/
> 		for (int num = 100; num <= 999; num++) {
> 			int ge = num % 10;
> 			int shi = num / 10 % 10;
> 			int bai = num / 100;
> 			if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == num) {
> 				System.out.println(num);
> 			}
> 		}
> 	}
> }
> ```
>
> 