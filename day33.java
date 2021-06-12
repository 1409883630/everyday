//ºÏ³ªÍÅ
import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int[]a=new int[n+1];
            for(int i=1;i<=n;i++){
                a[i]=sc.nextInt();
            }
            int b=sc.nextInt();
            int c=sc.nextInt();
            long[][] max=new long[b+1][n+1];
            long[][] min=new long[b+1][n+1];
            long res=Integer.MIN_VALUE;
            for(int i=1;i<=n;i++){
                max[1][i]=a[i];
                min[1][i]=a[i];
                for(int i1=2;i1<=b;i1++){
                    for(int j=i-1;j>0&&i-j<=c;j--){
                        max[i1][i]=Math.max(max[i1][i],Math.max(max[i1-1][j]*a[i],min[i1-1][j]*a[i]));
                        min[i1][i]=Math.min(min[i1][i],Math.min(max[i1-1][j]*a[i],min[i1-1][j]*a[i]));
                    }
                }
                res=Math.max(res,max[b][i]);

            }
            System.out.println(res);
        }
    }

}