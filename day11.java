//反转字符串
import java.uitl.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(ss(s));
    }
//StringBuffer中的reverse方法。
    public static String ss(String s) {
        StringBuffer a = new StringBuffer(s);
        String b = a.reverse().toString();
        return b;
    }
}