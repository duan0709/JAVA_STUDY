package com.duan.day08.oop.keyword;
/**
 * ѧ����
 */
public class Student {
	//���������� ʵ������
	String name;
	int age;
	String sex;
	double score;
	
	//���췽��
	public Student() {
		
	}
	public Student(String name,int age,String sex,double score) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
	}
	
	//��Ϊ������ ʵ������
	public void show() {
		System.out.println("��Һã��ҵ������ǣ�"+name+",�����ǣ�"+age+",�Ա��ǣ�"+sex+",�ɼ��ǣ�"+score);
	}
	
	public void read() {
		this.show();
		System.out.println("�Ķ�...");
	}
}
