//最长公共子序列
import java.util.*;
public class Main{
   public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.next();
            String s2=sc.next();
            System.out.println(ss(s1,s2));
        }
    }
    public static int ss(String s1,String s2){
        if(s1==null || s2==null){
            return -1;
        }
        int [][] str=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    str[i][j]=str[i-1][j-1]+1;
                }else{
                    str[i][j]=str[i][j-1]>str[i-1][j]?str[i][j-1]:str[i-1][j];
                }
            }
        }
        return str[s1.length()][s2.length()];
    }
}
