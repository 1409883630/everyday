

//A,B,C�������Ǻ�����,ÿ�������ﶼ��һЩ�ǹ�,���ǲ�֪������ÿ�������Ͼ����ж��ٸ��ǹ�,��������֪�����µ���Ϣ��
//A - B, B - C, A + B, B + C. ���ĸ���ֵ.ÿ����ĸ����ÿ������ӵ�е��ǹ���.
//������Ҫͨ�����ĸ���ֵ�����ÿ���������ж��ٸ��ǹ�,��A,B,C�����ﱣ֤���ֻ��һ������A,B,C������������������

//��������:
//����Ϊһ�У�һ��4���������ֱ�ΪA - B��B - C��A + B��B + C���ÿո������ 
//��Χ����-30��30֮��(������)��

//�������:
//���Ϊһ�У�����������������A��B��C��˳�����A��B��C���ÿո��������ĩ�޿ո� 
//�������������������A��B��C�������No

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNextInt()) {
            int y1 = sca.nextInt();
            int y2 = sca.nextInt();
            int y3 = sca.nextInt();
            int y4 = sca.nextInt();


            int A = (y1 + y3) / 2;
            int B = (y2 + y4) / 2;
            int C = B - y2;
            if ((y1 + y3) % 2 == 0 && (y2 + y4) % 2 == 0 && (A+B) == y3) {
                System.out.println(A + " " + B + " " + C);
            } else {
                System.out.println("No");
            }
        }
    }
}