//输入有多个测试用例，每个测试用例第一行为一个整数n，表示阶数，
    // 接下来是n行的数字，每行n个数字用孔隔开
    //输出：输出一个整数，表示N阶方式的和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                ans += x;
            }
        }
        System.out.println(ans);
    }