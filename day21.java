// 剪花布条


 import java.util.*;
 public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s= sc.next();
            String t= sc.next();
            System.out.println(ss(s,t));
        }
    }
    public static int ss(String s1,String s2){
        int n=0;

        for(int i=0;i<=s1.length()-s2.length();i++){
            int j=i+s2.length();
            if(s1.substring(i,j).equals(s2)){
                n++;
                i=j-1;
            }
        }
        return n;
  }
 }
