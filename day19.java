//分解因数
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.print(n+" "+"= ");
            int a=2;
            while (a<=n){
                if(a==n){
                    System.out.println(n);
                    break;
                }else if(n%a==0){
                    System.out.print(a+" * ");
                    n=n/a;
                }else{
                    a++;
                }
            }
    }
 }
}
