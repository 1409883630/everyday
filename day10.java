//��ˮƿ
//������һ�������⣺��ĳ�̵�涨����������ˮƿ���Ի�һƿ��ˮ��С��������ʮ������ˮƿ��
//�������Ի�����ƿ��ˮ�ȣ�������5ƿ���������£�����9����ƿ�ӻ�3ƿ��ˮ��
//�ȵ�3ƿ���ģ������Ժ�4����ƿ�ӣ���3���ٻ�һƿ���ȵ���ƿ���ģ���ʱ��ʣ2����ƿ�ӡ�
//Ȼ�������ϰ��Ƚ����һƿ��ˮ���ȵ���ƿ���ģ�
//�����Ժ���3����ƿ�ӻ�һƿ���Ļ����ϰ塣
//���С��������n������ˮƿ�������Ի�����ƿ��ˮ�ȣ�
import java.util.Scanner;
public class Main{
public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       while(sc.hasNextInt()){
           int n=sc.nextInt();
           if(n!=0){
               System.out.println(ss(n));
           }
       }
   }
   public static int ss(int n){
       int a=0;
       while(n>2){
           a=a+n/3;
           n=n/3+n%3;
       }
       if(n==2){
           a=a+1;
       }
       return a;
   }
}