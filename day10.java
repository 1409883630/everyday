//汽水瓶。
//有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，
//她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，
//喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
//然后你让老板先借给你一瓶汽水，喝掉这瓶满的，
//喝完以后用3个空瓶子换一瓶满的还给老板。
//如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
import java.util.Scanner;
public class Main{
public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       while(sc.hasNextInt()){
           int n=sc.nextInt();
           if(n!=0){
               System.out.println(ss(n));
           }
       }
   }
   public static int ss(int n){
       int a=0;
       while(n>2){
           a=a+n/3;
           n=n/3+n%3;
       }
       if(n==2){
           a=a+1;
       }
       return a;
   }
}
