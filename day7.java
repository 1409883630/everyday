//超长正整数相加
import java.math.BigInteger;
import java.util.*;

public class Test {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt()){
        String a=sc.next();
        String b=sc.next();
        BigInteger s1=new BigInteger(a);
        BigInteger s2=new BigInteger(b);
        System.out.println(s1.add(s2));
    }
}
}