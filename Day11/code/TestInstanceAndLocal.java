 package com.duan.day07;

public class TestInstanceAndLocal {

	public static void main(String[] args) {
		//�������� ������;
		//������ = ֵ;
		
		//�ֲ�����
		int a = 10;
		System.out.println(a);
 
		Cat cat =new Cat();
		System.out.println(cat.breed);//null
		System.out.println(cat.age);//0
		System.out.println(cat.sex);//null
 
		cat.show();
	}

}
class Cat {
		//ʵ������
		String breed;
		int age;
		String sex;
		
		public void show() {
			String breed = "��˹è";
			System.out.println(breed);
		}
}
 