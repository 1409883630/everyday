  /完全数计算。
 导入 java。实用程序。* ;

public class Test {
 
  public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
        System.out.println(count(sc.nextInt()));
        }
    }
    public static int count(int n) {
        int count=0;
		//这个循环是输入的数从1往后遍历，看有几个完全数
        for(int j=1;j<=n;j++) {
            int sum = 0;
			//这层循环是判断是不是完全数，算出所以公约数然后相加
            for (int i = 1; i < j ;i++) {
                if (j % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == j) {
                count++;
            }
        }
        return count;
    }
}
