//输入一个5位数，判断是不是回文
import java.util.Scanner;
public class Demo07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入5位数：");
		int num=sc.nextInt();
		int a=(num/10000);
		int b=(num%10);
		int c=(num%100/10);
		int d=(num%10000/1000);
		 if(a==b&&c==d)
		{
			 System.out.println("是回文数");
		}
		 else
		 {
			 System.out.println("不是回文数");
			 sc.close();
		 }
        }
}