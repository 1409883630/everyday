 //单词倒排
 import java.util.*;
 public class Main{
	    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        String[] arr=a.split("[^a-zA-Z]+");
        List<String> list=Arrays.asList(arr);
        Collections.reverse(list);
        String b=String.join(" ",list);
        System.out.println(b);
    }
	 
 }
