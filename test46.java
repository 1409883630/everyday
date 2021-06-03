//幸运猜猜猜：游戏随机给出一个0~99（包括0和99）的数字，然后让你猜是什么数字

import java.util.Scanner;
public class Demo08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=(int)(Math.random()*100);
		for(int count=1;count<=20;count++) {
			System.out.println("请输入您猜的数字：");
			int sum=sc.nextInt();
			if(sum>r) {
				System.out.println("猜大了！");
			}else if(sum<r) {
				System.out.println("猜小了！");
			}else {
				System.out.println("猜对了！");
			}
		}
	}
}