//����һ�����������������ڶ������µ�1�ĸ�����
//ע������������������������
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
