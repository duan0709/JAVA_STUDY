package com.duan.day08.oop.keyword;

public class TestStudent {
	public static void main(String[] args) {
		
		//ʵ������
		Student xm = new Student();
		//�������� ��ֵ
		//������.������ = ֵ;
		xm.name = "С��";
		xm.age = 18;
		xm.sex = "��";
		xm.score = 98.5;
		//���ʷ���
		//������.������();
		
		xm.read();
		
		
		//��������
		Student xh = new Student("С��",18,"Ů",99);
		
		xh.read();
	}
}
