//NC41 ����ظ�������
//����һ������arr������arr������ظ�Ԫ��������ĳ��ȣ����ظ�ָ�����������ֶ�����ͬ��
//�������������ģ�����[1,3,5,7,9]����������[1,3]��[3,5,7]�ȵȣ�����[1,3,7]����������
import java.util.*;
public class Solution {
    public int maxLength (int[] arr) {
        // write code here
        LinkedList<Integer> list = new LinkedList<>();
        int p=0, ans=0;
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])){
                int j=list.indexOf(arr[i]);
                while (j-->=0){
                    list.removeFirst();
                }
            }
            list.add(arr[i]);
            ans=Math.max(ans,list.size());
        }
        return ans;
    }
}