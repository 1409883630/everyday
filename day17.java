//猴子分桃
import java.util.Scanner;
public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = 0;
        while(sc.hasNext()){
            n = sc.nextInt();
            if(n == 0)
                break;
            long a = (long)Math.pow(5, n);
            long b = (long)Math.pow(4, n);
            System.out.println((a-4)+" "+(b-4+n));
        }
    }
}
