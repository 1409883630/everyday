//������1~100���ۼ�ֵ����Ҫ���������и�λΪ3��������ʹ��forѭ��ʵ�֣�

import java.util.Scanner;
public class Demo03 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			int a=i%10;
			if(a!=3) {
				System.out.println(i);
				sum +=i;
			}
		}
		System.out.println(sum);
	   
} 
	}