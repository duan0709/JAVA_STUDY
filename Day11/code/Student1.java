package com.duan.day07;

public class Student1 {

	//����:���� ʵ������
	String name;
	int age;
	String sex;
	double score;
	
	//���췽��
	public Student1() {
		//B.���췽��ִ�зֳ�����
		//1.��ʼ������
		//2ִ�й��췽���е��߼�����
		System.out.println("���췽��ִ����");
	}
//	//     new Student("С��", 15, "Ů", 99.0);
	public Student1(String n,int a,String s,double c) {
		name=n;
		age=a;
		sex=s;
		score=c;
	}
	
	//��Ϊ:����
	public void sayHi() {
		System.out.println("��Һã��ҵ������ǣ�"+name+",�����ǣ�"+age+",�Ա��ǣ�"+sex+",�ɼ��ǣ�"+score+"�֡�");
	}
}

