# Day09

> 数组
>
> 概念：一组**连续**的存储空间，存储多个**相同数据类型**的值
>
> 特点：类型相同、连续、长度固定

## 数组的创建

```java
//数据类型 [] 数组名 = new 数据类型[长度]
int [] a = new int[5];
```

## 数组的组成

数组中的格子被称为“数组的元素”

对元素的访问分为：“赋值”，“取值”

访问元素是：**下标**从0开始，依次+1，自动递增

访问语法：**数组名 [下标]**  存：a [0] = 10; 取：a[0]

下标范围：0~数组长度-1，不在范围内会造成数组下标越界异常

```java
public class TestArray1 {
	public static void main(String[] args) {
		//数组的创建方式
		
		//声明并分配空间
		//在内存中，申请长度为5的连续空间，存储5个int类型的值
		//数据类型 [] 数组名 = new 数据类型 [长度];
		int [] nums = new int [5];
		
		//访问元素 存值
		//数组名[下标] = 值;
		nums [0] = 10;
		nums [1] = 20;
		nums [2] = 30;
		nums [3] = 40;
		nums [4] = 50;
		
		//访问元素 取值
		//数组名 [下标];
		int num = nums [0];
		System.out.println(num);
		//System.out.println(nums [0]);也可以
	}
}
```

## 数组的遍历

遍历：从头至尾，逐一对数组的每个元素进行访问

```java
public class TestArray2 {
	public static void main(String[] args) {
		// 数组的遍历
		// 声明并分配空间
		// 在内存中，申请长度为5的连续空间，存储5个int类型的值
		// 数据类型 [] 数组名 = new 数据类型 [长度];
		
		int[] nums = new int[5];
		
		//访问元素 存值
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		//访问元素 取值
		System.out.println(nums.length);
		
		//数组的遍历
		System.out.println("通过for循环遍历");
		//下标从0开始，小于数组长度
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		/*
		 增强for循环
		 */
		System.out.println("通过增强for循环遍历：");
		for (int n : nums) {//将nums数组中的元素取出，依次赋值给变量n
			System.out.println(n);
		}
	}
}
```

增强for循环（foreach循环）

```java
public class TestArray3 {
	public static void main(String[] args) {
		//JDK1.5引入增强for循环
		//JDK1.5引入增强for循环只适用于数组遍历，不能使用下标
		
		//数据类型 [] 数据名 = new 数据类型 [长度];
		int [] nums = new int[5];
		
		//访问元素
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		//遍历数组
		System.out.println("通过for循环遍历：");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		//通过增强for循环将数组中的值依次加1
		
		System.out.println("通过增强for循环遍历：");
        //临时变量i，foreach增强型for循环只适用于数组遍历。相当于将这些数都拿出来暂存
		for (int i : nums) {
			i += 1;
			System.out.println(i);
		}
		
		//遍历数组
		System.out.println("通过for循环遍历：");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
```

## 数组的默认值

> 整数：0
>
> 小数：0.0
>
> 字符：\u0000
>
> 布尔：false
>
> 其他：null

## 数组创建语法

> 先声明、再分配空间
>
> 声明并分配空间
>
> 声明并赋值（繁）
>
> 声明并赋值（简）



```java
public class TestArray4 {
	public static void main(String[] args) {
		//数组的默认值及其创建方式
		//第一种：声明并分配空间
		//数据类型[] 数组名 = new 数据类型[长度];
		int [] nums=new int[5];
		//int  nums []=new int[5];
		//遍历数组
		System.out.println("通过for循环遍历数组：");
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		System.out.println("通过增强for循环遍历数组：");
		for(int num :nums){
			System.out.print(num+"\t");
		}
		System.out.println();
		//第二种方式
		//声明数组
		//分配空间
		//数据类型 [] 数组名; 或者 数据类型 数组名[];
		//数组名=new 数据类型 [长度];
		double[] scores;
		scores=new double[5];
		System.out.println("通过增强for循环遍历数组：");
		for(double score :scores){
			System.out.print(score+"\t");
		}
		System.out.println();
		
		//第三种方式：声明分配空间并赋值
		//数据类型 [] 数组名=new 数据类型 []{value1,value2,value3,....};
		//char [] chs=new char[]{'A','B','C','D'};
		char [] chs;
		chs=new char[]{'A','B','C','D'};
		System.out.println("通过增强for循环遍历数组：");
		for(char c:chs){
			System.out.print(c+"\t");
		}
		System.out.println();
				
		//第四种方式：声明分配空间并赋值（简写）  不能分开写
		//String [] names=new String[5];
		String [] names={"tom","jack"};
		System.out.println("通过增强for循环遍历数组：");
		for(String name:names){
			System.out.print(name+"\t");
		}
		System.out.println();
	}

}
```



## 数组小练习

```java
public class TestDemo1 {
	public static void main(String[] args) {
		/* 
		 给定一个整数数组，统计数组中所有元素的平均值
		 */
		
		//1、给定一个整数数组
		//创建数组
		//数据类型[] 数组名 = new 数据类型 []{value1,value2value3,...};
		int [] score = new int[] {90,85,60,89};
		//2、统计数组中所有元素的和
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		//3、求平均分 注意类型，强转double
		double avg = (double)sum / score.length;
		System.out.println("平均分是："+avg+"分");
	}
}
```

