
//ʵ��һ���γ����ƺͿγ̴��ŵ�ת����

import java.util.Scanner;
public class Demo01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum;
		int a;
		do {
			System.out.println("����γ̴��룺");
			sum=sc.nextInt();
			switch(sum)
			{
			case 1:System.out.println("1��ʹ��Java�����������߼�");break;
			case 2:System.out.println("2��ʹ��HTML���Կ�����ҵվ��");break;
			case 3:System.out.println("3��ʹ��SQL Server����Ͳ�ѯ����");break;
			case 4:System.out.println("4��ʹ��C#�������ݿ�Ӧ�ó���");break;
			}
			System.out.println("�Ƿ������0-�˳�ϵͳ");
			a=sc.nextInt();
		}while(a!=0);
		sc.close();
}
}