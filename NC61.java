//NC61 ����֮��
//����һ���������� numbers ��һ��Ŀ��ֵ target�������������ҳ���������������Ŀ��ֵ������
//������ĺ���twoSum ��Ҫ�������������ֵ��±꣨index1��index2����ɵ����飬
//��Ҫ���� index1 С��index2.��ע�⣺�±��Ǵ�1��ʼ��
//��֤������������ֻ����Ψһ�⡣
import java.util.*;
public class Solution {
    /**
     * 
     * @param numbers int����һά���� 
     * @param target int���� 
     * @return int����һά����
     */
    public int[] twoSum (int[] numbers, int target) {
        // write code here
         for(int i = 0; i<numbers.length; i++){
             for(int j = i+1; j<numbers.length; j++){
                 if(numbers[i] + numbers[j] == target){
                     return new int[]{i+1, j+1};
                     
    }
      }
         }
         return new int[0];
    }
     }