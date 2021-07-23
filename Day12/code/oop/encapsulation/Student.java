package com.duan.day08.oop.encapsulation;
/**
 * ѧ����
 */
public class Student {
	//����
	private String name;
	private int age;
	private String sex;
	private double score;
	
	//���췽��
	public Student() {
		
	}
	//ȫ�ι���
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
			System.out.println("��������ȷ������");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setSex(String sex) {
		if ("��".equals(sex) || "Ů".equals(sex)) {
			this.sex = sex;			
		}else {
			System.out.println("�������Ա�Ϊ�л�Ů");
		}
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setScore(double score) {
		if (score > 0.0 && score < 100.0) {
			this.score = score;			
		}else {
			System.out.println("������ɼ���0~100��֮��");
		}
	}
	
	public double getScore() {
		return score;
	}
	//����
	public void show() {
		System.out.println("��Һã��ҵ������ǣ�"+name+",�����ǣ�"+age+",�Ա��ǣ�"+sex+",�ɼ��ǣ�"+score);
	}
	
}
