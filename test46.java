//���˲²²£���Ϸ�������һ��0~99������0��99�������֣�Ȼ���������ʲô����

import java.util.Scanner;
public class Demo08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=(int)(Math.random()*100);
		for(int count=1;count<=20;count++) {
			System.out.println("���������µ����֣�");
			int sum=sc.nextInt();
			if(sum>r) {
				System.out.println("�´��ˣ�");
			}else if(sum<r) {
				System.out.println("��С�ˣ�");
			}else {
				System.out.println("�¶��ˣ�");
			}
		}
	}
}