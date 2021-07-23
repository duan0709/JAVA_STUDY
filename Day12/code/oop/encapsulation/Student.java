package com.duan.day08.oop.encapsulation;
/**
 * 学生类
 */
public class Student {
	//属性
	private String name;
	private int age;
	private String sex;
	private double score;
	
	//构造方法
	public Student() {
		
	}
	//全参构造
	public Student(String name, int age, String sex, double score) {
		this.name = name;
		this.setAge(age);
		this.setSex(sex);;
		this.setScore(score);;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if (age > 0 && age < 140) {
			this.age = age;			
		}else {
			System.out.println("请输入正确的年龄");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setSex(String sex) {
		if ("男".equals(sex) || "女".equals(sex)) {
			this.sex = sex;			
		}else {
			System.out.println("请输入性别为男或女");
		}
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setScore(double score) {
		if (score > 0.0 && score < 100.0) {
			this.score = score;			
		}else {
			System.out.println("请输入成绩在0~100分之间");
		}
	}
	
	public double getScore() {
		return score;
	}
	//方法
	public void show() {
		System.out.println("大家好，我的名字是："+name+",年龄是："+age+",性别是："+sex+",成绩是："+score);
	}
	
}
