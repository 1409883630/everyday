//����һ��5λ�����ж��ǲ��ǻ���
import java.util.Scanner;
public class Demo07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����5λ����");
		int num=sc.nextInt();
		int a=(num/10000);
		int b=(num%10);
		int c=(num%100/10);
		int d=(num%10000/1000);
		 if(a==b&&c==d)
		{
			 System.out.println("�ǻ�����");
		}
		 else
		 {
			 System.out.println("���ǻ�����");
			 sc.close();
		 }
        }
}