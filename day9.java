//��̨��
//һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
//�����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
public class Solution {
    public int jumpFloor(int target) {
if(target <=0 )
    return 0;
        if(target <= 2) 
            return target;
        int n1 = 1;
        int n2 = 2;
        int res = 0;
        for(int i = 3;i <= target;i++) {
            res = n1 + n2;
            n1 = n2;
            n2 = res;
        }
        return res;
    }
}
