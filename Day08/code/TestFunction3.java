package com.duan.day04;

public class TestFunction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ǰ���¹�");
		int a = 9;
        printSign(a);
        //printSign(9);Ҳ��
        System.out.println("���ǵ���˪");
        printSign(8);
        System.out.println("��ͷ������");
        printSign(7);
        System.out.println("��ͷ˼����");
        printSign(6);
	}
	//����һ����ӡcount��-�Ĺ���
	public static void printSign(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
