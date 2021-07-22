package com.duan.day07;

/*
写一个Worker类，并创建多个Worker 对象：
10.1 为Worker类添加三个属性：
10.1.1 String类型的name，表示工人的姓名。
10.1.2 int类型的age，表示工人的年龄。
10.1.3 double类型的salary，表示工人的工资。
10.2 为Worker 类添加两个构造方法：
10.2.1 公开无参构造方法。
10.2.2 接受三个参数的构造方法，三个参数分别为字符串、int 和double 类型。
10.3 为Worker类添加两个work方法：
10.3.1 无参构造方法
10.3.2 带整数参数构造方法，表示工人工作的时间（为多少小时）。
 */
public class Worker {
	// Worker类添加三个属性
	String name;
	int age;
	double salary;
	// 公开无参构造方法
	public Worker() {
	}
	// 接受三个参数的构造方法
	public Worker(String a, int b, double c/* String name,int age,souble salary */) {
		/*
		 * this.name = name; this.age = age; this.salary = salary;
		 */
		name = a;
		age = b;
		salary = c;
	}
	// 无参work方法
	public void work() {
	}
	// 带参work方法
	public void work(int hour) {
		System.out.println("共工作" + hour + "小时");
	}
	public void print() {
		System.out.println("员工名字是：" + name + "\t" + "年龄" + age + "\t" + "月薪水是：" + salary);
	}

}
