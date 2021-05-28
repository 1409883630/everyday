//年会抽奖

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n >= 2 && n <= 20) {
                double a = ss(n);
                double b = aa(n);
                double c = (a / b) * 100;
                System.out.println(String.format("%.2f",c)+"%");
            } else {
                break;
            }
        }
    }
    public static double ss(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        //´íÅÅ
            return (n - 1) * (ss(n - 1) + ss(n - 2));
    }
    public static double aa(int n) {
        if (n == 1) {
            return 1;
        }
           return n * aa(n - 1);
    }
}
