1、 写一个函数add，接收两个整数作为参数，返回这两个整数的和。
2、 写一个函数，接收一个整数，输出这个整数的所有因子。
3、 写一个函数，接收一个整数n，输出1+2+3+...+n 的和。
4、 写一个函数，接收一个整数参数n，输出n个HelloWorld。
5、 写一个函数，接收一个整数，输出这个整数是几位数。
6、 求一个三位数，该三位数等于其每位数字的阶乘之和。
7、 验证哥德巴赫猜想：任何一个大于6的偶数，都能分解成两个质数的和。要求输入一个整数，输出这个数能被分解成哪两个质数的和。
		eg : 14
		14=3+11
		14=7+7

> 1、
>
> ```java
> import java.util.Scanner;
> public class task01 {
> 	public static void main(String[] args) {
> 		//写一个函数add，接收两个整数作为参数，返回这两个整数的和。
> 		Scanner input = new Scanner(System.in);
> 		System.out.println("请输入一个整数");
> 		int a = input.nextInt();
> 		System.out.println("请再输入一个整数");
> 		int b = input.nextInt();
> 		add(a,b);
> 	}
> 	public static void add(int a,int b) {
> 		System.out.println("结果是"+(a + b));
> 	}
> }
> ```
>
> 2、
>
> ```java
> import java.util.Scanner;
> public class task02 {
> 	public static void main(String[] args) {
> 		//写一个函数，接收一个整数，输出这个整数的所有因子。
> 		Scanner input = new Scanner(System.in);
> 		System.out.println("请输入一个整数");
> 		int num = input.nextInt();
> 		isYinzi(num);
> 	}
> 	public static void isYinzi(int num) {
> 		for (int i = 1; i <= num; i++) {
> 			if (num % i == 0) {
> 				System.out.println(i);
> 			}
> 		}
> 	}
> }
> ```
>
> 3、
>
> ```java
> import java.util.Scanner;
> public class task03 {
> 	public static void main(String[] args) {
> 		//写一个函数，接收一个整数n，输出1+2+3+...+n 的和。
> 		Scanner input = new Scanner(System.in);
> 		System.out.println("请输入一个整数");
> 		int n = input.nextInt();
> 		add(n);
> 		System.out.println("1+2+3+...n的值是："+add(n));
> 	}
> 	public static int add(int n) {
> 		int sum = 0;
> 		for (int i = 1; i <= n; i++) {
> 			sum += i;
> 		}
> 		return sum;
> 	}
> }
> ```
>
> 4、
>
> ```java
> import java.util.Scanner;
> public class task04 {
> 	public static void main(String[] args) {
> 		//写一个函数，接收一个整数参数n，输出n个HelloWorld。
> 		Scanner input = new Scanner(System.in);
> 		System.out.println("请输入一个数");
> 		int n = input.nextInt();
> 		output(n);
> 	}
> 	public static void output(int n) {
> 		for (int i = 1; i <= n; i++) {
> 			System.out.println("HelloWorld");
> 		}
> 	}
> }
> ```
>
> 5、
>
> ```java
> import java.util.Scanner;
> public abstract class task05 {
> 	public static void main(String[] args) {
> 		// 写一个函数，接收一个整数，输出这个整数是几位数。
> 		Scanner input = new Scanner(System.in);
> 		System.out.println("请输入一个整数");
> 		int n = input.nextInt();
> 		isWhatWei(n);	
> 	}
> 	public static void isWhatWei(int n) {
> 		int count = 0;
> 		do {
> 			count++;
> 			n = n / 10;
> 		} while (n != 0);
> 		System.out.println("这个整数是"+count+"位数");
> 	}
> }
> ```
>
> 6、
>
> ```java
> import java.util.Scanner;
> public class task06 {
> 	public static void main(String[] args) {
> 		// 求一个三位数，该三位数等于其每位数字的阶乘之和。
> 		Scanner input = new Scanner(System.in);
> 		System.out.println("请输入一个三位数");
> 		int n = input.nextInt();
> 		result(n);
> 	}
> 	public static void result(int n) {
> 		//计算个位十位百位
> 		int ge = n % 10;
> 		int shi = n / 10 % 10;
> 		int bai = n / 100;
> 		//计算阶乘
> 		int a=1,b=1,c=1;
> 		for (int i = 1; i <= ge; i++) {
> 			a*=i;
> 		}
> 		for (int i = 1; i <= shi; i++) {
> 			b*=i;
> 		}
> 		for (int i = 1; i <= bai; i++) {
> 			c*=i;
> 		}
> 		System.out.println(a+b+c);
> 	}
> }
> ```
>
> 