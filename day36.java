//������ݺ��·��жϸ����ж�����

import java.util.Scanner;
  public class Demo08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ݺ��·ݣ�");
       int year=sc.nextInt();
       int mon=sc.nextInt();
       if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
       {
    	   System.out.println("31��");
       }else if(mon==4||mon==6||mon==9||mon==11)
       { System.out.println("30��");
        }
       else
       {if(year%4==0&&year%100!=0||year%400==0)
       {System.out.println("29��");
       }else {
    	   System.out.println("28��");
    	   sc.close();
       }
       }
}}