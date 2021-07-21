# Day10

> 继续数组学习

## 数组类型参数

> 基本数据类型传递：传递值，一方改变不会影响另一方
>
> 引用数据类型传递：传递地址值，一方改变会影响另一方

```java
public class TestArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 参数类型：基本数据类型 引用数据类型 */
		//基本数据类型
		/*
		int a = 10;//局部变量存放在栈中
		print1(a);//实参 为局部变量进行赋值
		System.out.println(a);
		*/
		
		//引用数据类型
		int [] nums = {10,20,30,40};//引用数据类型传地址值 引用数据类型放在堆中
		printArray(nums);
		System.out.println("主方法遍历数组");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
	}
	
	public static void printArray(int [] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] += 5;
		}
		System.out.println("printArray方法遍历数组");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
	}
	public static void print1(int a) {//形参 局部变量的声明
		a += 5;
		System.out.println(a);		
	}

}
```



## 数组类型返回值



```java
public class TestArray02 {

	public static void main(String[] args) {
		//数组类型返回值
		int [] nums = {111,222,333,444,555};//假如地址为0x0000A001
		
		int [] na = expand(nums);//0x0000B002
		for (int i = 0; i < na.length; i++) {
			System.out.println(na[i]+"\t");
		}
		System.out.println();
	}
	public static int[] expand(int [] arr) {//0x0000A001
		int [] newNums = new int[arr.length*2];//构造，开辟新空间 0x0000B002
		//复制
		for (int i = 0; i < arr.length; i++) {
			newNums[i] = arr[i];
		}
		return newNums;//0x0000B002
	}
}
```



```java
public class TestArray03 {

	public static void main(String[] args) {
		//数组类型返回值
		int [] nums = {111,222,333,444,555};//假如地址为0x0000A001
				
		expand(nums);//0x0000B002 没有接收的，释放
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
	}
	public static int[] expand(int [] arr) {//0x0000A001
		int [] newNums = new int[arr.length*2];//构造，开辟新空间 0x0000B002
		//复制
		for (int i = 0; i < arr.length; i++) {
			newNums[i] = arr[i];
		}
		return newNums;//0x0000B002
	}
}
```



## 可变长参数

> 概念：可接收多个同类型实参，个数不限，使用方式与数组相同
>
> 语法：数据类型 ... 形参名 //必须定义在形参列表最后，且只能有一个



```java
public class TestArray04 {
	public static void main(String[] args) {
		//可变长参数JDK1.5之后
		//语法：数据类型...形参名
		int [] nums = {10,20,30,40,50};
		printArray(nums);
		
		printArray();//底层new数组
		
		printArray(1);
		
		printArray(1,2);
		
		printArray(1,2,3,4);
	}
	public static void printArray(int ... arr) {
		System.out.println("遍历参数");
		for (int a : arr) {
			System.out.println(a+"\t");
		}
		System.out.println();
	}
}
```



## 数组排序

### 冒泡排序

> 原理：相邻两个数值比较大小，互换位置
>
> 记忆：外层循环 length - 1，内层循环 length - i - 1



```java
public class TestBubble {
	public static void main(String[] args) {
		//冒泡排序：相邻两个数比较大小，互换位置
		
		int [] nums = {4,3,5,2,1};
		/*
		int a = 10;
		int b = 20;
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);//20
		System.out.println(b);//10
		*/
		
		
		//前一个数比后一个数大，交换
		
		for (int i = 0; i < nums.length-1; i++) {//控制轮数
			for (int j = 0; j < nums.length-1-i; j++) {//控制次数
				if (nums[j] > nums[j+1]) {					
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k]+"\t");
		}
		System.out.println();
	}

}
```



### 选择排序

> 原理：固定值与其他值依次比较大小，互换位置
>
> 记忆：外层循环 length - 1，内层循环开始位置 j = i + 1



