package com.duan.day08.oop.range;
/**
 * private
 * ���ʱ���
 * �ĸ�����Ȩ�޷�����Ч
 */
public class TestSelfClass {
	private String a = "A";//˽�е� ��ɫ������
	String b = "B";//default Ĭ�ϵ� ��ɫ��������
	protected String c = "C";//�ܱ����� ��ɫ������
	public String d = "D";//������ ��ɫ��Բ��
	
	public void show() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this.d);
	}
}
