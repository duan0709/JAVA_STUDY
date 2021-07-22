package com.duan.day07;
/**
 * 测试类
 * 把学生对象放入数组中进行遍历
 */
public class TestStudent {
	public static void main(String[] args) {
		//创建多个学生对象
		Student xm = new Student();
		
		//为其各个属性进行赋值
		xm.name = "小明";
		xm.age = 18;
		xm.sex = "男";
		xm.score = 80;
		
		//并调用方法
		//对象名.方法名();
		xm.sayHi();
		
		
		Student xh = new Student();
	
		xh.name = "小红";
		xh.age = 18;
		xh.sex = "女";
		xh.score = 88;
		
		xh.sayHi();
		
		System.out.println("=====================");
		//数组定义方式
		//数据类型 [] 数组名 = new 数据类型 [长度];
		/*
		int[] nums = new int[2];
		nums[0] = a;
		nums[1] = 22;
		
		Student[] stus = new Student[2];
		stus[0] = xm;
		stus[1] = xh;
		*/
		//数据类型 [] 数组名 = new 数据类型[]{value1,value2,...};
		/*
		int[] nums = new int[] {a,22};
		Student [] stus = new Student[] {xm,xh};
		*/
		//数据类型 [] 数组名 = {value1,value2,...};
		/*
		int nums = {a,22};
		Student[] stus = {xm,xh};
		*/
		Student[] stus= {xm,xh};
		/*
		for (int i = 0; i < stus.length; i++) {
			stus[i].sayHi();
		}
		*/
		/*
		 * 遍历数组
		for (Student num : nums) {
			System.out.println(num);//11,12
		}
		*/
		//把学生对象放入数组中并进行遍历
		for (Student stu : stus) {
			//xm.sayHi();
			stu.sayHi();
		}
	}
}
