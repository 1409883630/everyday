
 //解读密码
 import java.util.*;
 public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            String s=sc.nextLine();
             String count ="";
            int n=s.length();
            for(int i=0;i<n;i++){
                if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    count=count + s.charAt(i);
                }
            }
            System.out.println(count);
        }
    }
 }
