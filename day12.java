//С�׵�����֮·
import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0;
            //С����a��
            for(int i=1;i<=a;i++){
                c=sc.nextInt();
                b=ss(b,c);
            }
            System.out.println(b);
        }
    }
    //С�׺͹���ս������
    public static int ss(int a,int b){
        if(a>=b){
            a=a+b;
        }else{
            a=a+aa(a,b);
        }
        return a;
    }
    //���Լ������
    public static int aa(int a,int b){
       while(b!=0){
           int k=a%b;
           a=b;
           b=k;
        }
        return a;
    }
}