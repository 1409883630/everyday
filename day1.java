//����С������
//������A��������B����С��������ָ�ܱ�A��B��������С��������ֵ
//���һ���㷨��������A��B����С������
public class Main{
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int c=min(n,m);
        //��С��������=��������ٳ����������
        int sum=(n*m)/c;
        System.out.println(sum);
    }

    //���һ������������������������������
    public static int min(int a, int b) {
        if(a==b){
            return a;
        }
        else if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        //շת��������������
       while(b!=0){
           int k=a%b;
           a=b;
           b=k;
       }
       return a;
    }
}