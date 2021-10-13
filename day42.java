//统计字符串中子串出现的次数
//键盘输入两个字符串 str 和 substr，统计字符串 substr 在 字符串 str 中出现的次数，并输出。  
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