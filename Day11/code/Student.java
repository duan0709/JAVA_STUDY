package com.duan.day07;
/**
 * ����ѧ����
 * ���ԣ�������name�������䣨age�����Ա�sex����������score��
 * ���������к� sayHi()//��ӡѧ��������Ϣ
 */
public class Student {

	//����������
	String name;
	int age;
	String sex;
	double score;
	
	//��Ϊ������
	public void sayHi() {
		System.out.println("��Һã��ҵ�������"+name+"������"+age+"����"+"�Ա�"+sex+"�ɼ��ǣ�"+score);
	}
}
