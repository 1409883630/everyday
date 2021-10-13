//复制部分字符串
//键盘输入一个长度不大于30的字符串，再输入一个正整数 m，
//将此字符串中从第 m 个字符开始的剩余全部字符复制成为另一个字符串，
//并将这个新字符串输出。要求用指针处理字符串。
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