//末尾0的个数
//输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
import java.util.*;
public class Main{
	
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(bb(n));
}

    public static int bb(int n) {
    int count = 0;
    while (n != 0) {
        count += n / 5;
        n = n / 5;
    }
    return count;
}
}
由于0的来源是2 和5 ，
但是在所有的数中以2为因数的数较多，所有在这里我们只需要考虑因子5的个数就行。