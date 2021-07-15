# Day4

> 书接上回

## 运算符

> 算数运算符 + - * / % ++ --
>
> 赋值运算符 = += -= *= /= %=
>
> 关系运算符 > < >= <= == !=
>
> 逻辑运算符 && || ！
>
> 三元运算符 ？ :

```java
public class TestOperation1{
    public static void main(String[] args){
        //算数运算符 + - * / %
        int a = 5;
        int b = 10;
        System.out.println(a+b);//15
        System.out.println(b-a);//5
        
        int c = 7;
        int d = 2;
        System.out.println(c*d);//14
        System.out.println(c/d);//3
        System.out.println(c%d);//1
    }
}
```

* 一元运算符，自增操作

```java
public class TestOperation2{
    public static void main(String[] args){
        /*
        一元运算符 ++ --
        ++ 自增1
        1）如果++是一条语句 a++;与++a;都等价于a=a+1;
        */
        /*
        int a = 12;
        a = a + 1;
        System.out.println(a);
        */
        int a = 12;
        a++;
        //同上述结果一样，a++;替换成++a;结果也一样 
        //--自减1同理
        System.out.println(a);
        
        
        /*
        2）如果++不是一条语句 区分a++与++a
        a++ 先操作再运算 拿原值操作 运算再自增1
        ++a 先运算再操作 拿原值先自增1 拿着自增后的值操作
        【本质上看其先运算还是先操作】
        */
        
        /*
        int a = 12;
        int b = a++;//int b = a; 再运算a++
        System.out.println(a);//13
        System.out.println(b);//12
        */
        
        /*
        int a = 12;
        int b = ++a;//先运算++自增1，a=13，再操作 int b=a
        System.out.println(a);//13
        System.out.println(b);//13
        */
        
        
        /*
        int a = 12;
        int b = a++ + 9;//int b = a + 9;
        System.out.println(a);//13
        System.out.println(b);//21
        */
        
        /*
        int a = 12;
        int b = ++a + 9;//int b = 13+9=22;
        System.out.println(a);//13
        System.out.println(b);//22
        */
            
        /*    
        int a = 12;
        int b =(a++ + 3)*2;//int b = (a + 3)*2;
        System.out.println(a);//13
        System.out.println(b);//30
        */
        
        /*    
        int a = 7;
        int b = (a++) + (a++);
        System.out.println(a);//9
        System.out.println(b);//15
        */
        
        int a = 7;
        int b = (a++) + (++a);
        System.out.println(a);//9
        System.out.println(b);//16
    }
}
```

```java
public class TestOperation3{
    public static void main(String[] args){
        /*
        赋值运算符
        // = += -= *= /= %=
        */
        /*
        int a = 10;
        a = a + 5;
        System.out.println(a);
        */
        int a = 10;
        a += 5;//相当于a = a + 5;
        System.out.println(a);
        
        int b = 10;
        b *= 3;//相当于b = b * 10;
        System.out.println(b);
        
        int c = 20;
        c /= 3;//c = c/3;
        System.out.println(c);
        
        int d = 20;
        d %= 3;//c = c%3;
        System.out.println(d);
        
        
        //面试题
        /*
        byte y = 5;
        y = y+1;//类型不兼容，强转y = (byte)(y+1);可以
        System.out.println(y);
        */
        byte y = 5;
        y += 1;//这样运行不报错
        System.out.println(y);
    }
}
```

```java
public class TestOperation4{
    public static void main(String[] args){
        //关系运算符
        // > < >= <= == !=
        int a = 10;
        int b = 20;
        System.out.println(a > b);
        System.out.println(a < b);
        
        int c = 5;
        int d = 10;
        System.out.println(c == d);
        System.out.println(c != d);
        System.out.println((2 * c) == d);
    }
}
```

```java
public class TestOperation5{
    public static void main(String[] args){
        //逻辑运算符
        // && || ！
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);//全真为真
        System.out.println(a || b);//一真为真
        
        boolean c = 10 > 5;
        boolean d = 8 < 20;
        System.out.println(c && d);//true
        System.out.println(c || d);//true
        
    }
}
```

```java
public class TestOperation6{
    public static void main(String[] args){
        //三元（目）运算符
        //布尔表达式?表达式1:表达式2
        double score = 100.0;
        //1、三元运算符可以进行逻辑判断
        System.out.println(score == 100.0 ? "真棒" : "加油");
        //2、三元运算符可以判断完为变量赋值
        String str = score == 100.0 ? "真棒" : "加油";
        System.out.println(str);
    }
}
```

## 类型提升

* 自动类型提升

> 进⾏算数运算时：
>
> * 两个操作数有⼀个为double，计算结果提升为double。
> * 如果操作数中没有double，有⼀个为float，计算结果提升为float。
> * 如果操作数中没有float，有⼀个为long，计算结果提升为long。
> * 如果操作数中没有long，有⼀个为int，计算结果提升为int。
> * 如果操作数中没有int，均为short或byte，计算结果仍旧提升为int。

