//NC156 ������ֻ����һ�ε���������������k�Σ�
//����һ������Ϊ  ����������  ��һ������  ��
//��֪  ��ֻ�� 1 ��������һ�Σ���������������  �Ρ�
//�뷵��ֻ������ 1 �ε�����
import java.util.*;

public class Solution {
    public int foundOnceNumber (int[] arr, int k) {
        // write code here
        Arrays.sort(arr);
      for(int i = 0; i<arr.length-1; i++){
          if(arr[i]==arr[i+1]){
              i += k-1;
          }else{
              return arr[i];
          }
 
      }
      return arr[arr.length-1];
    }
}