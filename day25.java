//数据库连接池。
import javca.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a = 0;
            int b = 0;
            if (n >= 1 && n <= 1000) {
                for (int i = 0; i < n; i++) {
                    String id = sc.next();
                    String disconnect = sc.next();
                    if (disconnect.equals("connect")) {
                        a++;
                        if (b < a) {
                            b = a;
                        }
                    } else {
                        a--;
                    }
                }
                System.out.println(b);
            }
        }
    }