```java
public class TestTypeUp{
    public static void main(String[] args){
        //类型提升
        // byte  short int long float double
        int a = 10;
        double b = 20.5;
        double result1 = a + b;
        System.out.println(result1);
        
        int c = 5;
        float d = 1.2F;
        float result2 = c + d;
        System.out.println(result2);
        
        int e = 100;
        long f = 50L;
        long result3 = e + f;
        System.out.println(result3);
        
        byte g = 10;
        int h = 20;
        int result4 = g + h;
        System.out.println(result4);
        
        byte j = 5;
        short k = 5;
        int result5 = j + k;//注意这里为int
        System.out.println(result5);
        //特殊：任何类型与String相加（+）时，实为拼接，其结果自动提升为String。
        /*
        	口诀：+两端有字符串整体提升为String类型
				+两端无字符串类型+算术运算符加法运算
        */
        System.out.println(12 + 34);
        System.out.println(12 + 'A' + 34);//12+65+34=111
        System.out.println(12 + 3.14);
        System.out.println(12 + "哈哈" + 34);
        
 		//将任意类型转换为字符串类型，加空字符串""
        //System.out.println(12 + "" + 34);
    }
}
```

## 控制台录入

> 使⽤顺序：
>
> * 导⼊ java.util.Scanner。
> * 声明 Scanner 类型的变量。
>
> 使⽤Scanner类中对应的⽅法（区分类型）：
>
> * .nextInt(); //获得整数
> * .nextDouble(); //获得⼩数
> * .next(); //获得字符串
> * .next().charAt(0);//获得单个字符

```java
//如果有包的声明必须放在文件的首行
//1、引用JDK提供的扫描仪工具
import java.util.Scanner;
public class TestScanner1{
    public static void main(String[] args){
        //数据类型 变量名 = 值;
        //2、声明Scanner
        Scanner input = new Scannner(System.in);
        //3、基于Scanner变量名input.nextInt();获取整数
        int i = input.nexInt();
        System.out.println(i);
    }
}
```

```java
//1、导包 将外部class文件引入自身程序中
import java.util.Scanner;
public class TestScanner2{
    public static void main(String[] args){
        //2、声明Scanner
        Scanner input = new Scanner(System.in);
        //3、input 接收字符串类型的值 input.next();
        System.out.println("请输入您的姓名：");
        String name = input.next();
        System.out.println("您的姓名是："+name);
        //3、input 接收整型类型的值 input.nextInt();
        //如果录入不匹配数据，会产生java.util.InputMismatchEception，比如年龄输入18.1
        System.out.println("请输入您的年龄：");
        int age = input.nextInt();
        System.out.println("您的年龄是："+age);
        //3、input 接收整型类型的值 input.next().charAt(0);
        System.out.println("请输入您的性别：");
        int sex = input.next().charAt(0);
        System.out.println("您的性别是："+sex);
        //3、input 接收整型类型的值 input.nextDouble();
        System.out.println("请输入您的身高：");
        int height = input.nextDouble();
        System.out.println("您的身高是："+height);
    }
}
```



选择结构：程序执行过程中，有选择的执行

循环结构：程序有重复的执行

## 选择结构与分支结构

### 程序的三种基本结构

* 顺序结构
* 选择结构
* 循环结构

### 基本if选择结构

* 语法

```java
if(布尔表达式){
    //执行代码块
}
```

> 执行流程：
>
> * 对布尔表达式进行判断。
> * 结果为true，则先执行代码块，再执行后续代码。
> * 结果为false，则跳过代码块，直接执行后续代码。

> 下面举几个例子

```java
//1、导包
import java.util.Scanner;
public class Testif1{
    public static void main(String[] args){
        //如果java成绩大于90，奖励一个键盘
        //2、创建Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的java成绩");
        //3、用input接收double类型的值 nextDouble();
        double score = input.nextDouble();
        //4、判断
        if(score > 90){
          System.out.println("奖励一个键盘");  
        }
        System.out.println("程序结束");
    }
}
```

```java
//1、导包
import java.util.Scanner;
public class Testif2{
    public static void main(String[] args){
        /*java成绩大于98分，而且html成绩大于80分，老师奖励他；或者java成绩等于100分，Html成绩大于70分，老师也可以奖励他。*/
        //2、创建Scanner
        Scanner input = new Scanner(System.in);
        //3、接收成绩
         System.out.println("请输入您的java成绩");
        double javaScore = input.nextDouble();
        System.out.println("请输入您的html成绩");
        double htmlScore = input.nextDouble();
        //4、判断
        if((javaScore > 98 && htmlScore > 80) || (javaScore == 100 && htmlScore > 70)){
          System.out.println("奖励一个键盘");  
        }
        System.out.println("程序结束");  
    }
}
```

### if else选择结构

```java
if(布尔表达式){
    //执行代码块1
}else{
    //执行代码块2
}
```

> 执行流程：
>
> * 对布尔表达式进行判断。
> * 结果为true，则先执行代码块1，再退出整个结构，执行后续代码。
> * 结果为false，则先执行代码块2，再退出整个结构，执行后续代码。

> 下面举几个例子

