package com.duan.day04;

public class TestFunction4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ǰ���¹�");
        printSign(9,'#');
        System.out.println("���ǵ���˪");
        printSign(9,'-');
        System.out.println("��ͷ������");
        printSign(9,'+');
        System.out.println("��ͷ˼����");
        printSign(9,'*');
	}
	//����һ����ӡcount��������ŵĹ���
	public static void printSign(int count,char sign) {
		for (int i = 1; i <= count; i++) {
			System.out.print(sign);
		}
		System.out.println();
	}

}
