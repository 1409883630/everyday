//���Ʋ����ַ���
//��������һ�����Ȳ�����30���ַ�����������һ�������� m��
//�����ַ����дӵ� m ���ַ���ʼ��ʣ��ȫ���ַ����Ƴ�Ϊ��һ���ַ�����
//����������ַ��������Ҫ����ָ�봦���ַ�����
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(ss(s,n));
    }
    public static String ss(String s,int n){
        String v = s.substring(n-1);
        return v;
    }
}