package com.duan.day07;
/**
 * ������
 */
public class TestDog {

	public static void main(String[] args) {
		//�������� ������ = ֵ;
		//1��������Dog��Ķ��󣬲�����洢��dog1������
		Dog dog1 = new Dog();
		
		//2����������
		//������.������ = ֵ; ��ֵ
		dog1.breed = "��Ħ";
		dog1.age = 2;
		dog1.sex = "��";
		dog1.furClolor = "��ɫ";
		dog1.num = 007;
		
		//3���������� ȡֵ
		//������.������
		System.out.println(dog1.breed + "\t" + dog1.age + "\t" +dog1.sex + "\t" +dog1.furClolor + "\t" +dog1.num + "\t");
		
		//4�����ʷ���
		//������.������
		dog1.eat();		
		dog1.sleep();
		
		
		
		
		//�����ڶ���Dog�����
		Dog dog2 = new Dog();
		
		//��ֵ
		dog2.breed = "��԰Ȯ";
		dog2.age = 1;
		dog2.sex = "��";
		dog2.furClolor = "�ڰ�";
		dog2.num = 996;
		
		//�������� ���
		System.out.println(dog2.breed + "\t" + dog2.age + "\t" + dog2.sex + "\t" + dog2.furClolor + "\t" + dog2.num + "\t");
		
		
		//���ʷ��� ��Ϊ
		dog2.eat();
		dog2.sleep();
		
	}

}
