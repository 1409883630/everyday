 //Ä¢¹½Õó
 
 import java.util.*;
 public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int [][]array=new int[a+1][b+1];
            double [][] nums=new double[a+1][b+1];
            int [][]array1=new int[c][2];
            for(int i=0;i<c;i++){
                for(int j=0;j<2;j++){
                    array1[i][j]=sc.nextInt();
                }
                array[array1[i][0]][array1[i][1]]=-1;
            }
            nums[1][1]=1.0;
            for(int i=1;i<=a;i++){
                for (int j=1;j<=b;j++){
                    if(array[i][j]!=-1){
                        if(i==1&&j==1){
                            continue;
                        }
                        if(i==a&&j<b){
                            nums[i][j]=nums[i][j-1]+nums[i-1][j]/2;
                        }
                        if(i<a&&j==b){
                            nums[i][j]=nums[i-1][j]+nums[i][j-1]/2;
                        }
                        if(i<a&&j<b){
                            nums[i][j]=nums[i-1][j]/2+nums[i][j-1]/2;
                        }
                        if(i==a&&j==b){
                            nums[i][j]=nums[i-1][j]+nums[i][j-1];
                        }
                    }
                }
            }
            System.out.printf("%3.2f\n",nums[a][b]);
        }
    }
}