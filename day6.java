  //��ȫ������
 import java.util.*;

public class Test {
 
  public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
        System.out.println(count(sc.nextInt()));
        }
    }
    public static int count(int n) {
        int count=0;
		//���ѭ�������������1������������м�����ȫ��
        for(int j=1;j<=n;j++) {
            int sum = 0;
			//���ѭ�����ж��ǲ�����ȫ����������Թ�Լ��Ȼ�����
            for (int i = 1; i < j ;i++) {
                if (j % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == j) {
                count++;
            }
        }
        return count;
    }
}