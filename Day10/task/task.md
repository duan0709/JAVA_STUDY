# task

1、 下列数组的声明有哪些是对的？错的应该怎么修改？
A. int[] a;
B. int a[] = new int[3];
C. int[] a; a = {1,2,3,4,5};
D. int[] a = new int[3]{1,2,3};
2、 数组的元素通过_来访问， 数组Array 的长度为 _;
3、 数组下标访问超出索引范围时会抛出 _ 异常。
4、 引用数组元素时，数组下标可以是 _。
A. 整型变量
B.整型表达式
C.字符串
D.以上均可
5、 执行完代码 int[] x = new int[25]。以下选项正确的是 _。
A.x[24]为0
B.x[24]未定义
C.x[25]为0
D.x[0]为null
6、 下列语句会造成数组 new int[10] 越界的是 _。
A.a[0] +=9；
B.a[9]=10；
C.--a[9]
D.for(int i = 0;i<=10;i++){ a[i]++}
7、 写一个函数，计算一个整数数组的平均值。
8、 自定义一个整数数组a，读入一个整数n，如果n在数组中存在，则输出n的下标；如果不存在，输出-1。
9、 给定一个数组，输出数组中的最大值和最小值。
10、 给定一个数组，把这个数组中所有元素顺序进行颠倒。

11、 完成数组的冒泡排序算法。给定一个数组：int[] a = {1,3,2,7,5}利用冒泡排序对其按照从小到大的顺序排序，然后输出结果。
12、 使用第二种算法对数组进行排序。

> 1、D int [] a = new int[3];
>
> 2、下标 Array.length
>
> 3、下标越界
>
> 4、AB
>
> 5、A
>
> 6、D
>
> 7、
>
> ```java
> public class task01 {
> 	static int [] nums = {1,5,3,5,6};
> 	public static void main(String[] args) {
> 		//写一个函数，计算一个整数数组的平均值
> 		avg();
> 	}
> 	public static void avg() {
> 		int sum = 0;
> 		for (int i = 0; i < nums.length; i++) {
> 			sum += nums[i];
> 		}
> 		System.out.println("平均值是："+sum/nums.length);
> 	}
> 
> }
> ```
>
> 8、
>
> ```java
> public class task02 {
> 	public static void main(String[] args) {
> 		//自定义一个整数数组a，读入一个整数n，如果n在数组中存在，则输出n的下标；如果不存在，输出-1。
> 		int [] a = {1,2,3,4,5};
> 		Scanner input = new Scanner(System.in);
> 		System.out.println("int [] a = {1,2,3,4,5};");
> 		System.out.println("请输入一个整数");
> 		int n = input.nextInt();
> 		for (int i = 0; i < a.length; i++) {
> 			if (n == a[i]) {
> 				System.out.println("输入的数存在，下标是："+i);
> 				break;
> 			}else {
> 				System.out.println("-1");
> 				break;
> 			}
> 		}
> 	}
> 
> }
> ```
>
> 9、
>
> ```java
> public class task03 {
> 	public static void main(String[] args) {
> 		//给定一个数组，输出数组中的最大值和最小值。
> 		int [] nums = {59,2,38,47,55};
> 		int max,min;
> 		max = nums[0];
> 		min = nums[0];
> 		for (int i = 0; i < nums.length; i++) {
> 			if (nums[i] > max) {
> 				max = nums[i];
> 			}
> 			if (nums[i] < min) {
> 				min = nums[i];
> 			}
> 		}
> 		System.out.println("最大值是："+max+"最小值是："+min);
> 	}
> 
> }
> ```
>
> 10、
>
> ```java
> public class task04 {
> 	public static void main(String[] args) {
> 		//给定一个数组，把这个数组中所有元素顺序进行颠倒。
> 		int[] nums = {4,2,3,4,5};
> 		for (int i = 0; i < nums.length/2; i++) {
> 			int temp = nums[i];
> 			nums[i] = nums[nums.length-1-i];
> 			nums[nums.length-1-i] = temp;
> 		}
> 		for (int num : nums) {
> 			System.out.print(num+"\t");
> 		}	
> 	}
> }
> ```
>
> 11、
>
> ```java
> public class task05 {
> 	public static void main(String[] args) {
> 		//完成数组的冒泡排序算法。给定一个数组：int[] a = {1,3,2,7,5}利用冒泡排序对其按照从小到大的顺序排序，然后输出结果。
> 		int[] a = {1,3,2,7,5};
> 		for (int i = 0; i < a.length-1; i++) {
> 			for (int j = 0; j < a.length-1-i; j++) {
> 				if (a[j] > a[j+1]) {
> 					int temp = a[j];
> 					a[j] = a[j+1];
> 					a[j+1] = temp;
> 				}
> 			}
> 		}
> 		System.out.println("从小到大排序结果为：");
> 		for (int i : a) {
> 			System.out.print(i+"\t");			
> 		}
> 	}
> 
> }
> ```
>
> 12、
>
> ```java
> public class task06 {
> 	public static void main(String[] args) {
> 		//选择排序 给定一个数组：int[] a = {1,3,2,7,5}利用冒泡排序对其按照从小到大的顺序排序，然后输出结果。
> 		int[] a = {1,3,2,7,5};
> 		for (int i = 0; i < a.length - 1; i++) {
> 			for (int j = i + 1; j < a.length; j++) {
> 				if (a[i] > a[j]) {
> 					int temp = a[j];
> 					a[j] = a[i];
> 					a[i] = temp;
> 				}
> 			}
> 		}
> 		System.out.print("按照从小到大的顺序排序为：");
> 		for (int b : a) {
> 			System.out.print(b+"\t");
> 		}
> 	}
> 
> }
> ```
>
> 

