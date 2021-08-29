//NC88 Ѱ�ҵ�K��
//��һ���������飬������ݿ��������˼·���ҳ������е� �������
import java.util.*;

public class Solution {
    public int findKth(int[] a, int n, int K) {
        // write code here
        //����ѡ���㷨
        quickSort(a, 0, n - 1, K);
        return a[K - 1];
    }
    //�Ӵ�С����
    private void quickSort(int[] arr, int left, int right, int k){
        if(left >= right){
            return;
        }
        int i = left, j = right;
        int tem = arr[left];
        //���ź��Ĳ��ִ���
        while(i < j){
            while(i < j && arr[j] <= tem){
                j--;
            }
            while(i < j && arr[i] >= tem){
                i ++;
            }
            swap(arr, i, j);
        }
        swap(arr, left, j);
        //�����ж�
        if(k - 1 > j){
            quickSort(arr, j + 1, right, k);
        }else if(k - 1 < j){
            quickSort(arr, left, j - 1, k);
        }else{
            return;
        }
    }
     
    private void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}