//ĩβ0�ĸ���
//����һ��������n,��n!(���׳�)ĩβ�ж��ٸ�0�� ����: n = 10; n! = 3628800,���Դ�Ϊ2
import java.util.*;
public class Main{
	
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(bb(n));
}

    public static int bb(int n) {
    int count = 0;
    while (n != 0) {
        count += n / 5;
        n = n / 5;
    }
    return count;
}
}
����0����Դ��2 ��5 ��
���������е�������2Ϊ���������϶࣬��������������ֻ��Ҫ��������5�ĸ������С