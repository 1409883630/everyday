//统计每个月兔子的总数
import java.util.*;
public class Test {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt()){
        int a = sc.nextInt();
        System.out.println(ss(a));
    }
}
public static int ss(int x){
    int sum;
    if(x>=4){
        sum=ss(x-1)+ss(x-2);
    }
    else if(x==3){
        sum=2;
    }
    else{
        sum=1;
    }
    return sum;
}
}