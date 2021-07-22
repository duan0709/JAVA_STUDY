package com.duan.day07;

/**
 *1. new Student()作用？
 *   实例一个对象
 *   Student()构造方法
 *2.如何定义构造方法？
 *  语法：
 *    访问权限符   类名(){
 *    
 *    }
 *    注意：不写返回值类型
 * 3构造方法如何调用？
 *    new 类名();
 * 4.构造方法的作用？
 *   A.构造对象
 *   B为属性赋值
 *
 */
public class TestStudent1 {
	public static void main(String[] args) {
		
		//创建对象
		//A.执行new Student构建对象  堆中开辟空间
		//C.将构造方法的内存地址赋给引用变量
		Student1 xm=new Student1();
		
		xm.name="小明";
		xm.age=16;
		xm.sex="男";
		xm.score=98.5;
		
		xm.sayHi();
		
		Student1 xh=new Student1("小红", 15, "女", 99.0);
		xh.sayHi();
		
		
	}
}