```java
import java.util.Scanner;
public class TestDemo2 {
	public static void main(String[] args) {
		/*
		 给定一个整数数组，读入一个整数n，如果n在数组中存在，输出下标，不存在则输出-1
		 */
		//1、给定一个整数数组
		int[] nums = {12,33,56,44};
		//2、读入一个整数n
		System.out.println("请输入一个整数");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		//3、遍历数组查找n值是否存在
		int i = 0;
		for (; i < nums.length; i++) {
			if (num == nums[i]) {
				System.out.println("下标是："+i);
				break;
			}
		}
		if (i ==nums.length) {
			System.out.println("下标是-1");
		}
	}
}
```

```java
import java.util.Scanner;
public class TestDemo3 {
	public static void main(String[] args) {
		//控制台输入5个城市的名称，使用数组保存，并遍历输出
		Scanner input = new Scanner(System.in);
		//1、定义数组
		String[] cities = new String[5];
		//2、控制台输入5个城市的名称存入数组
		for (int i = 0; i < cities.length; i++) {
			System.out.println("请输入城市名：");
			String city = input.next();
			//将城市存入数组
			cities[i] = city;
		}
		System.out.println("通过增强for循环遍历");
		for (String city : cities) {
			System.out.println(city+"\t");
		}
		System.out.println("\n程序结束");
	}
}
```



## 数组扩容

```java
public class TestDemo4 {
	public static void main(String[] args) {
		/*
		 扩容思路： 
		 创建大于原数组长度的新数组 
		 将原数组中的元素依次复制到新数组中。
		 */

		// 1、创建源数组
		//创建空间大小为5的数组
		int[] nums = new int[5];
		
		//2、访问数组
		nums[0]=11;
		nums[1]=22;
		nums[2]=33;
		nums[3]=44;
		nums[4]=55;
		
		//3、遍历数组
		System.out.println("通过for循环遍历");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
		
		//4、创建一个新数组
		int [] newNums = new int [nums.length*2];
		
		//5、将原数组中的元素复制到新数组中
		//原数组长度小，循环遍历
		for (int i = 0; i < nums.length; i++) {
			//复制
			newNums[i] = nums[i];
		}
		
		//6、遍历新数组
		System.out.println("通过for循环遍历");
		for (int i = 0; i < newNums.length; i++) {
			System.out.println(newNums[i]+"\t");
		}
		System.out.println();
	}
}
```



## 复制的方式

> 循环将原数组中所有元素逐一赋值给新数组
>
> System.arraycopy(原数组,原数组起始,新数组,新数组起始,长度)。
>
> java.util.Arrays.copyOf(原数组, 新长度)。返回带有原值的新数组。

```java
public class TestDemo5 {
	public static void main(String[] args) {
		/*
		 扩容思路： 
		 创建大于原数组长度的新数组 
		 将原数组中的元素依次复制到新数组中。
		 通过System.arraycopy(原数组名,起始位置,新数组名,新数组起始位置,复制元素个数)方式复制
		 */
		
		// 1、创建源数组
		//创建空间大小为5的数组
		int[] nums = new int[5];
				
		//2、访问数组
		nums[0]=11;
		nums[1]=22;
		nums[2]=33;
		nums[3]=44;
		nums[4]=55;
				
		//3、遍历数组
		System.out.println("通过for循环遍历");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
				
		//4、创建一个新数组
		int [] newNums = new int [nums.length*2];
				
		//5、将原数组中的元素复制到新数组中
		//System.arraycopy(原数组名,起始位置,新数组名,新数组起始位置,复制元素个数)
		System.arraycopy(nums, 0, newNums, 0, nums.length);
		//6、遍历新数组
		System.out.println("通过for循环遍历");
		for (int i = 0; i < newNums.length; i++) {
			System.out.println(newNums[i]+"\t");
		}
		System.out.println();
	}
}
```



```java
import java.util.Arrays;
public class TestDemo6 {
	public static void main(String[] args) {
		/*
		 扩容思路： 
		 创建大于原数组长度的新数组 
		 将原数组中的元素依次复制到新数组中。
		 通过java.util.Arrays.copyOf(原数组名，新数组的长度); 返回一个新数组的方式复制
		 */
		
		// 1、创建源数组
		//创建空间大小为5的数组
		int[] nums = new int[5];
				
		//2、访问数组
		nums[0]=11;
		nums[1]=22;
		nums[2]=33;
		nums[3]=44;
		nums[4]=55;
				
		//3、遍历数组
		System.out.println("通过for循环遍历");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]+"\t");
		}
		System.out.println();
				
		//4利用方法返回一个新数组
		//java.util.Arrays.copyOf(原数组名，新数组的长度); 返回一个新数组
		//int [] newNums=java.util.Arrays.copyOf(nums,nums.length*2);
		int [] newNums=Arrays.copyOf(nums,nums.length*2);
		
		//5、遍历新数组
		System.out.println("通过for循环遍历");
		for (int i = 0; i < newNums.length; i++) {
			System.out.println(newNums[i]+"\t");
		}
		System.out.println();
	}
}
```

