//ͳ���ַ������Ӵ����ֵĴ���
//�������������ַ��� str �� substr��ͳ���ַ��� substr �� �ַ��� str �г��ֵĴ������������  
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String substr = sc.nextLine();
        int a=ss(str,substr);
        System.out.println(a);
}
     public static int ss(String str,String substr){
         int count=0;
         int i=0;
         while(str.indexOf(substr,i)!=-1){
             count++;
             i=str.indexOf(substr,i)+substr.length();
            
         }
          return count;
}
}