```java
//1、导包
import java.util.Scanner;
public class TestIfElse1{
    public static void main(String[] args){
     /*
	如果体彩中了500万，我买车、买房、欧洲	旅游，否则继续买
	要求控制台输入是否中奖
	字符串比较使用equals()方法
	技术点if-else
	值的比较
	基本数据类型
	等值判断 1 == 1 '是' == '是'
		引用数据类型
	等值判断（地址值）
		字符串内容比较 equals()
*/
        //2、创建Scanner
        Scanner input = new Scanner(System.in);
        //3、接收数据
        System.out.println("请输入是否中奖");
        /*
        char answer = input.next().charAt(0);
        //4、判断
        if('是' == answer){
            System.out.println("买车、买房、欧洲旅游");
        }else{
            System.out.println("继续买");
        }
        */
        String answer = input.next();
        if("是".equals(answer)){
            System.out.println("买车、买房、欧洲旅游");
        }else{
            System.out.println("继续买");
        }
        System.out.println("程序结束");
    }
}
```

```java
//1、导包
import java.util.Scanner;
public class TestIfElse2{
    public static void main(String[] args){
        /*
		 输入四位数字的会员号
		 百位数字等于产生的随机数字即为幸运会员
		 提示恭喜您中奖了，否则没中奖
		 */
        //2、创建Scanner
        Scanner input = new Scanner(System.in);
        //3、接收输入思维数字的会员号
        int cartNo = input.nextInt();
        //百位数字等于产生的随机数字即为幸运会员
        int ge = carNo % 10;
        int shi = carNo / 10 % 10;
        int bai = carNo /100 % 10;
        int qian = carNo /1000 % 10;
        System.out.println("千位是"+qian+"百位是"+bai+"十位是"+shi+"个位是"+ge);
        int random = (int)Math.radom()*10;
        Systen.out.println(random);
        if(bai == random){
            Systen.out.println("恭喜您中奖了");
        }else{
            Systen.out.println("没中奖");
        }
    }
}
```

### 多重if选择结构

```java
语法：
if(布尔表达式1){
//执行代码块1
}else if(布尔表达式2){
//执行代码块2
}else if(布尔表达式3){
//执行代码块3
}else{
//执行代码块4
}
```

> 适用于区间，但要保证条件顺序
>
> 执行流程：
>
> * 表达式1为true，则执行代码块1，再退出整个结构。
> * 表达式2为true，则执行代码块2，再退出整个结构。
> * 表达式3为true，则执行代码块3，再退出整个结构。
> * 以上均为false，则执行代码块4，再退出整个结构。

> 下面举几个例子

```java
//1、导包
import java.util.Scanner;
public class TestMultIf1{
	public static void main(String[] args){
		/*
		某游戏对不同等级的积分的玩家赋予不同的荣誉称号，其对应关系如下：
		积分>=10000分为钻石玩家
		积分>=5000并且<10000为白金玩家
		积分>=1000并且<5000为青铜玩家
		积分<1000为普通玩家。
		小编现在是有7200分，请在代码编辑器中完善代码，看一下小编是什么级别的玩家。
		*/
		//2、创建Scanner
		Scanner input=new Scanner(System.in);
		//3、接收数据
		System.out.println("请输入小编的积分数：");
		int score=input.nextInt();
		//4、处理数据
		/*
		if(score>=10000){
			System.out.println("钻石玩家");
		}
		
		if(score>=5000&&score<10000){//5000<=score<10000
			System.out.println("白金玩家");
		}
		*/
		if(score>=10000){
			System.out.println("钻石玩家");
		}else if(score>=5000){//5000<=score<10000
			System.out.println("白金玩家");
		}else if(score>=1000){
			System.out.println("青铜玩家");
		}else if(score<1000){
			System.out.println("普通玩家");
		}
		System.out.println("程序结束");
	}
}
```

### 嵌套if选择结构

```java
语法：
if(外层表达式){
if(内层表达式){
//内层代码块1
}else{
//内层代码块2
}
}else{
//外层代码块
}
```

> 执行流程：
> 当外层条件满⾜时，再判断内层条件。

> 下面举几个例子

```java
//1、导包
import java.util.Scanner;
public class TestNestIf{
	public static void main(String [] args){
		/*
		   判断用户输入的性别，如果是女生，
		   然后再输入年龄，如果年龄大于18则输出“女士你好，”，
		   否则输出“小姐姐你好”,
		   如果是男生，直接输出“帅哥你好”。
		   只有String比较内容是否相同使用.equals()

		*/
		//2、创建Scanner
		Scanner input=new Scanner(System.in);
		//3、接收数据
		System.out.println("请输入您的性别：");
		String sex=input.next();
		//4、处理数据
		if("女".equals(sex)){
			//System.out.println("女生你好");
			System.out.println("请输入您的年龄");
			int age=input.nextInt();
			if(age>18){
				System.out.println("女士你好");
			}else{
				System.out.println("小姐姐你好");
			}
		}else if("男".equals(sex)){
			System.out.println("帅哥你好");
		}else{
			System.out.println("请慎重输入您的性别");
		}
		System.out.println("程序结束");
	}
}
```

if和else后面只有一条语句时，可以省略后面的{}，但不建议这么写

> 完成今日的整理思维导图

未完待续...