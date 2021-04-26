//查找组成一个偶数最接近的两个素数

import java.util.*;
public class Main{
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int n1 = 0, n2 = 0;// 记录最接近素数对
            for (int i = num / 2; i > 2; i--) {
                if (fun(i)) {
                    if (fun(num - i)) {
                        n1 = i;
                        n2 = num - i;
                        break;
                    }
                }
            }
            System.out.println(n1);
            System.out.println(n2);
        }
        sc.close();
    }

    public static boolean fun(int n) {
        boolean b = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                b = false;
                break;
            }
        }
        return b;
    }
}