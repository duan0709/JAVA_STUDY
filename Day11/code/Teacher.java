package com.duan.day07;

public class Teacher {
	   
	//����������  ʵ������
	String name;
	int age;
	String sex;
	double salary;
	//���췽��
	public Teacher() {
		System.out.println("Teacher�޲ι��췽��ִ����");
	}
	public Teacher(String name) {
		System.out.println("Teacher(name)���췽��ִ����");
	}
	public Teacher(String name,int age) {
		System.out.println("Teacher(name,age)���췽��ִ����");
	}
	public Teacher(String name,int age,String sex) {
		System.out.println("Teacher(name,age,sex)���췽��ִ����");
	}
	public Teacher(String name,int age,String sex,double salary) {
		System.out.println("Teacher(name,age,sex,salary)���췽��ִ����");
	}
	//��Ϊ������
	public void show() {
		System.out.println(name+"\t"+age+"\t"+sex+"\t"+salary);
	}
}

