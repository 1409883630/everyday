
//企业发放奖金的利润提成.

import java.util.Scanner;
public class Demo11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入当月利润：");
		int lirun=sc.nextInt();
		double sal=0;
		if(lirun<=10) {
			sal=0.1*lirun;
		}else if(lirun<=20) {
			sal=0.1*10+(lirun-10)*0.075;
		}else if(lirun<=40) {
			sal=0.1*10+10*0.75+(lirun-20)*0.05;
		}else if(lirun<=60) {
			sal=0.1*10+10*0.075+20*0.05+(lirun-40)*0.03;
		}else if(lirun<=100) {
			sal=0.1*10+10*0.075+20*0.05+20*0.03+(lirun-60)*0.015;
		}else  {
			sal=0.1*10+10*0.075+20*0.05+20*0.03+40*0.015+(lirun-100)*0.01;
		}
		System.out.println(sal);
		sc.close();
}
}
