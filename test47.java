//��������
 public static String toString(long[] array) {
        // ����
        String ans = "[";

        // ���� ���� ���һ��Ԫ��֮�����������Ԫ��
        for (int i = 0; i < array.length - 1; i++) {
            long element = array[i];

            ans = ans + element + ", ";
        }

        // �����һ��Ԫ����ӵ��ַ��� ans ��
        // ���������һ��Ԫ�ص��±��� array.length - 1
        // ˼�� array.length ��ȡֵ��Χ�Ƕ��� >= 0
        if (array.length > 0) {
            long lastElement = array[array.length - 1];
            ans = ans + lastElement;
        }

        ans = ans + "]";

        return ans;
    }