# Day2.1

环境搭建完成后，开始进行java的学习。

* JavaSE、JavaEE、JavaME了解
* C/S架构和B/S架构的了解
* Java运行机制

计算机中的执行机制有**编译执行**（不跨平台，效率高。源文件翻译成机器码的二进制文件，只编译一次生成目标文件，再运行无需进行编译）和**解释执行**（跨平台，效率低。在具体的环境中，不产生目标程序，将源代码逐条转换成目标代码同时逐条执行）。java结合两种运行机制，**先编译再解释**，将其编译成字节码文件，然后解释执行。具有跨平台，效率高的优点。

* JVM、JRE和JDK区别和联系

JVM（Java Virtual Machine）java虚拟机

JRE（Java Runtime Environment）java运行环境【包括JVM和解释器】

JDK（Java Development Kit）java开发环境【包括JRE+类库+开发工具包】

* 第一个java应用程序

```java
class Helloworld{
    public static void main(String[] args){
        System.out.print("Hello Java");
    }
}
//class 类 public 公共的 static 静态的 void 无返回值的 main 主方法 String 字符串 System 系统类 out 输出 print 打印 String[] args 字符串数组args
```

进行编译：javac 源文件名称.java

运行：java 类名

* 类的阐述

同一个源文件中可以定义多个类

编译后，每个类都会生成独立的.class文件

一个类中，只能有一个主方法，每个类都可以有自己的主方法

public修饰的类称为公开类，要求类名必须与文件名完全相同，包括大小写。

一个源文件中，只能有一个公开（public）类

* 包的阐述

作用：类似于文件夹，用于管理字节码（class）文件。为生成的字节码文件生成前缀进而加以区分可能出现同名的.class文件，达到文件管理区分的效果

语法：package 包名（小写）

位置：必须写在源文件第一行

带包编译：javac -d.源文件名称.java（自动生成目录结构）

带包运行：java 包名.类名（全限定名）

采用域名倒置规则

* 注释

```java
//单行注释

/*多行注释*/

/**文档注释（生成api文档）一般加在文档或类上边。外部文档注释（⽣成外部⽂档：javadoc -d . HelloWorld.java）*/
```



* java的语言规范了解

* 课程之外

DOS常见命令

```dos
更换盘符：盘符:
查看当前目录下的文件及文件夹：dir
进入文件夹：cd 文件夹名称
返回上一级：cd..
返回根目录：cd/
清空屏幕：cls
删除文件：del 文件名称
删除文件夹：rd 文件夹名称
退出：exit
```

