//因子的个数
公开 课 测试{
    公共 静态 void 主（String [] args）{
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(ss(n));
        }
    }
    public static int ss(int n){
        int count=0;
        for(int i=2;i<Math.sqrt(n);i++){
            boolean a=false;
            while(n%i==0){
                n=n/i;
                count++;
            }
            if(n==1){
                break;
            }
        }
        if(n!=1){
            count++;
        }
        return count;
    }
	}
