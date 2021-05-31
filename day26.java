 //mkdir
 
 import java.util.*;
 public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=Integer.parseInt(sc.nextLine());
            String[] str=new String[n];
            for(int i=0;i<n;i++){
                str[i]=sc.nextLine();
            }
            Arrays.sort(str);
            List<String> list=new ArrayList<>();
            for(int i=1;i<n;i++){
                if(!str[i].startsWith(str[i-1]+"/")){
                    list.add(str[i-1]);
                }
            }
            list.add(str[n-1]);
            for(int i=0;i<list.size();i++){
                System.out.println("mkdir -p "+list.get(i));
            }
            System.out.println();
        }
    }

}