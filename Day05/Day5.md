# Day05

> switch多分支、循环

## Switch语句

```java
//语法
switch(变量 | 表达式){
case 值1:
逻辑代码1;
break;
case 值2:
逻辑代码2;
break;
case 值n:
逻辑代码n;
break;
default:
未满⾜时的逻辑代码;
break;
}
```

> 注意事项：
>
> 1、可判断的类型：
> byte、short、int、char、String（JDK7+）
>
> 2、执行流程
>
> 3、case穿透

```java
public class Test Switch{
    public static void main(String[] args){
        /*
        根据不同输入名次显示不同奖励
        第一名：奖励ipone 12
        第二名：奖励 小米电视
        第三名：奖励 自行车
        否则：奖励 彩票
        */
        //2、创建Scanner
        Scanner input = new Scanner(System.in);
        //3、接收数据
        System.out.println("请输入名次：");
        int num = input.nextInt();
        //4、处理数据
        switch(num){
            case 1:
                System.out.println("奖励ipone 12");
                break;
            case 2:
                System.out.println("奖励小米电视");
                break;
            case 3:
                System.out.println("奖励自行车");
                break;
            default:
                System.out.println("奖励ipone 12");
                break;//尽量加上break;若不加，放case1前，这句永远执行
        }
        System.out.println("程序结束");
    }
}
```

## 变量分类——局部变量

* 局部变量

> 概念：声明在方法内部的变量，必须先赋值再使用。
>
> 作用范围：定义行开始到所在的代码块结束

```java
public class TestVariable{
    public static void main(String[] args){
        /*
        局部变量
    	概念：声明在方法内部的变量，必须先赋值再使用
    	作用范围：定义行开始到所在的代码块结束
    	注意：多个变量，在重合的作用范围内，不可出现冲突（命名冲突）
        */
        int a = 3;//局部变量a，先声明，再初始化赋值，然后使用
        System.out.println(a);
    }
}
```



## 循环结构

> 概念：：通过某个条件，重复的执行⼀段逻辑代码。

> 循环的四个组成部分：
>
> 初始部分：循环用以开始的数据
>
> 循环条件：决定循环是否继续的依据
>
> 循环操作：单次循环的逻辑代码或任务（一次循环要做的事情）
>
> 迭代部分：控制循环条件改变增量

### while循环

```java
//语法
while(布尔表达式){
//逻辑代码（循环操作）
}
```

> 执行流程：
> 先对布尔表达式进行判断，结果为true，则执行逻辑代码。
> 本次执行完毕后，再次进行判断，结果仍旧为true，则再次执行逻辑代码。
> 直至布尔表达式的结果为false时，才会退出循环结构，执行后续代码。
>
> 特点：
>
> 首次就有入口条件，**先判断，再执行。**

```java
public class TestWhile1{
    public static void main(String[] args){
        int i = 1;//1、初始部分
        while(i <= 10){//2、条件判断
            System.out.println("HelloJava");//3、循环操作
            i++;//4、迭代部分
        }
         System.out.println(i);
        System.out.println("程序结束");
    }
}
```

```java
public class TestWhile2{
	public static void main(String[] args){
        /*
        需求：计算1+2+...+99+100的总和
        解决方案：
        1、直接打印
        2、公式
        3、循环
        4、声明1个变量i，声明1个变量sum
        5、声明100个变量，声明1个变量sum
        */
        
        /*
            int i = 1;
            int sum = 0;
            sum += i;
            i++;
            sum += i;
            i++;
            sum += i;
            i++;
            sum += i;
            i++;
        */
        int i = 1;//1、初始部分
        int sum = 0;//2、条件判断
        while(i <= 100){//3、循环操作
            sum += i;
            i++;//4、迭代部分
        }
        System.out.println(sum);
    }
}
```

```java
public class TestWhile3{
    public static void main(String[] args){
        //计算1~100之间，所有偶数的和
        /*
        int i = 0;
        int sum = 0;
        while(i <= 100){
            if(1 % 2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("和是"+sum);
        System.out.println("程序结束");
        */
        int i = 0;
        int sum = 0;
        while(i <= 100){
            sum += i;
            i += 2;
        }
        System.out.println("和是："+sum);
        System.out.println("程序结束");
    }
}
```

### do-while循环

```java
//语法：
do{
逻辑代码（循环操作）
}while(布尔表达式);
```



> 特点：
>
> 首次没有入口条件，**先执行，再判断。**

```java
public class TestDoWhile1{
	public static void main(String[] args){
     //需求：打印100遍HelloJava
     //1、初始部分
     int i = 1;
     //先执行，再判断。
     do{
         //3、循环操作
         System.out.println(i+"HelloJava");
         //4、迭代部分
         i++;
     }while(i <= 100);
     System.out.println(i);
     System.out.println("程序结束");
 	}
}
```

