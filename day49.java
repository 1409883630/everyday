// ��������������
    //ţţ��������������Ϊһ��������һ��������������,��������������Ƿǵ������߷ǵݼ�����ġ�
    // ţţ��һ������Ϊn����������A,��������һ�������ǰ�����A��Ϊ���ɶ�����������,
    // ţţ��֪�������ٿ��԰���������Ϊ��������������.
    //��������ʾ,ţţ���԰�����A����Ϊ[1,2,3]��[2,2,1]��������������,
    // ������Ҫ����Ϊ2������������,�������2
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            // ��һ����־������
            int flag = 0;
            int count = 1;// ͳ���ܹ����ֵ�����ĸ���
            for (int i = 1; i < n; i++) {
                if (nums[i] > nums[i - 1]) {// ���������flag==1��ʾ�����������κζ���
                    if (flag == 0) {
                        flag = 1;
                    }

                    if (flag == -1) {// �ɵݼ��������count��1
                        flag = 0;
                        count++;
                    }
                } else if (nums[i] < nums[i - 1]) {// �ݼ������flag==-1����ʾ�ݼ��������κζ���
                    if (flag == 0) {
                        flag = -1;
                    }

                    if (flag == 1) {// ��ʱ�е�����ݼ�����Ҫcount��1
                        flag = 0;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }