 //¿ÍËÆÔÆÀ´
 import java.util.*;
 public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            System.out.println(ss(from,to));
        }
    }
    public static long ss(int from, int to) {
        long[] a = new long[81];
        a[0] = 0;
        a[1] = 1;
        for(int i=2;i<=80;i++){
            a[i]=a[i-1]+a[i-2];
        }
        long sum=0;
        for(int i=from;i<=to;i++){
            sum=sum+a[i];
        }
        return sum;
    }
	}