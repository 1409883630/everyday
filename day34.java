//����Ļ�ϴ�ӡ��n�еĽ�����ͼ��
import java.util.Scanner;
public class Demo06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������������:");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}