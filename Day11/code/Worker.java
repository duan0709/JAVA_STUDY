package com.duan.day07;

/*
дһ��Worker�࣬���������Worker ����
10.1 ΪWorker������������ԣ�
10.1.1 String���͵�name����ʾ���˵�������
10.1.2 int���͵�age����ʾ���˵����䡣
10.1.3 double���͵�salary����ʾ���˵Ĺ��ʡ�
10.2 ΪWorker ������������췽����
10.2.1 �����޲ι��췽����
10.2.2 �������������Ĺ��췽�������������ֱ�Ϊ�ַ�����int ��double ���͡�
10.3 ΪWorker���������work������
10.3.1 �޲ι��췽��
10.3.2 �������������췽������ʾ���˹�����ʱ�䣨Ϊ����Сʱ����
 */
public class Worker {
	// Worker�������������
	String name;
	int age;
	double salary;
	// �����޲ι��췽��
	public Worker() {
	}
	// �������������Ĺ��췽��
	public Worker(String a, int b, double c/* String name,int age,souble salary */) {
		/*
		 * this.name = name; this.age = age; this.salary = salary;
		 */
		name = a;
		age = b;
		salary = c;
	}
	// �޲�work����
	public void work() {
	}
	// ����work����
	public void work(int hour) {
		System.out.println("������" + hour + "Сʱ");
	}
	public void print() {
		System.out.println("Ա�������ǣ�" + name + "\t" + "����" + age + "\t" + "��нˮ�ǣ�" + salary);
	}

}
