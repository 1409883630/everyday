//n��m��ˮ�ɻ���
//����n,m�����֮���ˮ�ɻ�����û�о����no
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m>=100&&n<=1000) {
                for (int i = m; i <= n; i++) {
                    int a, b, c;
                    a = i / 100;
                    b = (i / 10) % 10;
                    c = i % 100;
                    if (a * a * a + b * b * b + c * c * c == i) {
                        System.out.println(i);
                    }else if(i==n){
                        System.out.println("no");
                    }
                    }
                }else{
                System.out.println("�����뷶Χ�ڵ�����");
            }
            }
        }