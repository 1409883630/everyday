//发邮件
 
import java.util.*;
 public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
           long[]a=new long[21];
           a[0]=0;
           a[1]=1;
           for(int i=2;i<=20;i++){
               a[i]=i*(a[i-1]+a[i-2]);
           }
            System.out.println(a[n-1]);
            }
        }
 }
