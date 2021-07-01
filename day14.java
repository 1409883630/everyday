//数根。
import java.util.*;
public class Main{
  public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            while(str.length()>1){
                int count=0;
                for(int i=0;i<str.length();i++)
                    count+=str.charAt(i)-'0';
                str=String.valueOf(count);
            }
            System.out.println(str);
        }
    }
}
