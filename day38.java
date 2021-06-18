
//实现一个课程名称和课程代号的转换器

import java.util.Scanner;
public class Demo01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum;
		int a;
		do {
			System.out.println("输入课程代码：");
			sum=sc.nextInt();
			switch(sum)
			{
			case 1:System.out.println("1号使用Java语言理解程序逻辑");break;
			case 2:System.out.println("2号使用HTML语言开发商业站点");break;
			case 3:System.out.println("3号使用SQL Server管理和查询数据");break;
			case 4:System.out.println("4号使用C#开发数据库应用程序");break;
			}
			System.out.println("是否继续？0-退出系统");
			a=sc.nextInt();
		}while(a!=0);
		sc.close();
}
}