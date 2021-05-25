

//ì³²¨ÄÇÆõ·ïÎ²
import java.util.*;

public class Test {
    static int []a=new int[100001];
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ss(a.length);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n<25){
                System.out.println(a[n]);
            }else{
                System.out.println(String.format("%06d",a[n]));
            }
        }
    }
    public static void ss(int n){
        a[0]=1;
        a[1]=1;
        int i=2;
        while(i<n){
            a[i]=(a[i-1]+a[i-2])%1000000;
            i++;
        }

    }
}