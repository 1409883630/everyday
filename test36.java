import java.util.Scanner;
//求斐波那契数列的第n项。(迭代实现)
public class Test{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=Feibo(n);
System.out.println(“sum=”+sum);
sc.close();
}
public static int Feibo(int n){
int sum=0;
if(n1||n2){
sum=n;
}int a=1;int b=1;
for(int i=3;i<=n;i++){
sum=a+b;
a=b;
b=sum;
}return sum;
}
}