```java
//1、导包
import java.util.Scanner;
public class TestDoWhile2{
    public static void main(String[] args){
        /*
        需求：检查作业完成情况，
        根据输入的教师评语
        决定学生是否抄写
        */
        //2、创建Scannner
        Scanner input = new Scanner(System.in);
        char answer;//声明
        do{
            //检查作业完成情况
            System.out.println("抄写一遍。");
            System.out.println("根据抄写情况输入较使评语：（y/n）");
            //3、接值
            answer = input.next().charAt(0);
        }while(answer != 'y');
        System.out.println("程序结束");
    }
}
```

```java
//1、导包
import java.util.Scanner;
public class TestDoWhile3{
    public static void main(String[] args){
        /*
        需求：检查作业完成情况，
        根据输入的教师评语
        决定学生是否抄写
        */
        //2、创建Scannner
        Scanner input = new Scanner(System.in);
        String answer;//声明
        do{
            //检查作业完成情况
            System.out.println("抄写一遍。");
            System.out.println("根据抄写情况输入较使评语：（y/n）");
            //3、接值
            answer = input.next();
        }while(!"y".equals(answer));
        System.out.println("y".equals(answer));
        System.out.println("程序结束");
    }
}
```



### for循环

```java
//语法：
for(初始部分 ; 循环条件 ; 迭代部分){
//循环操作
}
```

> 适用于循环次数明确的情况

```java
public class TestFor1{
	public static void main(String[] args){
        /*
        需求：打印100遍HelloJava
        */
        /*
        int i = 1;
        while(i <= 100){
            System.out.println(i+"HelloJava");
            i++;
        }
        System.out.println("程序结束");
        */
        //while循环修改for循环 1、修改关键字2、在布尔表达式前后各加一个分号
        /*
        int i = 1;
        for(;i <= 100;){
            System.out.println(i+"HelloJava");
            i++;
        }
        System.out.println("程序结束");
        */
        for(int i = 1;i <= 100;i++){
            System.out.println(i+"HelloJava");
        }
        System.out.println("程序结束");
    }
}
```

```java
//1、导包
import java.util.Scanner;
public class TestFor2{
    public static void main(String[] args){
        //控制台输入整数n，计算n的阶乘（!n）。例：1*2*...*n
        //2、创建Scanner
        Scanner input = new Scanner(System.in);
        //3、接收数据
        System.out.println("请输入一个整数：");
        int n = input.nextInt();
        //4、计算n的阶乘（!n）
        /*整数的默认值是int，最大取值范围是2147483647
        如果计算13的阶乘超越其取值范围，值不准确了*/
        long sum = 1;
        for(int i = 1;i <= n;i++){
            sum *= i;
        }
        System.out.println(n+"的阶乘是："+sum);
        System.out.println("程序结束");
    }
}
```

```java
//1、导包
import java.util.Scanner;
public class TestFor3{
    public static void main(String[] args){
        /*
        现有1个班级的5名同学，请通过控制台输入5名同学的分数，并计算平均分
        */
        //2、创建Scanner
        Scanner input = new Scanner(System.in);
        //3、接收数据
        double sum = 0;
        /*
        System.out.println("请输入第1名学员的成绩：");
        double score = input.nextDouble();
        sum += score;
        System.out.println("请输入第2名学员的成绩：");
        double score = input.nextDouble();
        sum += score;
        System.out.println("请输入第3名学员的成绩：");
        double score = input.nextDouble();
        sum += score;
        */
        for(int i = 1;i <= 5;i++){
            System.out.println("请输入第"+i+"名学员的成绩：");
        	double score = input.nextDouble();
        	sum += score;
        }
        //4、求平均分
        double avg = sum / 5;
        System.out.println("平均分是："+avg+"分");
    }
}
```

> for循环的特殊形式：
>
> 特殊形式1：省略循环条件,出现死循环。
> 特殊形式2：省略迭代部分,出现死循环。
> 特殊形式3：初始化、循环条件、迭代部分都省略,出现死循环。

## 流程控制语句

### break

```java
public class TestBreak1{
    public static void main(String[] args){
        /*
        break的基本用法
        break：终止、跳出switch、循环结构
        */
        for(int i = 1;i <= 10;i++){
            if(i == 5){
                break;
            }
            
        }
    }
}
```

