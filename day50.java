 //�����г��ִ�������һ�����
   
    public static int MoreThanHalfNum_Solution(int[] array) {
        if(array.length==0){
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            int n = array.length;
            int count = 0;//ͨ���жϳ��ִ��������
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return array[i];
            }
        }
       return 0;
    }