//�ҳ��ַ����е�һ��ֻ����һ�ε��ַ�

public static void ss(String str) {
        for (int i = 0; i < str.length(); i++) {
            String a = str.substring(0, i) + str.substring(i+1);
            int b = a.indexOf(str.charAt(i));
            if (b == -1) {
                String c = String.valueOf(str.charAt(i));
                System.out.println(c);
                break;
            }
        }