```java
public class TestBreak2{
    public static void main(String[] args){
        /*
        现有1个班级的5名同学，请通过控制台输入5名同学的分数，
        并计算平均分，如果录入分数为负值，提示用户结束
        */
        Scanner input = new Scanner(System.in);
        //boolean flag = true;//引入布尔值，判断
        double sum = 0;
        int i =1;
        for(;i < 5;i++){
            System.out.println("请输入第"+i+"名学员的成绩");
            double score = input.nextDouble();
            if(score < 0){
                System.out.println("成绩不能为负值");
                //flag = flalse//小于0，将其置为负
                break;
            }
            sum += score;
        }
        
        /*
        if(flag){
            souble avg = sum / 5;
            System.out.println("平均分是："+avg+"分。")
        }
        */
        if(i == 6){//如果没有赋值，i的个数为6个
            double avg = sum / 5;
            System.out.println("平均分是："+avg+"分。");
        }   
    }
}
```

### continue

```java
public class TestContinue1{
    public static void main(String[] args){
        /*
        continue的基本用法
        continue：结束本次循环、执行下一次循环
        */
        for(int i = 1;i <= 10;i++){
            if(i == 5){
                continue;
            }
            Sytem.out.println("当前值："+i);
        }
        System.out.println("程序结束");
    }
}
```

```java
import java.util.Scanner;
public class TestContinue2{
    public static void main(String[] args){
        /*
        现有1个班级的5名同学，请通过控制台输入5名同学的分数，并计算平均分
        统计80分以上分数学员所占比例
        */
        Scanner input = new Scanner(System.in);
        int total = 0;
        for(int i = 1;i <= 5;i++){
            System.out.println("请输入第"+i+"名学员的成绩：");
            double score = input.nextDouble();
            if(score < 80){
                continue;
            }
            total++;//计数
        }
        double rate = (double)total / 5;//double类型自动转换
        System.out.println("统计80分以上分数数学员所占比例"+rate*100+"%");
    }
}
```



## 嵌套循环

> 概念：在一个完整的循环结构中，嵌套另一个完整的循环结构。常见二重循
> 环。

> 考察逻辑，开发用到少

```java
public class TestNested1{
    public static void main(String[] args){
        /*
        打印3行5颗*
        	*****
        	*****
        	*****
        	*****
        */
        //控制台打印*
        //System.out.println("*");
        //打印1行5颗*
        /*
        System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
        */
        /*
		for(int j=1;j<=5;j++){
			System.out.print("*");
		}
		System.out.println();//换行
		for(int j=1;j<=5;j++){
			System.out.print("*");
		}
		System.out.println();//换行
		for(int j=1;j<=5;j++){
			System.out.print("*");
		}
		System.out.println();//换行
		*/
        for(int i = 1;i <= 3;i++){
            for(int j = 1;j <= 5;j++){
                System.out.print("*");
            }
            System.out.println();//换行
        }
    }
}
```

```java
public class TestNested2{
    public static void main(String[] args){
        /*
        需求：计算三个班，每个班5名同学的平均成绩
        */
        Scanner input = new Scanner(System.in);
        for(int i = 1;i <= 3;i++){
            double sum = 0;
            for(int j = 1;j <= 5;j++){
                System.out.println("请输入第"+j+"名学员的成绩：");
				double score=input.nextDouble();
				sum+=score;
            }
            double avg=sum/5;
            System.out.println("第"+i+"个班的，5名学员平均分是："+avg+"分。");
        }
    }
}
```

```java
public class TestNested3{
    public static void main(String[] args){
        /*
		 打印直角三角形
		 *
		 **
		 ***
		 ****
		 ******
		 行 i=1  *=1
		    i=2  *=2
		*/
		
		for(int i=1;i<=5;i++){//打印行
			for(int j=1;j<=i;j++){//打印列*
				System.out.print("*");
			}
			System.out.println();//换行
		}
    }
}
```

```java
public class TestNested4{
	public static void main(String [] args){
		/*
		 九九乘法表
		*/
		//列*行
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();//换行
		}
		
	}
}
```

```java
public class TestNested5{
	public static void main(String [] args){
		/*
		  打印等腰三角形
		  *
		  ***
		  *****
		  *******
		  *********
		  i    j
		  1    1
		  2    3
		  3    5
		  4    7
		  ####*
		  ###***
		  ##*****
		  #*******
		  *********
		*/
		int rows=5;
		for(int i=1;i<=rows;i++){//外层循环控制行数
		    //打印空格（倒三角）
			for(int j=rows-1;j>=i;j--){//4 3 2 1  4>=2
				System.out.print(" ");
			}
		    //打印*
			for(int j=1;j<=2*i-1;j++){//内层循环控制列数
			   System.out.print("*");	   	
			}
			//换行
			System.out.println();
		}
	}
}
```

