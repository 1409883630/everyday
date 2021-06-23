  //快到碗里来。
  import java.util.*;
  public class Test {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()) {
            Double n = sc.nextDouble();
            Double r = sc.nextDouble();
            if (n <= 6.28 * r) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
	}
