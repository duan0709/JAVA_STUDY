package com.duan.day03;

public class demo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  ��ӡ����������
		  *
		  ***
		  *****
		  *******
		  *********
		  i    j
		  1    1
		  2    3
		  3    5
		  4    7
		  ####*
		  ###***
		  ##*****
		  #*******
		  *********
		*/
		int rows=5;
		for(int i=1;i<=rows;i++){//���ѭ����������
		    //��ӡ�ո񣨵����ǣ�
			for(int j=rows-1;j>=i;j--){//4 3 2 1  4>=2
				System.out.print(" ");
			}
		    //��ӡ*
			for(int j=1;j<=2*i-1;j++){//�ڲ�ѭ����������
			   System.out.print("*");	   	
			}
			//����
			System.out.println();
		}
	}

}
