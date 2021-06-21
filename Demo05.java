
//输入一个正整数，将该数的各位左右反转输出
import java.util.Scanner;
public class Demo05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int num=sc.nextInt();
		int number=0;
		while(number <=0){
			int a=num%10;
			int b=num/100;
			int c=num%100/10;
			number=a*100+c*10+b;
			System.out.println(number);
		}
		
}
}