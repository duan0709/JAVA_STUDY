package com.duan.day08.oop.keyword;
/**
 * ��ʦ��
 */
public class Teacher {
	//����������
	String name;
	int age;
	String sex;
	double salary;
	
	//���췽��
	public Teacher() {
		
	}
	
	
	public Teacher(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		System.out.println("Teacher�����ι���");
	}
	
	public Teacher(String name, int age, String sex,double salary) {
		/*
		 * this.name = name; this.age = age; this.sex = sex; this.salary = salary;
		 */
		//�������η���
		this(name,age,sex);
		this.salary = salary;
		System.out.println("Teacher���Ĳι���");
	}


	//��Ϊ������
	public void show() {
		System.out.println("��Һã��ҵ������ǣ�"+name+",�����ǣ�"+age+",�Ա��ǣ�"+sex+",н���ǣ�"+salary);
	}
}
