//输入一个正整数，计算它在二进制下的1的个数
//注意多组输入输出！！！！！！
import java.util.*;
public class Main{
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         while (sc.hasNextInt()){
             System.out.println(find1(sc.nextInt()));
         }
    }
    public static int find1(int sum){
        int ret=0;
        while(sum!=0){
            if(sum%2==1){
                ret++;
            }
            sum=sum/2;
        }
        return ret;
    }
}