```java
public class TestSelect {
	public static void main(String[] args) {
		//选择排序：固定值与其他值依次比较大小，互换位置
		int [] nums = {4,3,5,2,1};
		for (int i = 0; i < nums.length - 1; i++) {//控制轮数
			//不与自身比较
			for (int j = i + 1; j < nums.length; j++) {//控制次数
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k]+"\t");
		}
		System.out.println();
	}

}
```



### JDK排序

> java.util.Arrays.sort(数组名)//JDK提供（升序）



```java
public class TestJDK {
	public static void main(String[] args) {
		//JDK排序：java.util.Arrays.sort(数组名)//JDK提供（升序）
		
		int [] nums = {4,5,3,2,1};
		java.util.Arrays.sort(nums);
		
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(i+"\t");
		}
		//逆序排序
		System.out.println("逆序排序");
		for (int j = 0; j < nums.length/2; j++) {
			int temp = nums[j];
			nums[j] = nums[nums.length-1-j];
			nums[nums.length-1-j] = temp;
		}
		System.out.println();
		for (int i : nums) {
			System.out.print(i+"\t");
		}
	}

}
```



## 二维数组（二重循环）

> 概念：一维数组中的一维数组；数组中的元素，还是数组
>
> 注意：高维数组中的每一个元素，保存了低维数组的地址。访问array[0]等价于在访问0x0000A111



```java
public class TestDArray1 {
	public static void main(String[] args) {
		//定义二维数组                         行        列   
		//数据类型 [][] 数组名 = new 数据类型[高维长度][低维长度];
		//数据类型 数组名[][] = new 数据类型[高维长度][低维长度];
		
		int [][] nums = new int[3][5];
		//int nums [][] = new int[3][5];
		
		//存值
		nums[0][0] = 10;//第一行第一列
		nums[0][3] = 20;
		nums[1][0] = 30;
		nums[1][1] = 40;
		nums[2][2] = 50;
		nums[2][4] = 60;
		
		//取值
		System.out.println(nums.length);//行3
		System.out.println(nums[0].length);//访问低维长度 首个低维数组的长度 列5
		System.out.println(nums[1].length);//列5
		System.out.println(nums[2].length);//列5
		
		//遍历二维数组
		for (int i = 0; i < nums.length; i++) {//遍历行 i = 0,1...
			for (int j = 0; j < nums[i].length-1; j++) {//遍历列
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
		
		//高维数组中的每一个元素，保存了低维数组的地址。访问array[0]等价于在访问0x0000A111
		System.out.println(nums);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
	}
}
```



```java
public class TestDArray2 {
	public static void main(String[] args) {
		/*
		 二维数组的创建语法
		 先声明、再分配空间：
		 数据类型[][] 数组名;
		 数组名 = new 数据类型[高维长度][低维长度];
		int[][] nums;
		nums=new int[3][5];
		声明并分配空间：
		数据类型[][] 数组名 = new 数据类型[高维长度][低维长度];
		int[][] nums=new int[3][5];
		声明并赋值（繁）：
		数据类型[][] 数组名 = new 数据类型[高维长度][]; //不规则数组，自行new低维数组
		声明并赋值（简）：
		数据类型[][] 数组名 = { {v1,v2,v3},{v4,v5},{v6,v7,v8,v9} }; //显示初始化
		 */
		
		//声明并赋值（繁）
		//数据类型[][] 数组名 = new 数据类型[高维长度][];
		int [][] nums = new int [3][];
		
		//创建低维数组
		int [] a = new int[3];
		nums[0] = new int[5];//第一行5列
		nums[1] = a;//第二行3列
		nums[2] = new int[2];//第三行2列
		
		//数组有默认值 0
		System.out.println("遍历二维数组");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
		
		//声明并赋值（简）
		//数组类型 [][] 数组名 = { {v1,v2,v3},{v4,v5},{v6,v7,v8,v9} }; //显示初始化
		double [][] scores = {{3.14,12.6},{5.67},{4.14,7.89,6.12}};
		System.out.println("遍历二维数组");
		for (double[] score : scores) {
			for (double s : score) {
				System.out.print(s+"\t");
			}
			System.out.println();
		}
	}

}
```



```java
//杨辉三角
```

