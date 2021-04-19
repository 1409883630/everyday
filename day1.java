//求最小公倍数
//正整数A和正整数B的最小公倍数是指能被A和B整除的最小的正整数值
//设计一个算法，求输入A和B的最小公倍数
public class Main{
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int c=min(n,m);
        //最小公倍数数=两数相乘再除以最大公因数
        int sum=(n*m)/c;
        System.out.println(sum);
    }

    //设计一个方法，计算出两个数的最大公因数；
    public static int min(int a, int b) {
        if(a==b){
            return a;
        }
        else if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        //辗转相除法求最大公因数
       while(b!=0){
           int k=a%b;
           a=b;
           b=k;
       }
       return a;
    }
}