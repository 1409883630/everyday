//求整数1~100的累加值，但要求跳过所有个位为3的数
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
