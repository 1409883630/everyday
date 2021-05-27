// ÑøÍÃ×Ó
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            long[] a = new long[91];
            a[0] = 1;
            a[1] = 2;
            for (int i = 2; i <= 90; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
            System.out.println(a[n - 1]);
        }
    }
}