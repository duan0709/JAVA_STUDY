package com.duan.day08.oop.encapsulation;
/**
 * ��װ�Ĳ���
 * 1�������Ա��˽�еģ������ⲻ�ܷ��ʡ��������ȼ�private���Ρ�
 * 2�����get����ȡ����set�����ã�����
 */
public class TestStudent {
	public static void main(String[] args) {
		
		//��������
		Student xm = new Student();
		//��������
		xm.setName("С��");
		xm.setAge(16);
		xm.setSex("��");
		xm.setScore(98.5);
		
		//���ʷ���
		xm.show();
		
		Student xh = new Student("С��",5555,"hhh",199.0);
		xh.show();
	}
}
