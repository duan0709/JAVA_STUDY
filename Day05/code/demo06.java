package com.duan.day03;

public class demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����1~100֮�䣬����ż���ĺ�
        /*
        int i = 0;
        int sum = 0;
        while(i <= 100){
            if(1 % 2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("����"+sum);
        System.out.println("�������");
        */
        int i = 0;
        int sum = 0;
        while(i <= 100){
            sum += i;
            i += 2;
        }
        System.out.println("���ǣ�"+sum);
        System.out.println("�������");
	}

}
